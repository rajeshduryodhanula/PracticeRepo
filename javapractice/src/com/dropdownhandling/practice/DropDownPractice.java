package com.dropdownhandling.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownPractice {

    public static void main(String[] args) throws InterruptedException {

        // Step 1: Launch browser
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();

        // Hard wait (learning purpose only)
        Thread.sleep(3000);

        /*
         * =================================================
         * AUTO-SUGGESTION DROPDOWN (NOT <select>)
         * =================================================
         */

        // Trigger auto-suggestion by entering partial text
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(3000);

        // Capture all auto-suggestion options
        List<WebElement> countryOptions =
                driver.findElements(By.cssSelector("li.ui-menu-item a"));

        for (WebElement option : countryOptions) {

            // Reference: DOM text approach (backup)
            // System.out.println(option.getAttribute("innerText"));

            // Best practice: visible UI text
            if (option.getText().equalsIgnoreCase("India")) {
                option.click();
                break;
            }
        }

        /*
         * =================================================
         * STATIC DROPDOWN (<select>) – Currency
         * =================================================
         */

        WebElement currencyDropdown =
                driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

        Select currencySelect = new Select(currencyDropdown);

        // Reference selection methods
        // currencySelect.selectByIndex(3);
        // currencySelect.selectByVisibleText("AED");

        currencySelect.selectByValue("INR");

        System.out.println("Selected Currency: "
                + currencySelect.getFirstSelectedOption().getText());

        /*
         * =================================================
         * PASSENGER DROPDOWN (Dynamic)
         * =================================================
         */

        driver.findElement(By.id("divpaxinfo")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Increase Adult count to 5 (using while loop)
        int adultCount = 1;
        while (adultCount < 5) {
            wait.until(ExpectedConditions.elementToBeClickable(By.id("hrefIncAdt")));
            driver.findElement(By.id("hrefIncAdt")).click();
            adultCount++;
        }

        // Increase Child count to 2 (using for loop)
        for (int i = 0; i < 2; i++) {
            driver.findElement(By.id("hrefIncChd")).click();
        }

        // Close passenger popup
        driver.findElement(By.id("btnclosepaxoption")).click();

        System.out.println("Passenger Info: "
                + driver.findElement(By.id("divpaxinfo")).getText());

        /*
         * =================================================
         * FROM & TO CITY DROPDOWN (Dynamic XPath)
         * =================================================
         */

        // Open FROM city dropdown
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
        Thread.sleep(2000);

        /*
         * -------- FROM CITY XPath OPTIONS (REFERENCE) --------
         */

        // ❌ Index-based XPath (NOT recommended)
        // WebElement fromCity =
        // driver.findElement(By.xpath("(//a[@value='BLR'])[1]"));

        // ❌ Text-based XPath (may fail if text changes)
        // WebElement fromCity =
        // driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']"));

        // ✅ BEST PRACTICE: Parent → Child XPath
        WebElement fromCity =
                driver.findElement(By.xpath(
                        "//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='BLR']"));

        System.out.println("FROM City Selected: " + fromCity.getText());
        fromCity.click();

        Thread.sleep(2000);

        /*
         * -------- TO CITY XPath OPTIONS (REFERENCE) --------
         */

        // ❌ Index-based XPath
        // WebElement toCity =
        // driver.findElement(By.xpath("(//a[@value='MAA'])[2]"));

        // ✅ BEST PRACTICE: Destination container + child
        WebElement toCity =
                driver.findElement(By.xpath(
                        "//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']"));

        System.out.println("TO City Selected: " + toCity.getText());
        toCity.click();

        /*
         * =================================================
         * Close browser
         * =================================================
         */
        driver.quit();
    }
}
