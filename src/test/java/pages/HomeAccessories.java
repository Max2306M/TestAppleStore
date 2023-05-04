package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeAccessories extends BasePage {

    public HomeAccessories(WebDriver driver) {super(driver);}

    public static final String MOVE_ACCESSORIES_BUTTON ="//div[@data-analytics-element-engagement='globalnav hover - accessories']";
    public static final String SHOP_ALL_BUTTON ="//*[@id='globalnav-submenu-link-accessories']/div/div/div[1]/ul/li[1]/a";
    public static final String MAG_SAFE_BUTTON ="//div[@class='rs-dcm-gallery-multiitem-content']//div[@data-trigger-click=\"click [data-relatedlink='pl_main10_MHXH3']\"] ";
    public static final String MAG_SAFE_BUY_BUTTON ="//button[@id='add-to-cart']";

    public WebElement getMoveToAccessories() {
        return waitUntilElementToBeClickable (MOVE_ACCESSORIES_BUTTON);
    }
    public WebElement getButtonToAccessories() {
        return waitUntilElementToBeClickable (SHOP_ALL_BUTTON);
    }

 public WebElement getButtonToMagSafe() {
        return waitUntilElementToBeClickable (MAG_SAFE_BUTTON);
    }
    public WebElement getBuyToMagSafe() {
        return waitUntilElementToBeClickable (MAG_SAFE_BUY_BUTTON);
    }

    public void moveTo(WebElement element) {
        moveCursor(element);
    }
}
