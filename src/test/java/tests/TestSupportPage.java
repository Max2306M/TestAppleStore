package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomeAccessories;
import pages.HomeSupportPage;
import pages.SupportPage;

import static java.lang.Thread.sleep;

public class TestSupportPage extends BaseTest {
    private static final String HOME_PAGE_URL = "https://www.apple.com/";

    @Test
    public void testTVHome() throws InterruptedException {

        get(HOME_PAGE_URL);
        HomeSupportPage homeSupportPage = new HomeSupportPage(driver);
        homeSupportPage.getHomeSupportButton().click();
        scrollToElement(driver.findElement(By.xpath("//div[@class='column large-11 medium-11 small-12']//h2[@class='as-heading typography-headline-reduced']")));
        homeSupportPage.getSerchInput().sendKeys("Apple Watch Service");
        homeSupportPage.getSerchService().click();
        sleep(2000);
        scrollToElement(driver.findElement(By.xpath("//div[@class='alignment horizontal-align-left vertical-align-']//img[@class=' alignment horizontal-align-center '][1]")));
        homeSupportPage.getSerchButton().click();
        final String headerText = homeSupportPage.getHeaderText().getText();
        homeSupportPage.getPowerBatteryButton().click();
        homeSupportPage.getProductWarmButton().click();
        homeSupportPage.getContinieButton().click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://getsupport.apple.com/solutions");

        SupportPage supportPage = new SupportPage(driver);

        Assert.assertEquals(supportPage.getHeader2().getText(), headerText);
        homeSupportPage.getArticleButton().click();
        sleep(2000);
        driver.quit();
    }

}
