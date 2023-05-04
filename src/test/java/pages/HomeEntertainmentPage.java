package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeEntertainmentPage extends BasePage {
    public HomeEntertainmentPage(WebDriver driver) {super(driver);}

    private static final String ENTERTAINMENT_BUTTON = "//a[@data-globalnav-item-name='entertainment']";
    private static final String APPLE_MUSIC_BUTTON = "//li[@class='chapternav-item chapternav-item-apple-music']//a[@data-analytics-title='apple music']";
    private static final String APPLE_MUSIC_TRY_BUTTON = "//a[@class='icon-wrapper hero-button button button-music']";

    public static WebElement getEntertainmentButton() {
        return waitUntilElementToBeClickable(ENTERTAINMENT_BUTTON);
    }
    public static WebElement getAppleMusicButton() {
        return waitUntilElementToBeClickable(APPLE_MUSIC_BUTTON);
    }
    public static WebElement getAppleMusicGetButton() {
        return waitUntilElementToBeClickable(APPLE_MUSIC_TRY_BUTTON);
    }
}
