package com.apurba.in.POM_pages;

import com.apurba.in.utility.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class RegistrationPage extends BrowserDriver {

    public static String userregistration_xpath = "/html/body/center/h1";

    public static void visibility_user_registration_page() throws InterruptedException {
        String actualproductcategory_fs = driver.findElement(By.xpath(userregistration_xpath)).getText();
        Thread.sleep(5000);
        assertEquals("User Registration Page",actualproductcategory_fs);
    }
}