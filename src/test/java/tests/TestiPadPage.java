package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

import static java.lang.Thread.sleep;
import static javax.swing.UIManager.get;
import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class TestiPadPage extends BaseTest {
    private static final String HOME_PAGE_URL = "https://www.apple.com/";

    @Test
    public void testIpadPage() throws InterruptedException {
        get(HOME_PAGE_URL);
        sleep(2000);

        WebElement element = driver.findElement(By.xpath("//a[@data-globalnav-item-name='ipad']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        sleep(2000);
        driver.findElement(By.xpath("//a[@data-analytics-title='ipad pro']")).click();

        assertTrue(driver.findElement(By.xpath("//h1[@class='hero-headline typography-hero-headline']")).isDisplayed());

        driver.findElement(By.xpath("//a[@href='/us/shop/goto/ipad_pro/select'][1]")).click();

        assert driver.getCurrentUrl().equals("https://www.apple.com/shop/buy-ipad/ipad-pro");

        driver.findElement(By.xpath("//*[@id='root']/div[3]/div[2]/div[2]/div/div[1]/div[1]/div[1]")).click();
        driver.findElement(By.xpath("//*[@id='root']/div[3]/div[2]/div[2]/div/div[2]/div/div[1]/label")).click();
        sleep(2000);
        driver.findElement(By.xpath("//*[@id='root']/div[3]/div[2]/div[2]/div/div[3]/div[1]/div[3]")).click();
        sleep(2000);
        driver.findElement(By.xpath("//*[@id='root']/div[3]/div[2]/div[2]/div/div[4]/div[1]/div[2]")).click();
        sleep(2000);
        driver.findElement(By.xpath("//*[@id='root']/div[3]/div[2]/div[2]/div/div[5]/div/div/div/fieldset/div/div[2]")).click();
        sleep(2000);
        driver.findElement(By.xpath("//*[@id='acc_pencil']/button[2]")).click();
        sleep(3000);
        scrollToElement(driver.findElement(By.xpath("//*[@id='acc_keyboard_12_9inch']/button[3]")));
        sleep(3000);
        driver.findElement(By.xpath("//button[@data-autom='acc_keyboard_11inch_section_noaccessory']")).click();
        sleep(2000);
        driver.findElement(By.xpath("//*[@id='root']/div[3]/div[2]/div[2]/div/div[9]/div[2]/div[1]/div/section/div[1]/div/fieldset/div/div[2]")).click();
        sleep(2000);
        driver.findElement(By.xpath("//*[@id='root']/div[3]/div[2]/div[2]/div/div[10]/div/div/div/div[1]/div/div/div/fieldset/div/div[1]")).click();
        sleep(2000);
        driver.findElement(By.xpath("//div[@class='column large-12 small-12 form-selector-group'][1]")).click();
        sleep(2000);
        driver.findElement(By.xpath("//div[@class='rf-bfe-summary-button-box']")).click();
        sleep(2000);

        assert driver.getCurrentUrl().equals("https://www.apple.com/shop/buy-ipad/ipad-pro?bfil=2&ams=0&product=MP593LL/A&purchaseOption=fullPrice&step=attach");
        assertEquals(driver.findElement(By.xpath("//span[@data-autom='summaryHeaderTitle']")).getText(), "11-inch iPad Pro Wi-Fi + Cellular 512GB - Space Gray");

        driver.quit();
    }
}
