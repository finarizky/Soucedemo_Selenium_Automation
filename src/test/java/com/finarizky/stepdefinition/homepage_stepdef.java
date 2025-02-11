package com.finarizky.stepdefinition;

import com.finarizky.basetest;
import com.finarizky.page.homepage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class homepage_stepdef extends basetest {

    homepage homepage;

    @Then("User is on homepage")
    public void userIsOnHomepage() {

        homepage = new homepage(driver);
        homepage.validateOnHomePage();
        }


    @When("User click filter button")
    public void userClickFilterButton() {
    }

    @And("User click spesific filter button z to a")
    public void userClickSpesificFilterButtonZToA() {
    }

    @Then("User see filtering data z to a")
    public void userSeeFilteringDataZToA() {
    }

    @And("User click spesific filter button a to z")
    public void userClickSpesificFilterButtonAToZ() {
    }

    @Then("User see filtering data a to z")
    public void userSeeFilteringDataAToZ() {
    }

    @And("User click spesific filter button price low to high")
    public void userClickSpesificFilterButtonPriceLowToHigh() {
    }

    @Then("User see filtering data price low to high")
    public void userSeeFilteringDataPriceLowToHigh() {
    }

    @And("User click spesific filter button price high to low")
    public void userClickSpesificFilterButtonPriceHighToLow() {
    }

    @Then("User see filtering data price high to low")
    public void userSeeFilteringDataPriceHighToLow() {
    }

    @When("User click add to cart button")
    public void userClickAddToCartButton() {
    }

    @And("The cart contain product")
    public void theCartContainProduct() {
    }

    @Then("The add to cart button change to remove button")
    public void theAddToCartButtonChangeToRemoveButton() {
    }

    @When("User click remove button")
    public void userClickRemoveButton() {
    }

    @And("The cart is empty")
    public void theCartIsEmpty() {
    }

    @Then("The remove button change to add to cart button")
    public void theRemoveButtonChangeToAddToCartButton() {
    }
}
