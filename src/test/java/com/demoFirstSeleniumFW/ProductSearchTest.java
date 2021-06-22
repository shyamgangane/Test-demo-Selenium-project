package com.demoFirstSeleniumFW;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductSearchTest {
	  
	WebDriver driver;
	
	@BeforeClass
	
	public  void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://amazon.in");
		
		
	}
	
	@Test
	
	public void testProductSearch() {
		WebElement searchElement = driver.findElement(By.id("twotabsearchtextbox"));
				searchElement.sendKeys("i-phone");
				
				driver.findElement(By.id("nav-search-submit-button")).click();
	

		
	}
	
	@AfterClass
	
	public void afterClass() {
		driver.quit();
		
	}

}
