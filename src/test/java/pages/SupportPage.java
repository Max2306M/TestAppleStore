package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SupportPage extends BasePage {


    public SupportPage(WebDriver driver) {
        super(driver);
    }
    private static final String HEADER_2 = "//div[@class='selected-product-content']";
    public WebElement getHeader2() {
        return waitUntilElementToBeVisible(HEADER_2);
    }
}
