package com.training.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class GetCSSValues {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.manage().window().maximize();	
		
		driver.navigate().refresh();
		
		//Get the color of google search button before doing mouse hover  
		WebElement element = driver.findElement(By.name("btnK"));
		String beforeColor=element.getCssValue("color");
		System.out.println(beforeColor);
		
		//Get the color of google search button after doing mouse hover
		
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		System.out.println("Color of a button after mouse hover : "	+ element.getCssValue("color"));
		
		//get the size of the CSS value 
		
		System.out.println("Font Size of a button "	+ element.getCssValue("font-size"));
		
		//get the font weight
		System.out.println("Font Weight of a button "+element.getCssValue("font-weight") );
		
	}
		
		
		
	}


