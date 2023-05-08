package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BandFilterPage;

import static java.lang.Thread.sleep;
import static javax.swing.UIManager.get;
import static org.testng.Assert.assertTrue;

public class TestBandFilter extends BaseTest {
    private static final String HOME_PAGE_URL = "https://www.apple.com/";

    @Test
    public void TestBandFilter() throws InterruptedException {
        get(HOME_PAGE_URL);
        BandFilterPage bandFilterPage = new BandFilterPage(driver);
        bandFilterPage.moveToAccessories(bandFilterPage.moveToAccessories());
        bandFilterPage.getAppleWatchButton().click();
        bandFilterPage.getShopBandsButton().click();
        scrollToElement(bandFilterPage.ScrollFilterPage());
        bandFilterPage.getFilterButton().click();
        bandFilterPage.getSizeButton().click();
        bandFilterPage.getCollectionButton().click();
        bandFilterPage.getBandTypeButton().click();
        bandFilterPage.getColorButton().click();
        sleep(2000);
        scrollToElement(bandFilterPage.scrollToBandSportLoop());

        assertTrue(bandFilterPage.getBandBlueSportLoop().isDisplayed());

        bandFilterPage.getSkySportLoop().click();

        driver.quit();

    }
}
