package com.training.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrolling {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String URL = "https://www.linkedin.com/";
		driver.get("https://www.linkedin.com/");
		driver.manage().window().maximize();	
		
		//Scrolling web application window until the scroll height
		((JavascriptExecutor) driver)
         .executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 
		 //Scroll the web page until the required web element is visible
		driver.navigate().to("http://jqueryui.com/tooltip/");
		 WebElement element = driver.findElement(By.xpath("//a[text()='API documentation']"));
			((JavascriptExecutor) driver).executeScript(
	                "arguments[0].scrollIntoView();", element);
			
			//scroll the web page based on the height
			driver.navigate().to(URL+"job/?trk=hb_ft_jobs");
			Thread.sleep(4000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
			
			//Java script executor is used to execute java script to handle element which is developed in jquery, java script and Angular JS
		
	
	
			
			
	}

}
