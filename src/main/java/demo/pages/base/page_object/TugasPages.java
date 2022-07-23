package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class TugasPages extends BasePageObject {
    public void ClickSelect(){
        By element = By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select");
        clickOn(element);
    }
//    public void Dropdown1(String value) {
//        Select Dropdown = new Select(getDriver().findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select")));
//        Dropdown.selectByValue(value);
//    }
    public void Dropdown() {
        Select Dropdown = new Select(getDriver().findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select")));
        Dropdown.selectByValue("az");
        wait(2000);
    }
    public void Btnaz(){
        By element = By.id("add-to-cart-sauce-labs-backpack");
        clickOn(element);
        wait(2000);
    }
    public void Dropdown2(){
        Select Dropdown1 = new Select(getDriver().findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select")));
        Dropdown1.selectByValue("za");
        wait(2000);
    }
    public void Btnza(){
        By element = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
        clickOn(element);
        wait(2000);
    }
    public void Dropdown3(){
        Select Dropdown2 = new Select(getDriver().findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select")));
        Dropdown2.selectByValue("lohi");
        wait(2000);
    }
    public void Btnlohi(){
        By element = By.id("add-to-cart-sauce-labs-onesie");
        clickOn(element);
        wait(2000);
    }
    public void Dropdown4(){
        Select Dropdown3 = new Select(getDriver().findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select")));
        Dropdown3.selectByValue("hilo");
        wait(2000);
    }
    public void Btnhilo(){
        By element = By.id("add-to-cart-sauce-labs-fleece-jacket");
        clickOn(element);
        wait(2000);
    }
    public void Cartbtn(){
        By element = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
        clickOn(element);
        wait(2000);
    }
    public void remove1(){
        By element = By.id("remove-sauce-labs-backpack");
        clickOn(element);
        wait(2000);
    }
    public void remove2(){
        By element = By.id("remove-test.allthethings()-t-shirt-(red)");
        clickOn(element);
        wait(2000);
    }
    public void remove3(){
        By element = By.id("remove-sauce-labs-onesie");
        clickOn(element);
        wait(2000);
    }
    public void remove4(){
        By element = By.id("remove-sauce-labs-fleece-jacket");
        clickOn(element);
        wait(2000);
    }
    public void remove5(){
        By element = By.id("continue-shopping");
        clickOn(element);
        wait(2000);
    }
    public boolean BacktoShop() {
        By element = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
        return isPresent(element);
    }



}
