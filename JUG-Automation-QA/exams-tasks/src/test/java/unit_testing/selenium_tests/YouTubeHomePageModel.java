package unit_testing.selenium_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YouTubeHomePageModel {
    private WebDriver webDriver;

    public static By LOCATOR_COOKIES_ACCEPTOR = By
            .xpath("//*[@id=\"content\"]" +
            "/div[2]/div[6]/div[1]/ytd-button-renderer[2]/yt-button-shape/button");

    public static By LOCATOR_SEARCH_FIELD = By.xpath("//input[@id='search']");

    public static By LOCATOR_SEARCH_ICON = By.id("search-icon-legacy");

    public YouTubeHomePageModel(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void navigate() {
        webDriver.get("https://www.youtube.com/");
    }

    public void cookiesAcceptor() throws InterruptedException {
        webDriver.findElement(LOCATOR_COOKIES_ACCEPTOR).click();
        Thread.sleep(3000);
    }

    public void search(String text) {
        webDriver.findElement(LOCATOR_SEARCH_FIELD).sendKeys(text);
        webDriver.findElement(LOCATOR_SEARCH_ICON).click();
    }
}
