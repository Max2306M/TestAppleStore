package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomeAccessories;

import static org.testng.Assert.assertEquals;

public class TestAsseccoriesPage extends BaseTest {
    private static final String HOME_PAGE_URL = "https://www.apple.com/";

    @Test
    public void testAsseccoriesPage() throws InterruptedException {

        get(HOME_PAGE_URL);
        HomeAccessories HomeAccessories = new HomeAccessories(driver);
        HomeAccessories.moveTo(HomeAccessories.getMoveToAccessories());
        HomeAccessories.getButtonToAccessories().click();
        scrollToElement(driver.findElement(By.xpath("//*[@id='page']/div[5]/div[9]/div[1]")));
        HomeAccessories.getButtonToMagSafe().click();
        HomeAccessories.getBuyToMagSafe().click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.apple.com/shop/bag");

        driver.quit();

    }
}
