package base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected static WebDriver driver;

    @BeforeMethod
    public void initializeChromeDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void get(String url){
        driver.get(url);
    }

    @AfterMethod
    public void close(){
        //driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public void scrollToElement(WebDriver driver, WebElement element){
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void back(){
        driver.navigate().back();
    }

    public boolean urlContains(String urlPath){
        return driver.getCurrentUrl().contains(urlPath);
    }

}
