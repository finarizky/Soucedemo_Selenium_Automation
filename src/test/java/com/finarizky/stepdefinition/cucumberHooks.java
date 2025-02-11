package com.finarizky.stepdefinition;

import com.finarizky.basetest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class cucumberHooks extends basetest {

    @Before
    public void beforeTest() {
        getDriver();
    }

    @After
    public void afterTest() {
        driver.close();
    }
}
