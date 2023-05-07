package tests;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchPage;

import java.security.Key;

public class TestSerchPage extends BaseTest {
    private static final String HOME_PAGE_URL = "https://www.apple.com/";

    @Test
    public void testSearch() throws InterruptedException {
        get(HOME_PAGE_URL);
        SearchPage searchPage = new SearchPage(driver);
        searchPage.SearchButton().click();
        searchPage.InputSearch().sendKeys("apple ios");
        searchPage.InputSearch().sendKeys(Keys.ENTER);
        searchPage.LearnMoreButton().click();
        final String iostext = searchPage.Ios16Text().getText();
        Assert.assertEquals(searchPage.Ios16Text().getText(), iostext);


    }
}
