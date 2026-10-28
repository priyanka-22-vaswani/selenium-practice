package com.practice.tests;

import org.testng.annotations.Test;
import com.practice.base.BaseTest;
import com.practice.factory.DriverFactory;
import com.practice.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;


public class LoginPOMTest extends BaseTest {

    @Test
    public void loginTest()
    {
        getDriver().get("https://the-internet.herokuapp.com/login");

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.login("tomsmith", "SuperSecretPassword!");

        String actualMessage = loginPage.getFlashMessage();

        Assert.assertTrue(
            actualMessage.contains("You logged into a secure area!")
        );

    
    }

    @Test
    public void invalidLoginTest()
    {
        getDriver().get("https://the-internet.herokuapp.com/login");
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.login("wronguser", "wrongpassword");

         String actualMessage = loginPage.getFlashMessage();

        Assert.assertTrue(
            actualMessage.contains("Your username is invalid!")
        );

    }

    @DataProvider(name = "loginData")
    public Object[][] getLoginData()
    {
         return new Object[][] {
            {"tomsmith", "SuperSecretPassword!", "You logged into a secure area!"},
            {"wronguser", "wrongpassword!", "Your username is invalid!"},
            {"tomsmith", "wrongpassword", "Your password is invalid!"}
        };
    }

    @Test(dataProvider = "loginData")
    public void loginDataProviderTest(String username, String password,  String expectedMessage)
    {
        getDriver().get("https://the-internet.herokuapp.com/login");

        LoginPage loginPage = new LoginPage(getDriver());

        loginPage.login(username, password);

        String actualMessage = loginPage.getFlashMessage();

        Assert.assertTrue(
            actualMessage.contains( expectedMessage )
        );
    }
}