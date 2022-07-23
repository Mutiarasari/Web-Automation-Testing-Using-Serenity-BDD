package demo.pages.base.page_object;
import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;


public class Facebooktabpages extends BasePageObject{
    public void scrollToBottom(){
        scrollDown();
    }
    public void BtnFacebook(){
        By element = By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[2]/a");
        clickOn(element);
    }
    public void MoveToTab(){
        MoveToTab(1);
    }
    public String getTittleFacebook(){
        return getTittle();
    }
}
