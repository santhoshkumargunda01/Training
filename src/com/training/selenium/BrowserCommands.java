package com.training.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			
		driver.get("http://demoqa.com/");	
		driver.manage().window().maximize();
		driver.getTitle();
		driver.getCurrentUrl();
		driver.getPageSource();		
		driver.navigate().to("http://demoqa.com/about-us/");		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();	
		
		driver.close();
		
	}
	
	
}
