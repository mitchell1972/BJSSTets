package BJSS.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingPage {

    private static WebElement element = null;

    public static WebElement TShirtsMenu(WebDriver e) {
        element = e.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[3]"));
        return element;
    }

    public static WebElement AddItemToCart(WebDriver e) {
        element = e.findElement(By.xpath("//*[@id='add_to_cart'']/button/span"));
        return element;
    }
}
