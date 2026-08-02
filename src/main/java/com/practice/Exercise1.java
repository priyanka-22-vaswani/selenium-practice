package com.practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {
    public static void main(String[] args)
    {
        WebDriver web = new ChromeDriver();
        web.get("https://the-internet.herokuapp.com");
        System.out.println("Page Title" + web.getTitle());
    }
    
}
