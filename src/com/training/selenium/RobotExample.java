package com.training.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class RobotExample {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://my.monsterindia.com/create_account.html");
		driver.manage().window().maximize();
		
		 // This will scroll down the page 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("scroll(0,350)");
		 
		// Wait for 5 seconds
		 Thread.sleep(5000);
		 
		// This will click on Browse button
		 driver.findElement(By.id("wordresume")).click();		 
		 
		 
		 System.out.println("Browse button clicked");
		
		
		Robot robot = new Robot();
		 Thread.sleep(1000);
		      
		// Press Enter
		 robot.keyPress(KeyEvent.VK_ENTER);
		 
		// Release Enter
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		  // Press CTRL+V
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 
		// Release CTRL+V
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_V);
		 Thread.sleep(1000);
		        
		 //Press Enter 
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

}
