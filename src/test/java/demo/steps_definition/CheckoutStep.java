package demo.steps_definition;
import demo.pages.base.page_object.CheckoutPages;
import demo.pages.base.page_object.LoginPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CheckoutStep extends LoginPages{
    CheckoutPages CP = new CheckoutPages();

    @When("user inpt {string} and {string}")
    public void userInptStandard_userAndSecret_sauce(String username,String password){
        CP.inputUsername1(username);
        CP.inputPassword1(password);
    }
    @And("user click login")
    public void userClickLogin(){
        CP.clickButtonLogin1();
    }
    @Then("user can Loggedin")
    public void userCanLoggedin(){
        CP.isSuccessLogin1();
    }
    @And("user click add cart")
    public void userClickAddCart(){
        CP.clickCart();
    }
    @Then("user can see the shopping cart being added")
    public void userCanSeeTheShoppingCartBeingAdded(){
        CP.cartAdded();
    }
    @And ("user inpt {string} and {string} and {string}")
    public void userInptFirstnameAndLastnameAnd34567(String firstname, String lastname, String Postal){
        CP.inputFirstname(firstname);
        CP.inputLastName(lastname);
        CP.inputPostal(Postal);
    }
    @And ("user click continue button")
    public void userClickContinueButton(){
        CP.clickCheckOut();
    }
    @Then("user can see checkout overview")
    public void userCanSeeCheckoutOverview(){
        CP.coOverview();
    }
    @And ("user click finish button")
    public void userClickFinishButton(){
        CP.BtnContinue();
    }
    @Then("user can see checkout")
    public void userCanSeeCheckout(){
        CP.clickCoBtn();
    }

}
