package tests;

import base.BasePage;
import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AirTagPage;
import pages.SupportPage;

import static java.lang.Thread.sleep;

public class TestAirTagPage extends BaseTest {
    private static final String HOME_PAGE_URL = "https://www.apple.com/";

    @Test
    public void testAirTagPage() throws InterruptedException {
        get(HOME_PAGE_URL);
        AirTagPage airTagPage = new AirTagPage(driver);
        airTagPage.moveToAccessories(airTagPage.moveToAccessories());
        airTagPage.getAirTagButton().click();
        final String airTagText = airTagPage.getAirTagText().getText();
        airTagPage.getAirTagBuyButton().click();
        airTagPage.getPackAirTagButton().click();
        sleep(2000);
        airTagPage.getSkipButton().click();

        scrollToElement(airTagPage.getBuyButton());
        airTagPage.getAddtoBagButton().click();


        Assert.assertTrue(airTagPage.getAirTagTextNewPage().getText().contains(airTagText));

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.apple.com/shop/buy-airtag/airtag?product=MX532AM/A&purchaseOption=fullPrice&step=attach");
        driver.quit();
    }
}
