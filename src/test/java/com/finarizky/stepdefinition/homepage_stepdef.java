package com.finarizky.stepdefinition;

import com.finarizky.basetest;
import com.finarizky.page.homepage;
import com.finarizky.page.loginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class homepage_stepdef extends basetest {

    homepage homepage;
    private com.finarizky.page.loginpage loginpage;


    @Then("User is on homepage")
    public void userIsOnHomepage() {
        homepage = new homepage(driver);
        homepage.validateOnHomePage();
    }


    @Given("User doing login with {string} and {string}")
    public void userDoingLoginWithAnd(String username, String password) {
        loginpage = new loginpage(driver);
        loginpage.goToLoginPage();
        loginpage.inputUsername(username);
        loginpage.inputPassword(password);
        loginpage.clickLoginButton();

    }

    @When("User is on productlist page")
    public void userIsOnProductlistPage() {
        homepage = new homepage(driver);
        homepage.validateOnHomePage();
    }

    @And("User click filter button")
    public void userClickFilterButton() {
        homepage.setButtonFilter();
    }

    @And("User click spesific filter button z to a")
    public void userClickSpesificFilterButtonZToA() {
        homepage.setButtonZtoA();
    }

    @Then("User see filtering data z to a")
    public void userSeeFilteringDataZToA() {
        homepage = new homepage(driver);
        homepage.validateZtoA();
    }

    @And("User click spesific filter button a to z")
    public void userClickSpesificFilterButtonAToZ() {
        homepage.setButtonAtoZ();
    }

    @Then("User see filtering data a to z")
    public void userSeeFilteringDataAToZ() {
        homepage = new homepage(driver);
        homepage.validateOnHomePage();
    }

    @And("User click spesific filter button price low to high")
    public void userClickSpesificFilterButtonPriceLowToHigh() {
        homepage.setButtonLowtoHigh();
    }

    @Then("User see filtering data price low to high")
    public void userSeeFilteringDataPriceLowToHigh() {
        homepage = new homepage(driver);
        homepage.validateLowtoHigh();
    }

    @And("User click spesific filter button price high to low")
    public void userClickSpesificFilterButtonPriceHighToLow() {
        homepage.setButtonHightoLow();
    }

    @Then("User see filtering data price high to low")
    public void userSeeFilteringDataPriceHighToLow() {
        homepage = new homepage(driver);
        homepage.validateHightoLow();
    }

    @And("User click add to cart button")
    public void userClickAddToCartButton() {
        homepage.setButtonAddtoCart();
    }

    @And("The cart contain product")
    public void theCartContainProduct() {
        assertTrue("", homepage.isCartEmpty());
    }

    @Then("The add to cart button change to remove button")
    public void theAddToCartButtonChangeToRemoveButton() {
        homepage = new homepage(driver);
        homepage.validatebuttonRemoveBackpack();
    }

    @And("User click remove button")
    public void userClickRemoveButton() {
        homepage.removeBackpack();
    }

    @And("The cart is empty")
    public void theCartIsEmpty() {
        assertFalse("", homepage.isCartEmpty());
    }

    @Then("The remove button change to add to cart button")
    public void theRemoveButtonChangeToAddToCartButton() {
        homepage = new homepage(driver);
        homepage.validatebuttonAddtoCartBp();
    }

}
