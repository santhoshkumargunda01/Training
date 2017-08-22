package com.training.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class AuthenticationWindow {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Passing user name and password in the URL 
		driver.get("http://admin:admin@yoururl.com");
		driver.manage().window().maximize();
		//Get the text of home element
		String text = driver.findElement(By.className("home")).getText();
		//Asserting text
		Assert.assertTrue(text.contains("Welcome"), "Basic Authentication failed");
		
		
		
		
	}
	

}
