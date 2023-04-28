package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class CheckMacButton extends BaseTest {
    private static final String HOME_PAGE_URL = "https://www.apple.com/shop/bag";
    private static final String NEXT_PAGE_URL = "https://safdsadasdasdasd";


    @Test
    public void checkMacButton(){
        get(HOME_PAGE_URL);
        HomePage homePage = new HomePage(driver);
        Assert.assertFalse(urlContains(HOME_PAGE_URL));

    }
}
