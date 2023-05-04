package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    //locators xpath ....
    //example
    private static final String BASE_XPATH = "//*[@id='a7f7e060-e824-11ed-ac36-3f092956acb3']";
    public static final String SCROLL_ELEMENT = "";
    public static final String HOME_POD_BUTTON = "//a[@href='/homepod-2nd-generation/']";
    public static final String TV_HOME_BUTTON = "//div[@data-analytics-element-engagement='globalnav hover - tv-home']";
    public static final String TV_AND_HOME_BUTTON = "//a[@data-globalnav-item-name='tv-home']";


    public HomePage(WebDriver driver) {
        super(driver);
    }

    //methods

    public WebElement getInputButton() {
        return waitUntilElementToBeVisible(BASE_XPATH);
    }

    public WebElement getsafsaf() {
        return driver.findElement(By.xpath(SCROLL_ELEMENT));
    }

    public WebElement getHomePodButton(){
        return waitUntilElementToBeClickable(HOME_POD_BUTTON);
    }

    public WebElement getTVHomeButton(){
        return waitPresenceOfElementLocated(TV_AND_HOME_BUTTON);
    }

    public void moveTo(WebElement element){
        moveCursor(element);
    }
}