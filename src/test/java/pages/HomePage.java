package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    //locators xpath ....
    //example
    private static final String BASE_XPATH = "";
    public static final String SCROLL_ELEMENT = "";


    public HomePage(WebDriver driver) {
        super(driver);
    }

    //methods

    public WebElement getInputButton(){
        return waitUntilElementToBeVisible(BASE_XPATH);
    }

    public WebElement getsafsaf(){
        return driver.findElement(By.xpath(SCROLL_ELEMENT));
    }


}
