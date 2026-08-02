package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class LoginFailTest {
    WebDriver driver;

    @BeforeMethod
    void setUp()
    {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @Test
    void runTest()
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecrePasswor");
        loginPage.clickSubmit();

        String errorText = driver.findElement(org.openqa.selenium.By.cssSelector(".flash.error")).getText();
        Assert.assertTrue(errorText.contains("invalid"));
    }

    @AfterMethod
    void endTest()
    {
        driver.quit();
    }  
    
}
