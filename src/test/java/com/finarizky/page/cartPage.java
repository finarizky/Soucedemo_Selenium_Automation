package com.finarizky.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class cartPage {

    private static WebDriver driver;

    public cartPage(WebDriver driver){

        this.driver = driver;
    }

    By buttonCart = By.id("shopping_cart_container");
    By tittleCartPage = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    By buttonContinueShopping = By.id("continue-shopping");
    By produkCartBp = By.id("item_4_title_link");
    By tittleBacktoHomepage = By.id("back-to-products");
    By buttonRemoveCartBp = By.id("remove-sauce-labs-backpack");

    public void clickCart(){

        driver.findElement(buttonCart).click();
    }

    public void validateCartPage(){

        WebElement productElement = driver.findElement(tittleCartPage);
        assertTrue(productElement.isDisplayed());
        assertEquals("Your Cart", productElement.getText());
    }

    public void clickContinueShopping(){

        driver.findElement(buttonContinueShopping).click();
    }

    public void cartClickProductBp(){

        driver.findElement(produkCartBp).click();
    }

    public void validateDetailProduk(){

        WebElement productElement = driver.findElement(tittleBacktoHomepage);
        assertTrue(productElement.isDisplayed());
        assertEquals("Back to products", productElement.getText());
    }

    public void clickRemoveCartBp() {

        driver.findElement(buttonRemoveCartBp).click();
    }

}
