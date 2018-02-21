package BJSS.Steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

import static BJSS.Utils.ClickAndHover.DoubleClickElement;
import static BJSS.Utils.LauchBrowser.returnDriver;

public class AddItemToCartStepDef {
    WebDriver dr = returnDriver();

    @When("^I click on Add to cart button$")
    public void i_click_on_Add_to_cart_button() throws Throwable {

        Set<String> win = dr.getWindowHandles();
        String parent = dr.getWindowHandle();
        dr.switchTo().defaultContent();
        //win.remove(parent);
        Iterator<String> it = win.iterator();
        String child="";

        while(it.hasNext()){
            child=(String)it.next();
            dr.switchTo().window(child);
            Thread.sleep(6000);
            DoubleClickElement("//*[@id='add_to_cart'']/button/span",dr);
        }
        //DoubleClickElement("//*[@id='add_to_cart'']/button/span",dr);
    }

    @Then("^the item is successfully added to the shopping cart$")
    public void the_item_is_successfully_added_to_the_shopping_cart() throws Throwable {

    }

}
