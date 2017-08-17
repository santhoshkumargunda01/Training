package com.training.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrolling {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String URL = "https://www.linkedin.com/";
		driver.get("https://www.linkedin.com/");
		driver.manage().window().maximize();	
		
		 ((JavascriptExecutor) driver)
         .executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 
		 
		 driver.navigate().to(URL+"directory/companies?trk=hb_ft_companies_dir");
		 WebElement element = driver.findElement(By.linkText("Import/Export"));
			((JavascriptExecutor) driver).executeScript(
	                "arguments[0].scrollIntoView();", element);
			
			driver.navigate().to(URL+"job/?trk=hb_ft_jobs");
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		
	
	}

}
