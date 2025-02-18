package com.finarizky.stepdefinition;

import com.finarizky.BaseTest;
import com.finarizky.page.CartPage;
import com.finarizky.page.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Cart_StepDef extends BaseTest {

    CartPage cartPage;
    private HomePage homepage;

    public Cart_StepDef() {
        this.cartPage = new CartPage(driver);
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

        homepage = new HomePage(driver);
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
