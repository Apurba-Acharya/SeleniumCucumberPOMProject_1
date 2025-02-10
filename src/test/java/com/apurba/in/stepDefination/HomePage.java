package com.apurba.in.stepDefination;

import io.cucumber.java.en.Given;

import static com.apurba.in.pages.HomePage.*;

public class HomePage {
    @Given("User navigates to the Login page")
    public void user_navigates_to_the_login_page() throws InterruptedException {
        click_hamburger_menu();
        click_signIn_link();
    }

    @Given("User navigates to the Online products page")
    public void user_navigates_to_the_Online_product_page() throws InterruptedException {
        click_hamburger_menu();
        click_OnlineProducts_link();

    }
}
