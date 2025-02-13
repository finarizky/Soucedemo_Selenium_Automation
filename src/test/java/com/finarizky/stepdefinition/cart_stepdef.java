package com.finarizky.stepdefinition;

import com.finarizky.basetest;
import com.finarizky.page.cartpage;
import com.finarizky.page.homepage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class cart_stepdef extends basetest {

    cartpage cartPage;
    private homepage homepage;

    public cart_stepdef() {
        this.cartPage = new cartpage(driver);
    }


    @And("User click cart button")
    public void userClickCartButton() {

        cartPage.clickCart();
    }

    @Then("User is on cart page")
    public void userIsOnCartPage() {

        cartPage.validateCartPage();
    }

    @And("User add cart product Backpack")
    public void userAddCartProductBackpack() {

        homepage = new homepage(driver);
        homepage.setAddCartBackpack();
    }

    @And("User click remove button on cart")
    public void userClickRemoveButtonOnCart() {

        cartPage.clickRemoveCartBp();
    }

    @And("User click continue button")
    public void userClickContinueButton() {

        cartPage.clickContinueShopping();
    }

    @And("User click product name on cart")
    public void userClickProductNameOnCart() {

        cartPage.cartClickProductBp();
    }

    @Then("User is on product detail page")
    public void userIsOnProductDetailPage() {

        cartPage.validateDetailProduk();
    }
}
