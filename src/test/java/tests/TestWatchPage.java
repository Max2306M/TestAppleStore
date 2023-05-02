package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;
import static org.testng.AssertJUnit.assertTrue;

public class TestWatchPage {
    public static class testWatchPages extends BaseTest {
        private static final String HOME_PAGE_URL = "https://www.apple.com/";

        @Test
        public void testIpadPage() throws InterruptedException {
            get(HOME_PAGE_URL);
            sleep(2000);
            driver.findElement(By.xpath("//a[@href='/watch/']//span[@class='globalnav-link-text-container']")).click();
            sleep(2000);
            driver.findElement(By.xpath("//li[@class='chapternav-item chapternav-item-nike']")).click();
            sleep(2000);
            scrollToElement(driver.findElement(By.xpath("//div[@class='row-copy'][1]")));
            driver.findElement(By.xpath("//*[@id='main']/section[4]/div[1]/div/div/a")).click();
            sleep(2000);
            driver.quit();
        }
    }
}
