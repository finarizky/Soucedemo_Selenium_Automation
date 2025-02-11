package com.finarizky.stepdefinition;

import com.finarizky.basetest;
import com.finarizky.page.loginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class login_stepdef extends basetest {

    loginpage loginpage;

    @Given("User is on landing page")
    public void userIsOnLandingPage() {

        loginpage = new loginpage(driver);
        loginpage.goToLoginPage();
    }

    @When("User input username with {string}")
    public void userInputUsernameWith(String username) {

        loginpage.inputUsername(username);
    }

    @And("User input password with {string}")
    public void userInputPasswordWith(String password) {

        loginpage.inputPassword(password);
    }

    @And("User click login button")
    public void userClickLoginButton() {

        loginpage.clickLoginButton();
    }

    @Then("User is on login page")
    public void userIsOnLoginPage() {

        loginpage.goToLoginPage();
    }

    @And("User able to see error message {string}")
    public void userAbleToSeeErrorMessage(String errorMessage) {

        loginpage.validateErrorAppear(errorMessage);
    }
}
