package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise4 {
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement checkBox = driver.findElement(By.cssSelector("input[type='checkbox']"));
        checkBox.click();
    }
    
}
