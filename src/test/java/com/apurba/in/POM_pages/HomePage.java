package com.apurba.in.POM_pages;

import com.apurba.in.utility.BrowserDriver;
import com.apurba.in.utility.PropertiesReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class HomePage extends BrowserDriver {

    public static String hamburger_menu_xpath = "//*[@id=\"menuToggle\"]/input";
    public static String signIn_link_LinkText = "Sign In Portal";
    public static String onlineProductsPage_link_LinkText = "Online Products";

    public static void click_hamburger_menu() throws InterruptedException, IOException {
        //WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html#");
        driver.get(PropertiesReader.readKey("url"));
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath(hamburger_menu_xpath)).click();
    }

    public static void click_signIn_link() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.linkText(signIn_link_LinkText)).click();
    }

    public static void click_OnlineProducts_link() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.linkText(onlineProductsPage_link_LinkText)).click();
    }
}
