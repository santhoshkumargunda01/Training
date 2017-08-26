package com.training.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExample {
	
	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://store.demoqa.com/");
		driver.manage().window().maximize();	
		//to refresh the web page
		driver.navigate().refresh();
		
		//Select an web element		
		WebElement element = driver.findElement(By.linkText("Product Category"));
		
		//Creating object for Actions class
		Actions action = new Actions(driver);		
			 
        //Moving mouse to a particular element to perform mouse hover action
		action.moveToElement(element).build().perform();
 
		//Click Sub menu Item 'iPads'
        driver.findElement(By.linkText("iPads")).click();
		
		
        //What is diff between actions and action?
        //Actions is class and action is interface 
		
	}

}
