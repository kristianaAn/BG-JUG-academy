package unit_testing;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class SeleniumTest {

    @Test
    public void testGoogleSearchFunctionality() {
        WebDriver webDriver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));

        try {
            webDriver.get("https://www.google.com/");
            webDriver.findElement(By.id("L2AGLb")).click();
            webDriver.findElement(By.name("q")).sendKeys("jug.bg" + Keys.ENTER);
            String resultXPath = "//a[@href='https://jug.bg/']";
            WebElement result = wait.until(presenceOfElementLocated(By.xpath(resultXPath)));
            result.click();
        } finally {
            webDriver.quit();
        }
    }
}
