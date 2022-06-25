package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Locators extends BaseTest{
    @Test
    public void locators() {
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.name("login-button"));
        WebElement bot = driver.findElement(By.className("bot_column"));

    }

}