package demo.pages.base;

import demo.utils.Constant;
import demo.webdriver.WebdriverInstance;
import demo.webdriver.WebdriverKatalon;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;
        
import static java.lang.Thread.sleep;

public class BasePageObject extends Constant {

    public WebDriver getDriver() {
        return WebdriverInstance.webdriver;
    }

    public WebDriver getDriver1() {
        return WebdriverKatalon.webdriver;
    }

    public void clickOn(By element) {getDriver().findElement(element).click();
    }

    public WebElement waitUntil(ExpectedCondition<WebElement> condition,Integer timeout){
        WebDriverWait wait = new WebDriverWait(getDriver(),timeout);
        return (WebElement) wait.until(condition);
    }
    public void wait(int wait){
        try {
            sleep(wait);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    public void clickOn1(By element) {
        waitUntil(ExpectedConditions.elementToBeClickable(element),timeout);
        getDriver1().findElement(element).click();
    }


    public void typeOn(By element, String text) {
        waitUntil(ExpectedConditions.visibilityOfElementLocated(element),timeout);
        getDriver().findElement(element).sendKeys(text);
    }

    public void typeOn1(By element, String text) {getDriver1().findElement(element).sendKeys(text);
    }

    public boolean isPresent(By element) {
        return getDriver().findElement(element).isDisplayed();
    }

    public void scrollDown(){
        wait(100);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scroll(0,350)");
    }
    public void MoveToTab(int index){
        ArrayList<String> tabs = new ArrayList(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(index));
        System.out.println(tabs);
    }
    public String getTittle(){
        wait(3000);
        return getDriver().getTitle();
    }
    public boolean isPresent1(By element) {
        return getDriver1().findElement(element).isDisplayed();
    }
}
