package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

import static java.lang.Thread.sleep;
import static org.testng.Assert.assertTrue;

public class CheckMacButton extends BaseTest {
    private static final String HOME_PAGE_URL = "https://www.apple.com/";

    @Test
    public void checkMacButton() throws InterruptedException {
        get(HOME_PAGE_URL);
        HomePage homePage = new HomePage(driver);
        sleep(2000);
        driver.findElement(By.xpath("//a[@href='/mac/'][1]")).click();
        sleep(2000);
        driver.findElement(By.xpath("//*[@id='chapternav']/div/ul/li[2]/a")).click();
        sleep(2000);

        assertTrue(driver.findElement(By.xpath("//*[@id='main']/section[1]/div/div[1]/div/h1")).isDisplayed());

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)", "");
        driver.findElement(By.xpath("//a[@href='/us/shop/goto/buy_mac/macbook_pro_13'][1]")).click();
        sleep(2000);
        driver.findElement(By.xpath("//button[@data-autom='filterButton-14inch']")).click();
        sleep(1000);

        assertTrue(driver.findElement(By.xpath("//div[@data-autom='mac-product-summary-14inch-better']")).isDisplayed());

        final String select = "//h2[@id='productbundle-title-14inch-better']";
        scrollToElement(driver.findElement(By.xpath(select)));
        driver.findElement(By.xpath("//div[@data-autom='mac-product-summary-14inch-better']//button[@type='submit']")).click();
        sleep(2000);

        assertTrue(driver.findElement(By.xpath("//div[@id='root']")).isDisplayed());

        driver.findElement(By.xpath("//*[@id='root']/div[4]/div/div[2]/div/div[2]/form/button")).click();
        sleep(2000);
        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[2]/div/form/button")).click();

        assertTrue(driver.findElement(By.xpath("//*[@id='bag-content']/ol/li[1]/div/div[2]")).isDisplayed());

        driver.quit();
    }
}
