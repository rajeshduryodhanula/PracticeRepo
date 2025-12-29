package com.locators.practice;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsDemo {

    public static void main(String[] args) throws InterruptedException {

        // Step 1: Launch browser
        WebDriver driver = new ChromeDriver();

        /*
         * =================================================
         * THREAD.SLEEP (Hard Wait)
         * =================================================
         * - Stops execution for fixed time
         * - Not condition-based
         * - NOT recommended in real projects
         * - Used only for debugging or learning
         */
        Thread.sleep(3000);

        /*
         * =================================================
         * IMPLICIT WAIT
         * =================================================
         * - Global wait
         * - Applied to all findElement() calls
         * - Waits until element is found or timeout occurs
         */
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://example.com");
        driver.manage().window().maximize();

        /*
         * =================================================
         * EXPLICIT WAIT (MOST IMPORTANT)
         * =================================================
         * - Waits for specific condition
         * - Best practice in real automation frameworks
         */
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        /*
         * ---------- Common ExpectedConditions ----------
         */

        // 1️⃣ Wait until element is visible
        WebElement emailField = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("email"))
        );
        emailField.sendKeys("test@gmail.com");

        // 2️⃣ Wait until element is clickable
        WebElement submitButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("submit"))
        );
        submitButton.click();

        // 3️⃣ Wait until element is present in DOM (may not be visible)
        wait.until(
                ExpectedConditions.presenceOfElementLocated(By.id("password"))
        );

        // 4️⃣ Wait until element disappears
        wait.until(
                ExpectedConditions.invisibilityOfElementLocated(By.className("loader"))
        );

        // 5️⃣ Wait until text is present in element
        wait.until(
                ExpectedConditions.textToBePresentInElementLocated(
                        By.id("message"), "Success")
        );

        // 6️⃣ Wait until title contains text
        wait.until(
                ExpectedConditions.titleContains("Dashboard")
        );

        // 7️⃣ Wait until alert is present
        wait.until(
                ExpectedConditions.alertIsPresent()
        );
        driver.switchTo().alert().accept();

        // 8️⃣ Wait until frame is available and switch to it
        wait.until(
                ExpectedConditions.frameToBeAvailableAndSwitchToIt("frameName")
        );

        // 9️⃣ Wait until element is selected (checkbox / radio)
        wait.until(
                ExpectedConditions.elementToBeSelected(By.id("rememberMe"))
        );

        /*
         * =================================================
         * FLUENT WAIT
         * =================================================
         * - Advanced version of Explicit Wait
         * - Custom polling time
         * - Can ignore specific exceptions
         * - Used for highly dynamic elements
         */
        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);

        // Fluent wait example
        WebElement dynamicElement = fluentWait.until(
                drv -> drv.findElement(By.id("dynamicElement"))
        );
        dynamicElement.click();

        /*
         * =================================================
         * Close browser
         * =================================================
         */
        driver.quit();
    }
}
