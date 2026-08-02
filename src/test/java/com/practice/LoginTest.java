package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class LoginTest {
    WebDriver driver;

    @BeforeMethod
    void setUp() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @Test
    void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickSubmit();

        String pageText = driver.findElement(org.openqa.selenium.By.cssSelector(".flash.success")).getText();
        Assert.assertTrue(pageText.contains("You logged into a secure area"));
    }

    @AfterMethod
    void tearDown() {
        driver.quit();
    }
}