package com.practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise5 {
    public static void main(String[] args)
    {
         WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");


        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
        System.out.println(checkboxes.size());
    }
    
}
