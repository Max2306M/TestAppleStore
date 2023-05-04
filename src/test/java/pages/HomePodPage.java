package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePodPage extends BasePage {
    public HomePodPage(WebDriver driver) {
        super(driver);
    }

    private static final String HOME_POD_BUY_BUTTON = "//a[@data-analytics-title='buy - homepod 2nd gen'][1]";
    private static final String HOME_POD_COLOR_BUTTON = "//div[@class='rc-dimension-multiple form-selector-swatch column large-6 small-6 form-selector'][1]";
    private static final String HOME_POD_APPLE_CARE_BUTTON = "//button[@id='applecare_applecareprotectionplan_open']";
    private static final String HOME_POD_ADD_CARE_BUTTON = "//button[@class='button-super form-button']";
    private static final String HOME_POD_ADD_TO_BAG_BUTTON = "//div[@class='rc-summary-button']//div[@class='as-purchaseinfo-button']";

    public WebElement getHomePodBuyButton() {
        return waitUntilElementToBeClickable(HOME_POD_BUY_BUTTON);
    }

    public WebElement getHomePodColorButton() {
        return waitUntilElementToBeClickable(HOME_POD_COLOR_BUTTON);

    }

    public WebElement getHomePodAppleCareButton() {
        return waitUntilElementToBeClickable(HOME_POD_APPLE_CARE_BUTTON);
    }

    public WebElement getHomePodAddAppleCareButton() {
        return waitUntilElementToBeClickable(HOME_POD_ADD_CARE_BUTTON);
    }

    public WebElement getHomePodAddToBag() {
        return waitUntilElementToBeClickable(HOME_POD_ADD_TO_BAG_BUTTON);
    }
}

