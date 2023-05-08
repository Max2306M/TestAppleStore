package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AppleWatchBandPage  extends BasePage {

    public AppleWatchBandPage(WebDriver driver) {super(driver);}
    private static final String MOVE_TO_ACCESSORIES = "//a[@data-analytics-element-engagement='hover - accessories']";
    private static final String APPLE_WATCH_BUTTON = "//a[@data-analytics-title='watch accessories']";
    private static final String SCROLL_SOLO_LOOP_BUTTON = "//span[@class='as-pinwheel-pricecurrent'][1]";
    private static final String PURPLE_SOLO_LOOP_BUTTON = "//a[@data-display-name='45mm Purple Fog Braided Solo Loop - Size 6']";
    private static final String SCROLL_ELEMENT_BUY_BAND_PAGE = "//div[@class='rf-dude-quote-info typography-body-reduced']";
    private static final String ADD_TO_BAG_BUTTON = "//button[@class='button button-block']";

    private static final String PURPE_FOG_TEXT = "//a[@data-display-name='45mm Purple Fog Braided Solo Loop - Size 6']";
    private static final String PURPLE_FOG_TEXT_NEW_PAGE = "//a[@data-autom='bag-item-name'][1]";
    public WebElement moveToAccessories() {

        return waitPresenceOfElementLocated(MOVE_TO_ACCESSORIES);
    }

    public void moveToAccessories(WebElement element1) {
        moveCursor(element1);
    }
    public WebElement getAppleWatchButton(){
        return waitUntilElementToBeClickable(APPLE_WATCH_BUTTON);
    }
    public WebElement scrollSoloLoopButton(){
        return waitUntilElementToBeVisible(SCROLL_SOLO_LOOP_BUTTON);
    }
    public WebElement getPurpleSoloLoopButton(){
        return waitUntilElementToBeClickable(PURPLE_SOLO_LOOP_BUTTON);
    }
    public WebElement ScrollBuyButtonAppleBandPage(){
        return waitUntilElementToBeClickable(SCROLL_ELEMENT_BUY_BAND_PAGE);
    }
    public WebElement getAddToBagButton(){
        return waitUntilElementToBeClickable(ADD_TO_BAG_BUTTON);
    }
    public WebElement getPurpleFogText() {
        return waitUntilElementToBeVisible(PURPE_FOG_TEXT);
    }
    public WebElement getPurpleFogTextNewPage() {
        return waitUntilElementToBeVisible(PURPLE_FOG_TEXT_NEW_PAGE);
    }
}
