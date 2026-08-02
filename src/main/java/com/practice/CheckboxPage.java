package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxPage {
    WebDriver driver;

    By checkbox = By.cssSelector("input[type='checkbox']");

    CheckboxPage(WebDriver driver)
    {
        this.driver = driver;
    }

    void clickFirstCheckbox()
    {
        driver.findElement(checkbox).click();
    }
    
}
