package com.epam.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "D:/fun-fab/bdd-testing/src/test/resources/features/placeOrder.feature",
        glue={"com.epam.stepDefinitions"},
        tags = "@smoke",
        publish = true,
        plugin = {"pretty","json:target/cucumber-report/cucumber.json",
                "html:target/cucumber-report/cucumber_report.html"}
)
public class CucumberTestNGRunner extends AbstractTestNGCucumberTests {

}
