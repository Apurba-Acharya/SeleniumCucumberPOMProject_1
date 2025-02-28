package com.apurba.in.stepDefination;

import io.cucumber.java.en.When;

import static com.apurba.in.POM_pages.LoginPage.*;

public class LoginPage {

    @When("User successfully enters the log in details")
    public void user_successfully_enters_the_log_in_details() throws InterruptedException {
        sendkeys_username();
        sendkeys_password();
        click_login_btn();
    }

    @When("User clicks on new Registration button")
    public void user_clicks_on_new_registration_button() throws InterruptedException {
        click_NewRegister_btn();
    }

}