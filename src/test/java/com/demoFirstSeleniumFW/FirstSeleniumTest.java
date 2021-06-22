package com.demoFirstSeleniumFW;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {
	
	

	//  open the Browser
	//  Navigate URl
	//  Find the search Box
	// Enter the search button
	// Click on search button

	
	
	public static void main(String[] args) {
	
		// open the Browser
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  // Maximize the windows
		
		// Navigate URL
		
		driver.get("https://amazon.in");
		
		// Perform an operation
		// Find the Element
		// performed the operation
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("i-phone");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		// close the Browser
		driver.quit(); 
		
		
	}
	
	
	

}
