package com.practice.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.practice.factory.DriverFactory;

public class BaseTest {

     @BeforeMethod
    public void setUp() {

        DriverFactory.setDriver("chrome");

        DriverFactory.getDriver().manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {

        DriverFactory.quitDriver();
    }

     protected WebDriver getDriver() {
        return DriverFactory.getDriver();
    }
}