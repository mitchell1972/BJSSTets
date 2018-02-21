package BJSS.Pages;

import cucumber.api.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private static String userName = "";
    private static  String passWord = "";
    private static WebElement element = null;

    public static void loginDetails(DataTable table){
       userName =  table.raw().get(0).get(1);
       passWord = table.raw().get(1).get(1);
    }

    public static String returnUserName(){
        return userName;
    }

    public static String returnPassWord(){
        return passWord;
    }

    public static WebElement fieldUserName(WebDriver e) {
        element = e.findElement(By.id("email"));
        return element;
    }

    public static WebElement fieldPassWord(WebDriver e) {
        element = e.findElement(By.id("passwd"));
        return element;
    }

    public static WebElement loginLink(WebDriver e) {
        element = e.findElement(By.className("login"));
        return element;
    }


    public static WebElement signIn(WebDriver e) {
        element = e.findElement(By.xpath("//*[@id='SubmitLogin']/span"));
        return element;
    }

}
