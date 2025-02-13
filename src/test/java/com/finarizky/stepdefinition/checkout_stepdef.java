package com.finarizky.stepdefinition;

import com.finarizky.basetest;
import com.finarizky.page.checkoutpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class checkout_stepdef extends basetest {

    checkoutpage checkoutpage;

    public checkout_stepdef() {
        this.checkoutpage = new checkoutpage(driver);
    }

    @And("User click checkout button")
    public void Userclickcheckoutbutton() {

        checkoutpage.clickButtonCheckout();
    }

    @Then("User is on Your Information")
    public void UserisonYourInformation() {

        checkoutpage = new checkoutpage(driver);
        checkoutpage.validateYourInfoPage();
    }

    @And("User click cancel button")
    public void userClickCancelButton() {

        checkoutpage.clickButtonCancelCheckout();
    }

    @And("User see error message {string}")
    public void userSeeErrorMessage(String errorMessageYourInfo) {

        checkoutpage.validateErrorMessageYourInfo(errorMessageYourInfo);
    }

    @And("User input last name with {string}")
    public void userInputLastNameWith(String lastname) {

        checkoutpage.inputLastName(lastname);
    }

    @And("User input portal code with {string}")
    public void userInputPortalCodeWith(String portalcode) {

       checkoutpage.inputPortalCode(portalcode);
    }

    @And("User input first name with {string}")
    public void userInputFirstNameWith(String firstname) {

        checkoutpage.inputFirstName(firstname);
    }

    @Then("User is on overview page")
    public void userIsOnOverviewPage() {

        checkoutpage = new checkoutpage(driver);
        checkoutpage.validateOverviewPage();
    }

    @And("click cancel button")
    public void clickCancelButton() {

        checkoutpage.clickButtonCancelCheckout();
    }

    @And("User click finish button")
    public void userClickFinishButton() {

        checkoutpage.clickButtonFinishCheckout();
    }

    @Then("User is on checkout complete page")
    public void userIsOnCheckoutCompletePage() {

        checkoutpage = new checkoutpage(driver);
        checkoutpage.validateOrderComplete();
    }

    @And("User click back home button")
    public void userClickBackHomeButton() {

        checkoutpage.clickButtonBackHome();
    }

    @And("User click continue checkout button")
    public void userClickContinueCheckoutButton() {

        checkoutpage.clickButtonContinueCheckout();
    }
}
