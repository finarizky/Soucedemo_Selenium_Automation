package com.finarizky.stepdefinition;

import com.finarizky.basetest;
import com.finarizky.page.homepage;
import com.finarizky.page.productdetailpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static junit.framework.TestCase.assertTrue;

public class productdetail_stepdef extends basetest {

    productdetailpage productdetailpage;
    homepage homepage;

    public productdetail_stepdef() {

        this.productdetailpage = new productdetailpage(driver);
    }


    @And("User click product Backpack")
    public void userClickProductBackpack() {

        productdetailpage.clickNameProductBackpack();
    }

    @And("User add to cart from detail page")
    public void userAddToCartFromDetailPage() {

        productdetailpage.clickAddtoCartDetailProduct();
    }

    @And("The cart contain product")
    public void theCartContainProduct() {

        assertTrue("", homepage.isCartEmpty());
    }

    @Then("The add to cart button change to remove button")
    public void theAddToCartButtonChangeToRemoveButton() {

        productdetailpage = new productdetailpage(driver);
        productdetailpage.validateButtonRemove();
    }

    @And("User click remove button")
    public void userClickRemoveButton() {

        productdetailpage.clickButtonRemove();
    }

    @Then("The remove button change to add to cart button")
    public void theRemoveButtonChangeToAddToCartButton() {

        productdetailpage = new productdetailpage(driver);
        productdetailpage.validateButtonAddtoCart();
    }

    @And("User click back to products button")
    public void userClickBackToProductsButton() {

        productdetailpage.clickBacktoProduct();
    }
}
