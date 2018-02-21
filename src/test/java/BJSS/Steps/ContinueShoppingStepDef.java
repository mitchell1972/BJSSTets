package BJSS.Steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import static BJSS.Utils.LauchBrowser.returnDriver;

public class ContinueShoppingStepDef {
    WebDriver dr = returnDriver();

    @When("^I click on the continue shopping button$")
    public void i_click_on_the_continue_shopping_button() throws Throwable {

    }

    @Then("^the focus is returned to the category page$")
    public void the_focus_is_returned_to_the_category_page() throws Throwable {

    }


}
