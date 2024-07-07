package com.epam.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
        glue ="com.epam.stepDefinitions",
        features = "src/test/resources/features/login.feature",
        tags = "@smoke",
        publish = true,
        plugin = {
                "pretty","html:report/cucumber-report/cucumber_report.html",
                "json:report/cucumber-report/cucumber.json"
        }

)
@RunWith(Cucumber.class)
public class JUnitRunnerTest {

}
