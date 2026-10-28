package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.practice.base.BaseTest;

public class WaitPracticeTest extends BaseTest {

    @Test
    public void dynamicLoadingTest() {
        WebDriver driver = getDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.tagName("button")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement helloWorldText = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("finish")));

        System.out.println(helloWorldText.getText());
    }
}