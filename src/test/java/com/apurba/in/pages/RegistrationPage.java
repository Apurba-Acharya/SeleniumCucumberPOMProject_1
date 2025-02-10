package com.apurba.in.pages;

import com.apurba.in.utility.BrowserDriver;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class RegistrationPage extends BrowserDriver {

    public static String userregistration_xpath = "/html/body/center/h1";

    public static void visibility_user_registration_page() throws InterruptedException {
        String actualproductcategory_fs = driver.findElement(By.xpath(userregistration_xpath)).getText();
        assertEquals("User Registration Page",actualproductcategory_fs);
    }
}