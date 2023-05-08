package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BandFilterPage extends BasePage {

    public BandFilterPage(WebDriver driver) {super(driver);}

    private static final String MOVE_TO_ACCESSORIES = "//a[@data-analytics-element-engagement='hover - accessories']";
    private static final String APPLE_WATCH_BUTTON = "//a[@data-analytics-title='watch accessories']";
    private static final String SHOP_BANDS_BUTTON = "//a[@data-display-name='AOS: home/shop_watch/bands'][1]";
    private static final String SCROLL_FILTER = "//p[@class='t-intro dd-compact-large-18 dd-compact-small-18']";
    private static final String FILTER_BUTTON = "//span[@class='rs-wuipselect-filter-toggletext']";

    private static final String SIZE_BUTTON = "//label[@for='filter-dimensionCaseSize_41mm']";
    private static final String COLLECTION_BUTTON = "//label[@for='filter-dimensionCollection_applewatch']";
    private static final String BAND_TYPE_BUTTON = "//label[@for='filter-dimensionSpecialEdition-dimensionMaterial_fluoroelastomer']";
    private static final String BAND_COLOR_BUTTON = "//label[@class='colornav-link rc-dimension-colornav-link rf-wuipselect-filter-dimension-swatch'][1]";

    private static final String SCROLL_TO_BAND_BLUE_LOOP = "//label[@for='filter-dimensionSpecialEdition-dimensionMaterial_leather']";
    private static final String BAND_BLUE_SPORT_LOOP = "//a[@data-display-name='45mm Sky Sport Band - S/M']";

    private static final String BAND_BUTTON_CLICK = "//a[@data-display-name='45mm Sky Sport Band - S/M']";

    public WebElement moveToAccessories() {
        return waitPresenceOfElementLocated(MOVE_TO_ACCESSORIES);
    }
    public void moveToAccessories(WebElement element1) {
        moveCursor(element1);
    }
    public WebElement getAppleWatchButton() {
        return waitUntilElementToBeClickable(APPLE_WATCH_BUTTON);
    }
    public WebElement getShopBandsButton() {
        return waitUntilElementToBeClickable(SHOP_BANDS_BUTTON);
    }
    public WebElement ScrollFilterPage(){
        return waitUntilElementToBeVisible(SCROLL_FILTER);
    }
    public WebElement getFilterButton() {
        return waitUntilElementToBeClickable(FILTER_BUTTON);
    }
    public WebElement getSizeButton() {
        return waitUntilElementToBeClickable(SIZE_BUTTON);
    }
    public WebElement getCollectionButton() {
        return waitUntilElementToBeClickable(COLLECTION_BUTTON);
    }
    public WebElement getBandTypeButton() {
        return waitUntilElementToBeClickable(BAND_TYPE_BUTTON);
    }
    public WebElement getColorButton() {
        return waitUntilElementToBeClickable(BAND_COLOR_BUTTON);
    }
    public WebElement scrollToBandSportLoop() {
        return waitUntilElementToBeVisible(SCROLL_TO_BAND_BLUE_LOOP);
    }

    public WebElement getBandBlueSportLoop() {
        return waitUntilElementToBeVisible(BAND_BLUE_SPORT_LOOP);
    }
    public WebElement getSkySportLoop() {
        return waitUntilElementToBeClickable(BAND_BUTTON_CLICK);
    }
}
