package unit_testing;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class SeleniumYTTest {

    @Test
    public void testYouTubeSearcher() throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));

        try {
            webDriver.get("https://www.youtube.com/");
            webDriver.findElement(By.xpath ("//*[@id=\"content\"]/div[2]/div[6]/div[1]/ytd-button-renderer[2]/yt-button-shape/button")).click();
            Thread.sleep(3000);
            webDriver.findElement(By.xpath("//input[@id='search']")).sendKeys("Bulgarian Java User Group");
            webDriver.findElement(By.id("search-icon-legacy")).click();
            String resultXPath = "//*[@id=\"main-link\"]";
            WebElement result = wait.until(presenceOfElementLocated(By.xpath(resultXPath)));
            result.click();
        } finally {
            webDriver.quit();
        }
    }
}
