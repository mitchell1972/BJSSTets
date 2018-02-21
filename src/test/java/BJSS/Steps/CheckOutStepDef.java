package BJSS.Steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import static BJSS.Utils.LauchBrowser.returnDriver;

public class CheckOutStepDef {
    WebDriver dr = returnDriver();

    @When("^I click on Proceed to checkout$")
    public void i_click_on_Proceed_to_checkout() throws Throwable {

    }
    @Then("^I am on the address page$")
    public void i_am_on_the_address_page() throws Throwable {

    }

    @Then("^I am on the shipping page$")public void i_am_on_the_shipping_page() throws Throwable {

    }

    @When("^I select the terms and service check box$")
    public void i_select_the_terms_and_service_check_box() throws Throwable {

    }

    @Then("^I am on the payment method page$")public void i_am_on_the_payment_method_page() throws Throwable {

    }


}
