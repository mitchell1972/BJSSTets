package BJSS.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LauchBrowser {


    private static WebDriver dr = new ChromeDriver();
   // private static WebDriver dr = new FirefoxDriver();
    public static void goToUrl(){
        System.setProperty("webdriver.gecko.driver","geckodriver.exe");
        dr.manage().deleteAllCookies();
        dr.get("http://automationpractice.com/");
        dr.manage().window().maximize();
    }


    public static String getCurrentUrl(WebDriver e){
        String currentUrl="";
        currentUrl = e.getCurrentUrl();
        return currentUrl;
    }

    public static WebDriver returnDriver(){

        return dr;
    }
}
