package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickInterceptedPracticeTest {
    WebDriver driver;

    @BeforeMethod
    public void startBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/entry_ad");
      
    }

    @Test
    public void clickInterceptedException()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
          wait.until(
        ExpectedConditions.visibilityOfElementLocated(
            By.cssSelector(".modal")
            )
        );

        driver.findElement(By.cssSelector(".modal-footer p")).click();

    wait.until(
        ExpectedConditions.invisibilityOfElementLocated(
            By.cssSelector(".underlay")
        )
    );

    driver.findElement(By.id("restart-ad")).click();

    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
    
}
