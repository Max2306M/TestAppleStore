package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HomePodPage;

import static java.lang.Thread.sleep;

public class TestTVHome extends BaseTest {
    private static final String HOME_PAGE_URL = "https://www.apple.com/";


    @Test
    public void testTVHome() throws InterruptedException {

        get(HOME_PAGE_URL);


        HomePage homePage = new HomePage(driver);
        homePage.moveTo(homePage.getTVHomeButton());
        homePage.getHomePodButton().click();

        HomePodPage homePodPage = new HomePodPage(driver);

        homePodPage.getHomePodBuyButton().click();
        sleep(3000);

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.apple.com/shop/buy-homepod/homepod");

        homePodPage.getHomePodColorButton().click();
        homePodPage.getHomePodAppleCareButton().click();
        homePodPage.getHomePodAddAppleCareButton().click();
        scrollToElement(driver.findElement(By.xpath("//div[@class='column large-12']")));
        homePodPage.getHomePodAddToBag().click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.apple.com/shop/buy-homepod/homepod?product=MQJ73LL/A&purchaseOption=fullPrice&step=attach");

        driver.quit();
    }
}
