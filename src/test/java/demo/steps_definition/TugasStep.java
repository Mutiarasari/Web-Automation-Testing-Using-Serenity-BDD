package demo.steps_definition;
import demo.pages.base.page_object.TugasPages;
import demo.pages.base.page_object.LoginPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;

public class TugasStep {
    TugasPages TP = new TugasPages();

//    @When("user click filter {string}")
//    public void userClickSearch1(String value){
//        TP.Dropdown1(value);
//    }
    @When("user click filter az")
    public void userClickFilterAz(){
        TP.Dropdown();
}
    @And ("user add cart on filter az")
    public void userAddCartOnFilterAz(){
        TP.Btnaz();
    }
    @And ("user click filter za")
    public void userClickFilterZa(){
        TP.Dropdown2();
    }
    @And ("user add cart on filter za")
    public void userAddCartOnFilterZa(){
        TP.Btnza();
    }
    @And("user click filter lohi")
    public void userClickFilterLohi(){
        TP.Dropdown3();
    }
    @And("user add cart on filter lohi")
    public void userAddCartOnFilterLohi(){
        TP.Btnlohi();
    }
    @And("user click filter hilo")
    public void userClickFilterHilo(){
        TP.Dropdown4();
    }
    @And("user add cart on filter hilo")
    public void userAddCartOnFilterHilo(){
        TP.Btnhilo();
    }
    @And("user click Cart button")
    public void userClickCartButton(){
        TP.Cartbtn();
    }
    @And("user remove first object")
    public void userRemoveFirstObject(){
        TP.remove1();
    }
    @And("user remove second object")
    public void userRemoveSecondObject(){
        TP.remove2();
    }
    @And("user remove third object")
    public void userRemoveThirdObject(){
        TP.remove3();
    }
    @And("user remove last object")
    public void userRemoveLastObject(){
        TP.remove4();
    }
    @And("user click continue")
    public void userClickContinue(){
        TP.remove5();
    }
    @Then("user back to shopping list")
    public void userBackToShoppingList(){
        TP.BacktoShop();
    }

}
