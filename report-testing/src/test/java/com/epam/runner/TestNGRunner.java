package com.epam.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        glue ="com.epam.stepDefinitions",
        features = "src/test/resources/features/login.feature",
        tags = "@smoke",
        plugin = {
                "pretty","html:report/cucumber-report/cucumber_report.html",
                "json:report/cucumber-report/cucumber.json"
        }

)

public class TestNGRunner extends AbstractTestNGCucumberTests {
}
