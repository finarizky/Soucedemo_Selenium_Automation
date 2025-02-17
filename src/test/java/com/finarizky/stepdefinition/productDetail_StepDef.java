package com.finarizky.stepdefinition;

import com.finarizky.baseTest;
import com.finarizky.page.homePage;
import com.finarizky.page.productDetailPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static junit.framework.TestCase.assertTrue;

public class productDetail_StepDef extends baseTest {

    productDetailPage productdetailpage;
    homePage homepage;

    public productDetail_StepDef() {

        this.productdetailpage = new productDetailPage(driver);
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

        productdetailpage = new productDetailPage(driver);
        productdetailpage.validateButtonRemove();
    }

    @And("User click remove button")
    public void userClickRemoveButton() {

        productdetailpage.clickButtonRemove();
    }

    @Then("The remove button change to add to cart button")
    public void theRemoveButtonChangeToAddToCartButton() {

        productdetailpage = new productDetailPage(driver);
        productdetailpage.validateButtonAddtoCart();
    }

    @And("User click back to products button")
    public void userClickBackToProductsButton() {

        productdetailpage.clickBacktoProduct();
    }

//    @Then("User is on product detail page")
//    public void Userisonproductdetailpage() {
//
//        productdetailpage = new productdetailpage(driver);
//        productdetailpage.validateProductDetailPage();
//    }
}
