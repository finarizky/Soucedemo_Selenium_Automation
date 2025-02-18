package com.finarizky.stepdefinition;

import com.finarizky.BaseTest;
import com.finarizky.page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login_StepDef extends BaseTest {

    LoginPage loginpage;

    @Given("User is on landing page")
    public void userIsOnLandingPage() {

        loginpage = new LoginPage(driver);
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

    @And("User is on login page")
    public void userIsOnLoginPage() {

        loginpage.goToLoginPage();
    }

    @Then("User able to see error message {string}")
    public void userAbleToSeeErrorMessage(String errorMessage) {

        loginpage.validateErrorAppear(errorMessage);
    }
}
