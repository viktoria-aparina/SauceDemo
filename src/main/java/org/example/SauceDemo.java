package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceDemo extends BaseTest {
    @Test
    public void priceAndNameInCart() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector(".submit-button")).click();
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        String nameBackpack = driver.findElement(By.xpath("//div[text() = 'Sauce Labs Backpack']")).getText();
        String priceBackpack = driver.findElement(By.xpath("//div[text()='29.99']")).getText();
        driver.findElement(By.name("add-to-cart-sauce-labs-bike-light")).click();
        String nameBileLight = driver.findElement(By.xpath("//div[text() = 'Sauce Labs Bike Light']")).getText();
        String priceBikeLight = driver.findElement(By.xpath("//div[text()='9.99']")).getText();
        driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
        String nameOnesie = driver.findElement(By.xpath("//div[text() = 'Sauce Labs Onesie']")).getText();
        String priceOnesie = driver.findElement(By.xpath("//div[text()='7.99']")).getText();
        driver.findElement(By.xpath("//button[contains(@name,'add-to-cart-test.allthethings()-t-shirt-(red)')]")).click();
        String nameTestAllTheThings = driver.findElement(By.xpath("//div[text() = 'Test.allTheThings() T-Shirt (Red)']")).getText();
        String priceTestAllTheThings = driver.findElement(By.xpath("//div[text()='15.99']")).getText();
        driver.findElement(By.className("shopping_cart_container")).click();

        Assert.assertEquals(driver.findElement(By.xpath("//div[text()='15.99']")).getText(), priceTestAllTheThings);
        Assert.assertEquals(driver.findElement(By.xpath("//div[text() = 'Test.allTheThings() T-Shirt (Red)']")).getText(), nameTestAllTheThings);
        Assert.assertEquals(driver.findElement(By.xpath("//div[text()='7.99']")).getText(), priceOnesie);
        Assert.assertEquals(driver.findElement(By.xpath("//div[text() = 'Sauce Labs Onesie']")).getText(), nameOnesie);
        Assert.assertEquals(driver.findElement(By.xpath("//div[text()='9.99']")).getText(), priceBikeLight);
        Assert.assertEquals(driver.findElement(By.xpath("//div[text() = 'Sauce Labs Bike Light']")).getText(), nameBileLight);
        Assert.assertEquals(driver.findElement(By.xpath("//div[text()='29.99']")).getText(), priceBackpack);
        Assert.assertEquals(driver.findElement(By.xpath("//div[text() = 'Sauce Labs Backpack']")).getText(), nameBackpack);
    }

}
