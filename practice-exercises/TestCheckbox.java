package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCheckbox {
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        CheckboxPage checkboxpage = new CheckboxPage(driver);
        checkboxpage.clickFirstCheckbox();

        driver.quit();
    }
    
}
