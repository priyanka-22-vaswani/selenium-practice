package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise3 {
    public static void main (String[] args)
    {
        WebDriver web = new ChromeDriver();
        web.get("https://the-internet.herokuapp.com/login");

      
        WebElement uname = web.findElement(By.id("username"));
        uname.sendKeys("tomsmith");
        WebElement pass = web.findElement(By.id("password"));
        pass.sendKeys("SuperSecretPass");
        WebElement submit = web.findElement(By.cssSelector("button[type='submit']"));
        submit.click();
        WebElement err = web.findElement(By.cssSelector(".flash.error"));
        System.out.println(err.getText());
    }
    
}
