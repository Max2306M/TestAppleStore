package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AirTagPage;
import pages.AppleWatchBandPage;

public class TestWatchBand extends BaseTest {

    private static final String HOME_PAGE_URL = "https://www.apple.com/";

    @Test
    public void testAirTagPage() {
        get(HOME_PAGE_URL);
        AppleWatchBandPage appleWatchBandPage = new AppleWatchBandPage(driver);
        appleWatchBandPage.moveToAccessories(appleWatchBandPage.moveToAccessories());
        appleWatchBandPage.getAppleWatchButton().click();

        final String PurpleForText = appleWatchBandPage.getPurpleFogText().getText();

        scrollToElement(appleWatchBandPage.scrollSoloLoopButton());
        appleWatchBandPage.getPurpleSoloLoopButton().click();
        scrollToElement(appleWatchBandPage.ScrollBuyButtonAppleBandPage());
        appleWatchBandPage.getAddToBagButton().click();

        Assert.assertTrue(appleWatchBandPage.getPurpleFogTextNewPage().getText().contains(PurpleForText));
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.apple.com/shop/bag");
        driver.quit();
    }
}
