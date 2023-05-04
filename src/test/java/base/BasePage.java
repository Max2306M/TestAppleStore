package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class BasePage {
    protected WebDriver driver;
    protected Actions actions;
    protected static Wait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.actions = new Actions(driver);
        this.wait = new WebDriverWait(driver, Duration.ofMillis(5000));
    }

    protected WebElement waitUntilElementToBeVisible(String locator){
        return (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    protected static WebElement waitUntilElementToBeClickable(String locator){
        return (WebElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }

    protected WebElement waitPresenceOfElementLocated(String locator){
        return (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    protected void moveCursor(WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }
}
