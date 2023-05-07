package pages;

import base.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AirTagPage extends BasePage {
    public AirTagPage(WebDriver driver) {
        super(driver);
    }


    private static final String MOVE_TO_ACCESSORIES = "//a[@data-analytics-element-engagement='hover - accessories']";
    private static final String AIR_TAG_BUTTON = "//a[@data-analytics-title='airtag'][1]";
    private static final String AIR_TAG_BUY_BUTTON = "//div[@class='ac-ln-action ac-ln-action-button']//a[@data-analytics-title='buy apple airtag']";
    private static final String PACK_AIR_TAG_BUTTON = "//div[@class='rc-dimension-selector-row form-selector']//label[@class='form-selector-label'][1]";
    private static final String SKIP_BUTTON = "//div[@class='rc-dimension-selector-row form-selector']//span[@class='form-selector-left-col column large-12']";
    private static final String SCROLL_ELEMENT_BUY_ = "//div[@class='rf-dude-quote-info typography-body-reduced']";
    private static final String ADD_TO_BAG_BUTTON_ = "//button[@class='button button-block']";
    private static final String AIR_TAG_TEXT = "//a[@data-analytics-title='product index']";
    private static final String AIR_TAG_TEXT_NEW_PAGE = "//div[@class='rf-summary-header-productdesc']";

    public WebElement moveToAccessories() {

        return waitPresenceOfElementLocated(MOVE_TO_ACCESSORIES);
    }

    public void moveToAccessories(WebElement element1) {
        moveCursor(element1);
    }

    public WebElement getAirTagButton() {

        return waitUntilElementToBeClickable(AIR_TAG_BUTTON);
    }

    public WebElement getAirTagBuyButton() {
        return waitUntilElementToBeClickable(AIR_TAG_BUY_BUTTON);
    }

    public WebElement getPackAirTagButton() {
        return waitUntilElementToBeClickable(PACK_AIR_TAG_BUTTON);
    }

    public WebElement getSkipButton() {
        return waitUntilElementToBeClickable(SKIP_BUTTON);
    }
    public WebElement getAddtoBagButton() {
        return waitUntilElementToBeClickable(ADD_TO_BAG_BUTTON_);
    }

    public WebElement getBuyButton() {
        return waitUntilElementToBeVisible(SCROLL_ELEMENT_BUY_);
    }

    public void scrollToElement1(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public WebElement getAirTagText() {
        return waitUntilElementToBeVisible(AIR_TAG_TEXT);
    }
    public WebElement getAirTagTextNewPage() {
        return waitUntilElementToBeVisible(AIR_TAG_TEXT_NEW_PAGE);
    }
}