package com.training.selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windows {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		
		
		WebElement btnNewWindow = driver.findElement(By.id("button1")); 
 
		//Parent window
		String parentWindowHandle = driver.getWindowHandle();
		//opens new window
		btnNewWindow.click();		
		//to get all windows
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		System.out.println(allWindowHandles.size());
		 
		//iterating set through for each loop
		for(String handle : allWindowHandles)
		{
			System.out.println("Window handle - > " + handle);
			driver.switchTo().window(handle);
			driver.manage().window().maximize();
		
		}
		
	
		//Clicking element in new window
		
		driver.findElement(By.xpath("(//ul[@id='primary-menu']//li)[1]")).click();
		
		driver.switchTo().window(parentWindowHandle);
		
		driver.findElement(By.xpath("//button[text()='New Message Window']")).click();
 
	}
		
	}


