package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NoSuchElementFound {
    @Test
    public void ExceptionTest()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().minimize();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username123")).sendKeys("tomsmith");
        driver.quit();
    }
    
}
