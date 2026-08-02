package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    // locators - defined once, here, and nowhere else
    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By submitButton = By.cssSelector("button[type='submit']");

    // constructor - every page object needs the driver to work with
    LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // actions this page can perform
    void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    void clickSubmit() {
        driver.findElement(submitButton).click();
    }
}