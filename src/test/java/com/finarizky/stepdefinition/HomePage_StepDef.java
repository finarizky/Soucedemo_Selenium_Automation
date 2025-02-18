package com.finarizky.stepdefinition;

import com.finarizky.BaseTest;
import com.finarizky.page.HomePage;
import com.finarizky.page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class HomePage_StepDef extends BaseTest {

    HomePage homepage;
    private LoginPage loginpage;


    @Then("User is on homepage")
    public void userIsOnHomepage() {
        homepage = new HomePage(driver);
        homepage.validateOnHomePage();
    }


    @Given("User doing login with {string} and {string}")
    public void userDoingLoginWithAnd(String username, String password) {
        loginpage = new LoginPage(driver);
        loginpage.goToLoginPage();
        loginpage.inputUsername(username);
        loginpage.inputPassword(password);
        loginpage.clickLoginButton();

    }

    @When("User is on productlist page")
    public void userIsOnProductlistPage() {
        homepage = new HomePage(driver);
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
        homepage = new HomePage(driver);
        homepage.validateZtoA();
    }

    @And("User click spesific filter button a to z")
    public void userClickSpesificFilterButtonAToZ() {

        homepage.setButtonAtoZ();
    }

    @Then("User see filtering data a to z")
    public void userSeeFilteringDataAToZ() {
        homepage = new HomePage(driver);
        homepage.validateOnHomePage();
    }

    @And("User click spesific filter button price low to high")
    public void userClickSpesificFilterButtonPriceLowToHigh() {

        homepage.setButtonLowtoHigh();
    }

    @Then("User see filtering data price low to high")
    public void userSeeFilteringDataPriceLowToHigh() {
        homepage = new HomePage(driver);
        homepage.validateLowtoHigh();
    }

    @And("User click spesific filter button price high to low")
    public void userClickSpesificFilterButtonPriceHighToLow() {

        homepage.setButtonHightoLow();
    }

    @Then("User see filtering data price high to low")
    public void userSeeFilteringDataPriceHighToLow() {
        homepage = new HomePage(driver);
        homepage.validateHightoLow();
    }

    @And("User add to cart backpack")
    public void userAddToCartBackpack() {

        homepage.setAddCartBackpack();
    }

    @And("The cart contain product backpack")
    public void theCartContainProductBackpack() {

        assertTrue("", homepage.isCartEmpty());
    }

    @Then("The add to cart button backpack change to remove button")
    public void theAddToCartButtonBackpackChangeToRemoveButton() {

        homepage = new HomePage(driver);
        homepage.validateButtonChangetoRemoveBp();
    }

    @And("User add to cart light bike")
    public void userAddToCartLightBike() {

        homepage.setAddCartLightBike();
    }

    @And("The cart contain product light bike")
    public void theCartContainProductLightBike() {

        assertTrue("", homepage.isCartEmpty());
    }

    @Then("The add to cart button light bike change to remove button")
    public void theAddToCartButtonLightBikeChangeToRemoveButton() {

        homepage = new HomePage(driver);
        homepage.validateButtonChangetoRemoveLb();
    }

    @And("User add to cart bolt tshirt")
    public void userAddToCartBoltTshirt() {

        homepage.setAddCartBoltTshirt();
    }

    @And("The cart contain product bolt tshirt")
    public void theCartContainProductBoltTshirt() {

        assertTrue("", homepage.isCartEmpty());
    }

    @Then("The add to cart button bolt tshirt change to remove button")
    public void theAddToCartButtonBoltTshirtChangeToRemoveButton() {

        homepage = new HomePage(driver);
        homepage.validateButtonChangetoRemoveBoltTshirt();
    }

    @And("User add to cart fleece jacket")
    public void userAddToCartFleeceJacket() {

        homepage.setAddCartFleeceJacket();
    }

    @And("The cart contain product fleece jacket")
    public void theCartContainProductFleeceJacket() {

        assertTrue("", homepage.isCartEmpty());
    }

    @Then("The add to cart button fleece jacket change to remove button")
    public void theAddToCartButtonFleeceJacketChangeToRemoveButton() {

        homepage = new HomePage(driver);
        homepage.validateButtonChangetoRemoveFj();
    }

    @And("User add to cart onesie")
    public void userAddToCartOnesie() {

        homepage.setAddChartOnesie();
    }

    @And("The cart contain product onesie")
    public void theCartContainProductOnesie() {

        assertTrue("", homepage.isCartEmpty());
    }

    @Then("The add to cart button onesie change to remove button")
    public void theAddToCartButtonOnesieChangeToRemoveButton() {

        homepage = new HomePage(driver);
        homepage.validateButtonChangetoRemoveOnesie();
    }

    @And("User add to cart tshirt red")
    public void userAddToCartTshirtRed() {

        homepage.setAddChartTshirtRed();
    }

    @And("The cart contain product tshirt red")
    public void theCartContainProductTshirtRed() {

        assertTrue("", homepage.isCartEmpty());
    }

    @Then("The add to cart button tshirt red change to remove button")
    public void theAddToCartButtonTshirtRedChangeToRemoveButton() {

        homepage = new HomePage(driver);
        homepage.validateButtonChangetoRemoveTr();
    }


    @And("The cart is empty")
    public void theCartIsEmpty() {

        assertFalse("", homepage.isCartEmpty());
    }

    @And("User click remove button backpack")
    public void userClickRemoveButtonBackpack() {

        homepage.setButtonRemoveBackpack();
    }

    @Then("The remove button bp change to add to cart button bp")
    public void theRemoveButtonBpChangeToAddToCartButtonBp() {

        homepage = new HomePage(driver);
        homepage.validateButtonChangetoAddtoCartBp();
    }

    @And("User click remove button light bike")
    public void userClickRemoveButtonLightBike() {
        homepage.setButtonRemoveLightBike();

    }

    @Then("The remove button lp change to add to cart button lp")
    public void theRemoveButtonLpChangeToAddToCartButtonLp() {

        homepage = new HomePage(driver);
        homepage.validateButtonChangetoAddtoCartLb();
    }

    @And("User click remove button bolt tshirt")
    public void userClickRemoveButtonBoltTshirt() {
        homepage.setButtonRemoveBoltTshirt();
    }

    @Then("The remove button bt change to add to cart button bt")
    public void theRemoveButtonBtChangeToAddToCartButtonBt() {

        homepage = new HomePage(driver);
        homepage.validateButtonChangetoAddtoCartBt();
    }

    @And("User click remove button fleece jacket")
    public void userClickRemoveButtonFleeceJacket() {

        homepage.setButtonRemoveFleeceJacket();
    }

    @Then("The remove button fj change to add to cart button fj")
    public void theRemoveButtonFjChangeToAddToCartButtonFj() {

        homepage = new HomePage(driver);
        homepage.validateButtonChangetoAddtoCartFj();
    }

    @And("User click remove button onesie")
    public void userClickRemoveButtonOnesie() {

        homepage.setButtonRemoveOnesie();
    }

    @Then("The remove button onesie change to add to cart button onesie")
    public void theRemoveButtonOnesieChangeToAddToCartButtonOnesie() {

        homepage = new HomePage(driver);
        homepage.validateButtonChangetoAddtoCarOnesie();
    }

    @And("User click remove button tshirt red")
    public void userClickRemoveButtonTshirtRed() {

        homepage.setButtonRemoveTr();
    }

    @Then("The remove button tr change to add to cart button tr")
    public void theRemoveButtonTrChangeToAddToCartButtonTr() {

        homepage = new HomePage(driver);
        homepage.validateButtonChangetoAddtoCartTr();
    }

}
