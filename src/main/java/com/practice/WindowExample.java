package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class WindowExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");

        String mainWindow = driver.getWindowHandle();

        driver.findElement(By.linkText("Click Here")).click();

        Set<String> allWindows = driver.getWindowHandles();

        for (String handle : allWindows) {
            if (!handle.equals(mainWindow)) {
                driver.switchTo().window(handle);
            }
        }

        System.out.println("New window title: " + driver.getTitle());

        driver.close();
        driver.switchTo().window(mainWindow);
        System.out.println("Back on: " + driver.getTitle());

        driver.quit();
    }
}