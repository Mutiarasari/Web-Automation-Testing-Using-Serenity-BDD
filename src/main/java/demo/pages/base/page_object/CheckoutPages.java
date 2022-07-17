package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class CheckoutPages extends BasePageObject{
    public void inputUsername1(String username) {
        By element = By.id("user-name");
        typeOn(element, username);
    }

    public void inputPassword1(String password) {
        By element = By.id("password");
        typeOn(element, password);
    }

    public void clickButtonLogin1() {
        By element = By.id("login-button");
        clickOn(element);
    }
    public boolean isSuccessLogin1() {
        By element = By.xpath("//span[contains(text(),'Products')]");
        return isPresent(element);
    }

    public void clickCart(){
        By element = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
        clickOn(element);
    }
    public boolean cartAdded(){
        By element = By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div");
        return isPresent(element);
    }
    public void clickCheckOut(){
        By element = By.id("checkout");
        clickOn(element);
    }
    public void inputFirstname(String firstname){
        By element = By.id("first-name");
        typeOn(element,firstname);
    }
    public void inputLastName(String lastname){
        By element = By.id("last-name");
        typeOn(element,lastname);
    }
    public void inputPostal(String postal){
        By element = By.id("postal-code");
        typeOn(element,postal);
    }
    public void clickContinue(){
        By element = By.id("continue");
        clickOn(element);
    }
    public void coOverview() {
        WebElement element = getDriver().findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
        element.isDisplayed();
    }
    public void clickCoBtn(){
        By element = By.id("finish");
        clickOn(element);
    }
    public void BtnContinue(){
        By element = By.id("continue");
        clickOn(element);
    }
    public void successCo() {
        WebElement element = getDriver().findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2"));
        element.isDisplayed();
    }



}
