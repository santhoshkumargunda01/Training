package com.training.selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Assertions {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		System.out.println(driver.getTitle());
		
		Assert.assertEquals(title, "Demo Windows for practicing Selenium Automation", "Windows screen is displayed");
		
		//opens a new window
		WebElement element = driver.findElement(By.id("button1"));
		element.click();
		
		//to get all windows
		Set<String> windows = driver.getWindowHandles();
		
		//Verify weather two windows are present
		Assert.assertTrue(windows.size()==2, "Two windows are displayed");
		
		Assert.assertEquals(element.isDisplayed(),true);
		
		
		
		
		
		
		
		
		
		
		
	}

}
