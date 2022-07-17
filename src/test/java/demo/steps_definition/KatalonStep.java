package demo.steps_definition;
import demo.pages.base.page_object.KatalonPages;
import demo.pages.base.page_object.LoginPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class KatalonStep {
    KatalonPages katalonpages = new KatalonPages();

    @When("user click Appointment Button")
    public void userClickAppointmentButton(){
        katalonpages.clickBtnApp();
    }
    @And("user inputs {string} and {string}")
    public void userInputsUsernameAndPassword(String username, String password){
        katalonpages.isiUsername(username);
        katalonpages.isiPassw(password);
    }
    @And("user click login Button")
    public void userClickLoginButton(){
        katalonpages.clickBtnLogin();
    }
    @Then("user succesfully Loggedin")
    public void userSuccesfullyLoggedin(){
        katalonpages.successLogin();
    }

}
