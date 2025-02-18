package com.finarizky.stepdefinition;

import com.finarizky.BaseTest;
import com.finarizky.page.HomePage;
import com.finarizky.page.ProductDetailPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static junit.framework.TestCase.assertTrue;

public class ProductDetail_StepDef extends BaseTest {

    ProductDetailPage productdetailpage;
    HomePage homepage;

    public ProductDetail_StepDef() {

        this.productdetailpage = new ProductDetailPage(driver);
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

        productdetailpage = new ProductDetailPage(driver);
        productdetailpage.validateButtonRemove();
    }

    @And("User click remove button")
    public void userClickRemoveButton() {

        productdetailpage.clickButtonRemove();
    }

    @Then("The remove button change to add to cart button")
    public void theRemoveButtonChangeToAddToCartButton() {

        productdetailpage = new ProductDetailPage(driver);
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
