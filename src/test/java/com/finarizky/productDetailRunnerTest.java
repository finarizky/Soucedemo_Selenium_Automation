package com.finarizky;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        glue = {"com.finarizky"},
        features = {"src/test/resources/product_detail.feature"},
        plugin = {"pretty","html:reports/cucumber_productdetail.html", "json:reports/cucumber_productdetail.json"}
)

public class productDetailRunnerTest {
}
