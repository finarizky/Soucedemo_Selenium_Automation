package com.finarizky.stepdefinition;

import com.finarizky.baseTest;
import com.finarizky.page.cartPage;
import com.finarizky.page.homePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class cart_StepDef extends baseTest {

    com.finarizky.page.cartPage cartPage;
    private homePage homepage;

    public cart_StepDef() {
        this.cartPage = new cartPage(driver);
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

        homepage = new homePage(driver);
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
