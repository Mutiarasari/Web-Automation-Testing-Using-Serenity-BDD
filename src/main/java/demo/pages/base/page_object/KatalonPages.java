package demo.pages.base.page_object;
import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class KatalonPages extends BasePageObject{
    public void clickBtnApp(){
        By element = By.id("btn-make-appointment");
        clickOn1(element);
    }
    public void isiUsername(String username){
        By element = By.id("txt-username");
        typeOn1(element,username);
    }
    public void isiPassw(String password){
        By element = By.id("txt-password");
        typeOn1(element,password);
    }
    public void clickBtnLogin(){
        By element = By.id("btn-login");
        clickOn1(element);
    }
    public void successLogin(){
        WebElement element = getDriver1().findElement(By.xpath("//h2[contains(text(),'Make Appointment')]"));
        element.isDisplayed();
    }

}
