package com.training.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandle {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Prompt Pop up']")).click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Text");
		alert.dismiss();
		
	}

}
