package com.locators.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {

	public static void main(String[] args) throws InterruptedException {

		// Test data
		String emailAddress = "rajeshasha@gmail.com";

		/*
		 * ========================= Step 1: Launch Browser =========================
		 */
		WebDriver driver = new ChromeDriver();

		/*
		 * ========================= Implicit Wait ========================= - Applied
		 * globally - WebDriver waits up to given time before throwing
		 * NoSuchElementException
		 */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://mail.google.com");
		driver.manage().window().maximize();
		System.out.println("Browser opened successfully");

		/*
		 * ========================= XPath Locator (Reusable) =========================
		 */
		driver.findElement(By.xpath(getEmailInputXPath())).sendKeys(emailAddress);

		System.out.println("Entered email successfully");

		/*
		 * ========================= XPath Locator for Next Button
		 * =========================
		 */
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();

		System.out.println("Clicked on Next button successfully");

		// Temporary hard wait (only for learning)
		Thread.sleep(5000);

		/*
		 * ========================= Error Message Validation =========================
		 */
		System.out.println("Heading Text: " + driver.findElement(By.cssSelector("#headingText")).getText());

		System.out.println("Error Message: " + driver.findElement(By.cssSelector("div[jsname='x2WF9']")).getText());

		/*
		 * ================================================= BELOW LOCATORS ARE GENERIC
		 * DEMO EXAMPLES (Not applicable to Gmail UI)
		 * =================================================
		 */

		// Using ID locator
		// driver.findElement(By.id("email")).sendKeys("Rajesh");

		// Using Name locator
		// driver.findElement(By.name("password")).sendKeys("Asha");

		// Using ClassName locator
		// driver.findElement(By.className("login-btn")).click();

		// Using TagName locator
		// driver.findElement(By.tagName("a")).click();
		// List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		// System.out.println("Total links: " + allLinks.size());

		// Using LinkText locator
		// driver.findElement(By.linkText("Login")).click();

		// Using PartialLinkText locator
		// driver.findElement(By.partialLinkText("Log")).click();

		/*
		 * ========================= CSS Selector Examples =========================
		 */

		// CSS selector using attribute
		// driver.findElement(By.cssSelector("input[type='email']")).sendKeys("test@gmail.com");

		// CSS selector using ID
		// driver.findElement(By.cssSelector("#email")).click();

		// CSS selector using class
		// driver.findElement(By.cssSelector(".login-btn")).click();

		/*
		 * ========================= Close Browser =========================
		 */
		driver.quit();
		System.out.println("Browser closed successfully");
	}

	/**
	 * Returns XPath for Gmail email input field Keeping this reusable helps in
	 * maintenance
	 */
	public static String getEmailInputXPath() {
		return "//input[@type='email']";
	}

}
