package com.apurba.in.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/apurba/in/features",
        glue = {"com.apurba.in.stepDefination"},
        plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber.json"},
        monochrome = true
)

public class TestRunner{
}