package BJSS.Steps;

import cucumber.api.java.en.Then;

import static BJSS.Utils.LauchBrowser.returnDriver;

public class CloseBrowserStepDef {



    @Then("^the window is closed$")
    public void the_window_is_closed() throws Throwable {
        returnDriver().quit();
    }
}
