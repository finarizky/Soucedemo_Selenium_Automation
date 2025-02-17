package com.finarizky.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class productDetailPage {
    private static WebDriver driver;

    public productDetailPage(WebDriver driver) {

        this.driver = driver;
    }

    By nameProductBackpack = By.id("item_4_title_link");
    By buttonCartDetailProduct = By.id("add-to-cart");
    By buttonBacktoProduct = By.id("back-to-products");
    By buttonRemoveDetailProduct = By.id("remove");
    By buttonAddtoCartDetailProduct = By.id("add-to-cart");

    public void clickNameProductBackpack() {

        driver.findElement(nameProductBackpack).click();
    }

    public void clickAddtoCartDetailProduct() {

        driver.findElement(buttonCartDetailProduct).click();
    }

    public void validateButtonRemove() {

        WebElement productElement = driver.findElement(buttonRemoveDetailProduct);
        assertTrue(productElement.isDisplayed());
        assertEquals("Remove", productElement.getText());
    }

    public void clickButtonRemove() {

        driver.findElement(buttonRemoveDetailProduct).click();
    }

    public void validateButtonAddtoCart() {

        WebElement productElement = driver.findElement(buttonAddtoCartDetailProduct);
        assertTrue(productElement.isDisplayed());
        assertEquals("Add to cart", productElement.getText());
    }

    public void clickBacktoProduct() {

        driver.findElement(buttonBacktoProduct).click();
    }

//    public void validateProductDetailPage() {
//
//        WebElement productElement = driver.findElement(buttonBacktoProduct);
//        assertTrue(productElement.isDisplayed());
//        assertEquals("Back to products", productElement.getText());
//    }
}
