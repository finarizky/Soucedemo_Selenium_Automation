package com.finarizky;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        glue = {"com.finarizky"},
        features = {"src/test/resources/login.feature"},
        plugin = {"pretty","html:reports/cucumber_login.html", "json:reports/cucumber_login.json"}
)

public class loginRunnerTest {

}
