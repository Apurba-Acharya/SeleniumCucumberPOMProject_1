package com.apurba.in.stepDefination;

import io.cucumber.java.en.Then;

import static com.apurba.in.POM_pages.RegistrationPage.visibility_user_registration_page;

public class RegistrationPage {

    @Then("User should be able to view the Registration page")
    public void user_successfully_enters_the_log_in_details() throws InterruptedException {
        visibility_user_registration_page();
    }

}