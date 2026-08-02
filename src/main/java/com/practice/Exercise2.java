package com.practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise2 {
    public static void main(String[] args)
    {
        WebDriver web = new ChromeDriver();
        web.get("https://the-internet.herokuapp.com");
       
        WebElement homePageTitle = web.findElement(By.tagName("h1"));
        System.out.println(homePageTitle.getText());

    }
    
}
