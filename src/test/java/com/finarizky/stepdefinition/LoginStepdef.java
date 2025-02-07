package com.finarizky.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdef {
    @Given("User is on landing page")
    public void userIsOnLandingPage() {
    }

    @When("User input username with {string}")
    public void userInputUsernameWith(String arg0) {
    }

    @And("User input password with {string}")
    public void userInputPasswordWith(String arg0) {
    }

    @And("User click login button")
    public void userClickLoginButton() {
    }

    @Then("User is on homepage")
    public void userIsOnHomepage() {
    }

    @Then("User is on login page")
    public void userIsOnLoginPage() {
    }

    @And("User see error message")
    public void userSeeErrorMessage() {
    }
}
