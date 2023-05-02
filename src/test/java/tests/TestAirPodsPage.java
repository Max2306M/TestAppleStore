package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class TestAirPodsPage extends BaseTest {

    private static final String HOME_PAGE_URL = "https://www.apple.com/";

    @Test
    public void testairpods() throws InterruptedException {
        get(HOME_PAGE_URL);
        sleep(2000);

        WebElement element = driver.findElement(By.xpath("//ul[@class='globalnav-submenu-trigger-group']//a[@href='/airpods/']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        sleep(2000);
        driver.findElement(By.xpath("//a[@data-analytics-title='shop airpods']")).click();
        sleep(2000);

        assert driver.getCurrentUrl().equals("https://www.apple.com/shop/accessories/all/headphones-speakers?f=apple-overear-sport&fh=47d1%2B3214%2B45aa%2B45ab&page=1");

        scrollToElement(driver.findElement(By.xpath("//*[@id='root']/div/div/div/div[2]/div[2]/section/div[2]")));
        driver.findElement(By.xpath("//a[@data-evar11='MGYN3|category']")).click();
        sleep(2000);
        driver.findElement(By.xpath("//div[@class='rc-dimension-multiple form-selector-swatch column large-6 small-6 form-selector'][1]")).click();
        scrollToElement(driver.findElement(By.xpath("//h2[@class='rf-engraving-section-header']")));
        sleep(2000);
        driver.findElement(By.xpath("//div[@class='rf-flagship-engraving']//div[@class='rc-dimension-selector-row form-selector'][2]")).click();
        scrollToElement(driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[4]/div[1]/div/div[4]/div/div/div[1]")));
        sleep(2000);
        driver.findElement(By.xpath("//div[@class='rc-summary-button-box']//button[@class='button button-block']")).click();
        sleep(2000);

        assert driver.getCurrentUrl().equals("https://www.apple.com/shop/buy-airpods/airpods-max?bfil=2&product=MGYH3AM/A&purchaseOption=fullPrice&step=attach");

        sleep(2000);
        driver.quit();
    }
}

