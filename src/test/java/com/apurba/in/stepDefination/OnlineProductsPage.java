package com.apurba.in.stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.apurba.in.POM_pages.OnlineProductsPage.click_formalshoesdropdpown;
import static com.apurba.in.POM_pages.OnlineProductsPage.getText_formalshoes_firstvalue;
import static com.apurba.in.utility.BrowserDriver.driver;
import static org.junit.Assert.assertEquals;

public class OnlineProductsPage {

    @When("User clicks on Formal Shoes drop down")
    public void user_clicks_on_Formal_Shoes_drop_down() throws InterruptedException {
        click_formalshoesdropdpown();
    }
    @Then("User should be able to view the Products")
    public void user_should_be_able_to_view_the_Products() throws InterruptedException {
        getText_formalshoes_firstvalue();
        assertEquals("   Classic Cheltenham",getText_formalshoes_firstvalue());
        driver.quit();
    }

}
