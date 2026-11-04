package com.practice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import com.practice.base.BaseTest;

public class LoginFailTest extends BaseTest {


    @Test
    void runTest()
    {
        WebDriver driver = getDriver();
        open("/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecrePasswor");
        loginPage.clickSubmit();

        String errorText = driver.findElement(org.openqa.selenium.By.cssSelector(".flash.error")).getText();
        Assert.assertTrue(errorText.contains("invalid"));
    }
    
}
