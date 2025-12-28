package com.locators.practice;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
         * =========================
         * THREAD.SLEEP (Hard Wait)
         * =========================
         * - Pauses execution for fixed time
         * - Does NOT check any condition
         * - NOT recommended in real projects
         * - Used only for learning or debugging
         */
        Thread.sleep(3000); // waits for 3 seconds (hard wait)

        /*
         * =========================
         * IMPLICIT WAIT
         * =========================
         * - Applied globally
         * - WebDriver waits up to given time
         *   before throwing NoSuchElementException
         * - Set once, applies to all findElement calls
         */
        driver.manage()
              .timeouts()
              .implicitlyWait(Duration.ofSeconds(10));

        /*
         * =========================
         * EXPLICIT WAIT
         * =========================
         * - Waits for a specific condition
         * - More reliable than implicit wait
         * - Recommended in real-time projects
         */
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(
                By.xpath("//div[@class='loader']")));

        // Now safe to click
        driver.findElement(By.id("submit")).click();


        
        
        
        /*
         * Example usage (commented for learning):
         *
         * explicitWait.until(
         *     ExpectedConditions.visibilityOfElementLocated(By.id("email"))
         * );
         */

        /*
         * =========================
         * FLUENT WAIT
         * =========================
         * - Advanced form of Explicit Wait
         * - Custom polling interval
         * - Can ignore specific exceptions
         * - Used for highly dynamic elements
         */
        Wait<WebDriver> fluentWait =
                new FluentWait<>(driver)
                        .withTimeout(Duration.ofSeconds(10))
                        .pollingEvery(Duration.ofSeconds(2))
                        .ignoring(NoSuchElementException.class);

        /*
         * Example usage (commented):
         *
         * fluentWait.until(driver ->
         *     driver.findElement(By.id("email"))
         * );
         */

        // Close browser
        driver.quit();
    }
}
