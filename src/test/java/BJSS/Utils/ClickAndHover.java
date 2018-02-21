package BJSS.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHover {


    public static void hoverAndClickElement(String element, WebDriver dr){
        Actions actions = new Actions(dr);
        WebElement ele = dr.findElement(By.xpath(element));
        actions.moveToElement(ele).perform();
        dr.findElement(By.xpath(("//*[@id='center_column']/ul/li/div/div[1]/div/a[2]/span"))).click();

    }


    public static void DoubleClickElement(String element, WebDriver dr){
        Actions actions = new Actions(dr);
        WebElement ele = dr.findElement(By.xpath(element));
        actions.moveToElement(ele).doubleClick().build().perform();


    }
}
