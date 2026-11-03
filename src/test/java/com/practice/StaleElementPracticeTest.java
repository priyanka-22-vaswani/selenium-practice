package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.practice.base.BaseTest;

  public class StaleElementPracticeTest extends BaseTest {

  

    @Test
    public void checkingStaleElement() {
           WebDriver driver = getDriver();
        driver.get("https://www.google.com");

        driver.findElement(By.name("q"));

        driver.navigate().refresh();

        driver.findElement(By.name("q")).sendKeys("Selenium");
    }

   
}