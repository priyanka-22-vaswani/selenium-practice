package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class WindowsExercise {
    public static void main(String [] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");

        String mainWindow = driver.getWindowHandle();

        driver.findElement(By.linkText("Click Here")).click();

        Set<String> allWindiows = driver.getWindowHandles();

        for (String handle : allWindiows)
        {
            if(!handle.equals(mainWindow))
            {
                driver.switchTo().window(handle);
                WebElement title = driver.findElement(By.tagName("h3"));
                System.out.println("The title on new window is " + title.getText());
                 driver.close();
            }
        }
         driver.switchTo().window(mainWindow);
         WebElement maintitle = driver.findElement(By.tagName("h3"));
        System.out.println("The main window title is " + maintitle.getText());
       

    }
    
}
