package com.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExercise1 {
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement alertbutton = driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
        //System.out.println("The alert is " + alertbutton.getText());
        alertbutton.click();

        Alert alert = driver.switchTo().alert();
        //WebElement input = driver.findElement(By.id("textbox"));
        alert.sendKeys("Priyanka");
        alert.accept();
        System.out.println("Result " + driver.findElement(By.id("result")).getText());
    
    }   
    
}
