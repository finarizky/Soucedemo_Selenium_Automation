package com.finarizky.page;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class homepage {
    By productBackpack = By.id("item_4_title_link");
    By buttonFilter = By.className("product_sort_container");
    By buttonZtoA = By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]");
    By productTshirt = By.id("item_3_title_link");
    By buttonAtoZ = By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[1]");
    By buttonLowtoHigh = By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]");
    By buttonHightoLow = By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]");
    By productOnesie = By.id("item_2_title_link");
    By productJacket = By.id("item_5_title_link");
    By buttonAddtocartBackpack = By.id("add-to-cart-sauce-labs-backpack");
    By bagdeCart = By.className("shopping_cart_badge");
    By buttonRemoveBp = By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]");
    By cart = By.id("shopping_cart_link");

    private static WebDriver driver;

    public homepage(WebDriver driver) {
        this.driver = driver;
    }

    public void validateOnHomePage() {
        WebElement productElement = driver.findElement(productBackpack);
        assertTrue(productElement.isDisplayed());
        assertEquals("Sauce Labs Backpack", productElement.getText());
    }

    public void setButtonFilter(){
        driver.findElement(buttonFilter).click();
    }

    public void setButtonZtoA(){
        driver.findElement(buttonZtoA).click();
    }


    public void validateZtoA(){
        WebElement productElement = driver.findElement(productTshirt);
        assertTrue(productElement.isDisplayed());
        assertEquals("Test.allTheThings() T-Shirt (Red)", productElement.getText());
    }

    public void setButtonAtoZ(){
        driver.findElement(buttonAtoZ).click();
    }

    public void setButtonLowtoHigh(){
        driver.findElement(buttonLowtoHigh).click();
    }

    public void validateLowtoHigh(){
        WebElement productElement = driver.findElement(productOnesie);
        assertTrue(productElement.isDisplayed());
        assertEquals("Sauce Labs Onesie", productElement.getText());
    }

    public void setButtonHightoLow(){
        driver.findElement(buttonHightoLow).click();
    }

    public void validateHightoLow(){
        WebElement productElement = driver.findElement(productJacket);
        assertTrue(productElement.isDisplayed());
        assertEquals("Sauce Labs Fleece Jacket", productElement.getText());
    }

    public void setButtonAddtoCart(){
        driver.findElement(buttonAddtocartBackpack).click();
    }

    public void validatebuttonRemoveBackpack(){
        WebElement productElement = driver.findElement(buttonRemoveBp);
        assertTrue(productElement.isDisplayed());
        assertEquals("Remove", productElement.getText());
    }

    public void removeBackpack(){
        driver.findElement(buttonRemoveBp).click();
    }

    public boolean isCartEmpty() {
        try {
            driver.findElement(bagdeCart);
            return true; // Jika elemen ditemukan, berarti ada item di keranjang ada isi
        } catch (NoSuchElementException e) {
            return false; // Jika elemen tidak ditemukan, berarti keranjang kosong
        }
    }


    public void validatebuttonAddtoCartBp(){
        WebElement productElement = driver.findElement(buttonAddtocartBackpack);
        assertTrue(productElement.isDisplayed());
        assertEquals("Add to cart", productElement.getText());
    }
}
