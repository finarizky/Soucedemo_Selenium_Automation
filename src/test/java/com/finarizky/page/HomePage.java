package com.finarizky.page;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage {

    private static WebDriver driver;

    public HomePage(WebDriver driver) {

        this.driver = driver;
    }

    By tittleHomepage = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    By nameProductOnesie = By.id("item_2_title_link");
    By nameProductJacket = By.id("item_5_title_link");
    By nameProductTshirt = By.id("item_3_title_link");
    static By bagdeCart = By.className("shopping_cart_badge");
    By buttonFilter = By.className("product_sort_container");
    By buttonZtoA = By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]");
    By buttonAtoZ = By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[1]");
    By buttonLowtoHigh = By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]");
    By buttonHightoLow = By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]");
    By addCartBackpack = By.id("add-to-cart-sauce-labs-backpack");
    By addCartLightBike = By.id("add-to-cart-sauce-labs-bike-light");
    By addCartBoltTshirt = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    By addCartFleeceJacket = By.id("add-to-cart-sauce-labs-fleece-jacket");
    By addChartOnesie = By.id("add-to-cart-sauce-labs-onesie");
    By addChartTshirtRed = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
    By buttonRemoveBackpack = By.id("remove-sauce-labs-backpack");
    By buttonRemoveLightBike = By.id("remove-sauce-labs-bike-light");
    By buttonRemoveBoltTshirt = By.id("remove-sauce-labs-bolt-t-shirt");
    By buttonRemoveFleeceJacket = By.id("remove-sauce-labs-fleece-jacket");
    By buttonRemoveOnesie = By.id("remove-sauce-labs-onesie");
    By buttonRemoveTshirtRed = By.id("remove-test.allthethings()-t-shirt-(red)");

    public void validateOnHomePage() {
        WebElement productElement = driver.findElement(tittleHomepage);
        assertTrue(productElement.isDisplayed());
        assertEquals("Products", productElement.getText());
    }

    public static boolean isCartEmpty() {
        try {
            driver.findElement(bagdeCart);
            return true; // Jika elemen ditemukan, berarti ada item di keranjang ada isi
        } catch (NoSuchElementException e) {
            return false; // Jika elemen tidak ditemukan, berarti keranjang kosong
        }
    }

    public void setButtonFilter(){

        driver.findElement(buttonFilter).click();
    }

    public void setButtonZtoA(){

        driver.findElement(buttonZtoA).click();
    }


    public void validateZtoA(){
        WebElement productElement = driver.findElement(nameProductTshirt);
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
        WebElement productElement = driver.findElement(nameProductOnesie);
        assertTrue(productElement.isDisplayed());
        assertEquals("Sauce Labs Onesie", productElement.getText());
    }

    public void setButtonHightoLow(){

        driver.findElement(buttonHightoLow).click();
    }

    public void validateHightoLow(){
        WebElement productElement = driver.findElement(nameProductJacket);
        assertTrue(productElement.isDisplayed());
        assertEquals("Sauce Labs Fleece Jacket", productElement.getText());
    }

    public void setAddCartBackpack(){

        driver.findElement(addCartBackpack).click();
    }

    public void validateButtonChangetoRemoveBp(){
        WebElement productElement = driver.findElement(buttonRemoveBackpack);
        assertTrue(productElement.isDisplayed());
        assertEquals("Remove", productElement.getText());
    }

    public void setAddCartLightBike(){
        driver.findElement(addCartLightBike).click();
    }

    public void validateButtonChangetoRemoveLb(){
        WebElement productElement = driver.findElement(buttonRemoveLightBike);
        assertTrue(productElement.isDisplayed());
        assertEquals("Remove", productElement.getText());
    }

    public void setAddCartBoltTshirt(){
        driver.findElement(addCartBoltTshirt).click();
    }

    public void validateButtonChangetoRemoveBoltTshirt(){
        WebElement productElement = driver.findElement(buttonRemoveBoltTshirt);
        assertTrue(productElement.isDisplayed());
        assertEquals("Remove", productElement.getText());
    }

    public void setAddCartFleeceJacket(){

        driver.findElement(addCartFleeceJacket).click();
    }

    public void validateButtonChangetoRemoveFj(){
        WebElement productElement = driver.findElement(buttonRemoveFleeceJacket);
        assertTrue(productElement.isDisplayed());
        assertEquals("Remove", productElement.getText());
    }

    public void setAddChartOnesie(){
        driver.findElement(addChartOnesie).click();
    }

    public void validateButtonChangetoRemoveOnesie(){
        WebElement productElement = driver.findElement(buttonRemoveOnesie);
        assertTrue(productElement.isDisplayed());
        assertEquals("Remove", productElement.getText());
    }

    public void setAddChartTshirtRed(){
        driver.findElement(addChartTshirtRed).click();
    }

    public void validateButtonChangetoRemoveTr(){
        WebElement productElement = driver.findElement(buttonRemoveTshirtRed);
        assertTrue(productElement.isDisplayed());
        assertEquals("Remove", productElement.getText());
    }

    public void setButtonRemoveBackpack(){
        driver.findElement(buttonRemoveBackpack).click();
    }

    public void validateButtonChangetoAddtoCartBp(){
        WebElement productElement = driver.findElement(addCartBackpack);
        assertTrue(productElement.isDisplayed());
        assertEquals("Add to cart", productElement.getText());
    }

    public void setButtonRemoveLightBike(){
        driver.findElement(buttonRemoveLightBike).click();
    }

    public void validateButtonChangetoAddtoCartLb(){
        WebElement productElement = driver.findElement(addCartLightBike);
        assertTrue(productElement.isDisplayed());
        assertEquals("Add to cart", productElement.getText());
    }

    public void setButtonRemoveBoltTshirt(){
        driver.findElement(buttonRemoveBoltTshirt).click();
    }

    public void validateButtonChangetoAddtoCartBt(){
        WebElement productElement = driver.findElement(addCartBoltTshirt);
        assertTrue(productElement.isDisplayed());
        assertEquals("Add to cart", productElement.getText());
    }

    public void setButtonRemoveFleeceJacket(){
        driver.findElement(buttonRemoveFleeceJacket).click();
    }

    public void validateButtonChangetoAddtoCartFj(){
        WebElement productElement = driver.findElement(addCartFleeceJacket);
        assertTrue(productElement.isDisplayed());
        assertEquals("Add to cart", productElement.getText());
    }

    public void setButtonRemoveOnesie(){
        driver.findElement(buttonRemoveOnesie).click();
    }

    public void validateButtonChangetoAddtoCarOnesie(){
        WebElement productElement = driver.findElement(addChartOnesie);
        assertTrue(productElement.isDisplayed());
        assertEquals("Add to cart", productElement.getText());
    }

    public void setButtonRemoveTr(){
        driver.findElement(buttonRemoveTshirtRed).click();
    }

    public void validateButtonChangetoAddtoCartTr(){
        WebElement productElement = driver.findElement(addChartTshirtRed);
        assertTrue(productElement.isDisplayed());
        assertEquals("Add to cart", productElement.getText());
    }
}
