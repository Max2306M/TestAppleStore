package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage {


    public SearchPage(WebDriver driver) {
        super(driver);
    }

    private static final String HOME_GLASS_BUTTON = "//a[@id='globalnav-menubutton-link-search']";
    private static final String HOME_SEARCH = "//input[@class='globalnav-searchfield-input']";
    private static final String LEARN_MORE_BUTTON = "//a[@data-analytics-title='Learn more|iOS 16']";
    private static final String IOS_16_TEXT = "//div[@class='ac-ln-title']//*[contains(text(),'iOS 16')]";


    public WebElement SearchButton() {
        return waitUntilElementToBeClickable(HOME_GLASS_BUTTON);
    }
    public WebElement InputSearch() {
        return waitUntilElementToBeVisible(HOME_SEARCH);
    }

    public WebElement LearnMoreButton() {
        return waitUntilElementToBeClickable(LEARN_MORE_BUTTON);
    }

    public WebElement Ios16Text(){
        return waitUntilElementToBeVisible(IOS_16_TEXT);
    }
}
