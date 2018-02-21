package BJSS.Steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

import static BJSS.Pages.LoginPage.*;
import static BJSS.Pages.ShoppingPage.TShirtsMenu;
import static BJSS.Utils.ClickAndHover.hoverAndClickElement;
import static BJSS.Utils.LauchBrowser.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class QuickViewStepDef {

    WebDriver dr = returnDriver();

    @Given("^I am on the shopping website$")
    public void i_am_on_the_shopping_website() {
        goToUrl();
    }

    @Given("^And I click on the sign in link$")
    public void and_I_click_on_the_sign_in_link() {
        loginLink(dr).click();
    }

    @When("^I enter the following login details$")
    public void i_enter_the_following_login_details(DataTable arg)  {
        loginDetails(arg);
        fieldUserName(dr).sendKeys(returnUserName());
        fieldPassWord(dr).sendKeys(returnPassWord());
        signIn(dr).click();
    }

    @Then("^I am on the my account page$")
    public void i_am_on_the_my_account_page()  {
    assertEquals(getCurrentUrl(dr),"http://automationpractice.com/index.php?controller=my-account");
    }

    @When("^I click on T-Shirts$")
    public void i_click_on_T_Shirts()  {
        TShirtsMenu(dr).click();
    }

    @When("^I am on the category page$")
    public void i_am_on_the_category_page() {
        assertEquals(getCurrentUrl(dr),"http://automationpractice.com/index.php?id_category=5&controller=category");
    }

    @When("^I hover and click on quick view on a displayed item$")
    public void i_hover_on_a_displayed_item()  {
        hoverAndClickElement("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img",dr);
    }


    @Then("^a detailed view of the item is displayed$")
    public void a_detailed_view_of_the_item_is_displayed()  {
        Set<String> win = dr.getWindowHandles();
        String parent = dr.getWindowHandle();
        dr.switchTo().defaultContent();
      //  win.remove(parent);
        Iterator<String> it = win.iterator();
        String child="";

        while(it.hasNext()){
            child=(String)it.next();
            dr.switchTo().window(child);
            assertTrue(dr.findElement(By.id("image-block")).isDisplayed());
        }




    }

}
