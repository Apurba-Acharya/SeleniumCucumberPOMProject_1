package POM_pages;

import utility.BrowserDriver;
import utility.PropertiesReader;
import org.openqa.selenium.By;

import java.io.IOException;

import static org.bouncycastle.cms.RecipientId.password;

public class LoginPage extends BrowserDriver {

    public static String username_text_id = "usr";
    public static String password_text_id = "pwd";
    public static String login_btn_xpath ="//*[@id=\"second_form\"]/input";
    public static String newregister_btn_id ="NewRegistration";

//    public static void sendkeys_username() throws InterruptedException {
//        driver.findElement(By.id(username_text_id)).sendKeys("Scott.gale@gmail.com");
//    }

    public static void sendkeys_username() throws IOException {
        driver.findElement(By.id(username_text_id)).sendKeys(PropertiesReader.readKey("username"));
    }

//    public static void sendkeys_password() throws InterruptedException {
//        driver.findElement(By.id(password_text_id)).sendKeys("P@sword!");
//    }

    public static void sendkeys_password() throws IOException {
        driver.findElement(By.id(password_text_id)).sendKeys(PropertiesReader.readKey("password"));
    }

    public static void click_login_btn()
    {
        driver.findElement(By.xpath(login_btn_xpath)).click();
    }

    public static void click_NewRegister_btn()
    {
        driver.findElement(By.id(newregister_btn_id)).click();
    }

}
