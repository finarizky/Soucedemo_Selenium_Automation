package com.finarizky.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class homepage {

    static By productTitle = By.xpath("//*[@id=\"item_4_title_link\"]/div");
    private static WebDriver driver;

    public homepage(WebDriver driver) {
        this.driver = driver;
    }

    public static void validateOnHomePage() {
        WebElement productElement = driver.findElement(productTitle);
        assertTrue(productElement.isDisplayed());
        assertEquals("Sauce Labs Backpack", productElement.getText());
    }
}
