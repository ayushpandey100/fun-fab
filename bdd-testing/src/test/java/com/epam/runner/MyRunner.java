package com.epam.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "D:/fun-fab/bdd-testing/src/test/resources/features/placeOrder.feature"
        ,glue={"com.epam.stepDefinitions"}
)
public class MyRunner {
}
