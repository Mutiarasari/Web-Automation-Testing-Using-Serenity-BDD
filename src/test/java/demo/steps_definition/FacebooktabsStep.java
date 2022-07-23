package demo.steps_definition;
import demo.pages.base.page_object.Facebooktabpages;
import io.cucumber.java.en.*;
import org.junit.Assert;


public class FacebooktabsStep {
    Facebooktabpages FB = new Facebooktabpages();

    @And("user scroll to buttom page")
    public void userScrollToButtomPage(){
        FB.scrollDown();
    }
    @And("user click facebook")
    public void userClickFacebook(){
        FB.BtnFacebook();
    }
    @And ("user move to tab")
    public void userMoveToTab(){
        FB.MoveToTab();
    }
    @Then("user can validate url tittle")
    public void userCanValidateUrlTittle(){
        System.out.println("Tittle = " + FB.getTittleFacebook());
        Assert.assertEquals(FB.getTittleFacebook(),"Sauce Labs - Home | Facebook");
    }
}
