package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomeEntertainmentPage;
import pages.HomePage;

import static java.lang.Thread.sleep;

public class TestEntertainmentPage extends BaseTest {
    private static final String HOME_PAGE_URL = "https://www.apple.com/";

    @Test
    public void testEntertaimentPage() throws InterruptedException {
        get(HOME_PAGE_URL);

        HomeEntertainmentPage homeEntertainmentPagePagePage = new HomeEntertainmentPage(driver);
        HomeEntertainmentPage.getEntertainmentButton().click();
        HomeEntertainmentPage.getAppleMusicButton().click();
        HomeEntertainmentPage.getAppleMusicGetButton().click();
        sleep(2000);

        Assert.assertEquals(driver.getCurrentUrl(), "https://music.apple.com/subscribe");

        driver.quit();
    }
}
