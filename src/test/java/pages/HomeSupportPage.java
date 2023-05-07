package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeSupportPage extends BasePage {

    public HomeSupportPage(WebDriver driver) {super(driver);}

    private static final String HOME_SUPPORT_BUTTON ="//div[@data-analytics-element-engagement='globalnav hover - support']";
    private static final String SEARCH_INPUT ="//input[@id='as-search-input']";
    private static final String SEARCH_APPLE_SERVICE ="//*[@id='as-search-quicklinks-0']/a";
    private static final String GET_SERVISE_SERVICE ="//a[@class='cta  alignment horizontal-align-center ']";
    private static final String POWER_BATTERY_BUTTON ="//li[@class='form-selector column medium-6 large-6 small-12'][1]";
    private static final String PRODUCT_WARM_BUTTON ="//label[@for='20369']";
    private static final String CONTINIE_BUTTON ="//button[@class='button submit-button button-super false']";
    private static final String HEADER_TEXT ="//div[@class='product-selected small-12']//*[contains(text(),'Apple Watch')]";
    private static final String ARTICLE_BUTTON ="//div[@class='other-solution-content'][1]";
    public WebElement getHomeSupportButton() {
        return waitUntilElementToBeClickable(HOME_SUPPORT_BUTTON);
    }
    public WebElement getSerchInput() {
        return waitUntilElementToBeClickable(SEARCH_INPUT);
    }
    public WebElement getSerchService() {
        return waitUntilElementToBeVisible(SEARCH_APPLE_SERVICE);
    }
    public WebElement getSerchButton() {
        return waitUntilElementToBeClickable(GET_SERVISE_SERVICE);
    }
    public WebElement getPowerBatteryButton() {
        return waitUntilElementToBeClickable(POWER_BATTERY_BUTTON);
    }
    public WebElement getProductWarmButton() {
        return waitUntilElementToBeClickable(PRODUCT_WARM_BUTTON);
    }
    public WebElement getContinieButton() {
        return waitUntilElementToBeClickable(CONTINIE_BUTTON);
    }

    public WebElement getHeaderText() {
        return waitUntilElementToBeVisible(HEADER_TEXT);
    }

    public WebElement getArticleButton() {
        return waitUntilElementToBeClickable(ARTICLE_BUTTON);
    }



}

