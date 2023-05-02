package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;
import static org.testng.AssertJUnit.assertTrue;

public class TestIphonePage extends BaseTest {
    private static final String HOME_PAGE_URL = "https://www.apple.com/";

    @Test
    public void testIpadPage() throws InterruptedException {
        get(HOME_PAGE_URL);
        sleep(2000);
        WebElement element = driver.findElement(By.xpath("//a[@href='/iphone/']//span[@class='globalnav-link-text-container']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        sleep(2000);
        driver.findElement(By.xpath("//a[@href='/iphone-14-pro/'][1]")).click();
        sleep(2000);

        assert driver.getCurrentUrl().equals("https://www.apple.com/iphone-14-pro/");

        scrollToElement(driver.findElement(By.xpath("//*[@id='main']/section[2]")));
        driver.findElement(By.xpath("//p[@class='section-link']//a[@href='/iphone/compare/']")).click();
        sleep(2000);

        assert driver.getCurrentUrl().equals("https://www.apple.com/iphone/compare/");

        driver.findElement(By.xpath("//button[@data-analytics-title='see all models']")).click();

        assertTrue(driver.findElement(By.xpath("//*[@id='all-models']")).isDisplayed());

        sleep(2000);
        driver.quit();
    }
}
