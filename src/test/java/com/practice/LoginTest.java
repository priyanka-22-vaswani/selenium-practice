package com.practice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import com.practice.base.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    void testValidLogin() {
        WebDriver driver = getDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickSubmit();

        String pageText = driver.findElement(org.openqa.selenium.By.cssSelector(".flash.success")).getText();
        Assert.assertTrue(pageText.contains("You logged into a secure area"));
    }

}