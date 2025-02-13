package com.finarizky;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

@CucumberOptions(
        glue = {"com.finarizky"},
        features = {"src/test/resources/cart.feature"},
        plugin = {"pretty","html:reports/cucumber_cart.html", "json:reports/cucumber_cart.json"}
)

public class cartRunnerTest {
}
