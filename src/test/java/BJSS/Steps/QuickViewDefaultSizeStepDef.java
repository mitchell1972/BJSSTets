package BJSS.Steps;

import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

import static BJSS.Utils.LauchBrowser.returnDriver;

public class QuickViewDefaultSizeStepDef {
    WebDriver dr = returnDriver();

    @Then("^the defaulf size is displayed$")
    public void the_defaulf_size_is_displayed() throws Throwable {

    }


}
