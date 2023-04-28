package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;
import static org.testng.Assert.assertTrue;

public class TestHeaderMenu extends BaseTest {

    @Test(priority = 1)
    public void checkHomePage() throws InterruptedException {
        driver.get("https://www.apple.com/shop/bag");
        sleep(2000);

        assertTrue(driver.findElement(By.xpath("//footer[@id='apple-footer']")).isDisplayed());

        WebElement element = driver.findElement(By.xpath("//*[@id='globalnav-list']/li[2]/div/div/div[1]/ul/li[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        sleep(2000);
        driver.findElement(By.xpath("//*[@id='globalnav-submenu-link-store']/div/div/div[1]/ul/li[1]/a")).click();

        assertTrue(driver.findElement(By.xpath("//div[@class='column large-8 small-12 rs-shop-header-section']")).isDisplayed());

        driver.findElement(By.xpath("//a[@href='/shop/buy-mac']")).click();

        assertTrue(driver.findElement(By.xpath("//div[@class='column large-8 small-12 rs-shop-header-section']")).isDisplayed());

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        driver.findElement(By.xpath("//a[@href='/shop/buy-mac/macbook-air/m1-chip']")).click();

        assertTrue(driver.findElement(By.xpath("//div[@class='rs-bundleselection-header']")).isDisplayed());

        driver.quit();
    }

}

