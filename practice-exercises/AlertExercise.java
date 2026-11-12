package com.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExercise {
    public static void main (String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement alertButton = driver.findElement(By.cssSelector("button[onclick='jsConfirm()']"));
        alertButton.click();

        Alert alert = driver.switchTo().alert();
        System.out.println("The alert is " + alert.getText());
        alert.dismiss();

        System.out.println("Result - " + driver.findElement(By.id("result")).getText());


    }
}
