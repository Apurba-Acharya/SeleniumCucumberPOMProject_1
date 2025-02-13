package com.apurba.in.runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/java/com/apurba/in/features",
        glue = {"com.apurba.in.stepDefination"},
        plugin = {"pretty", "html:target/cucumber-Report.html", "json:target/cucumber.json"},
        monochrome = true // To get the output in readable format
)
public class TestNGRunner extends AbstractTestNGCucumberTests {
}