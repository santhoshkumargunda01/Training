package com.training.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DragAndDrop2 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();	

	
		//Explicit wait and frame switching
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//switching to frame using frame class name (used CSS locator)
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));

		//Finding source and destination elements
		WebElement Sourcelocator = driver.findElement(By.cssSelector("#draggable"));
		WebElement Destinationlocator = driver.findElement(By.cssSelector("#droppable"));

		//Perform drag and drop actions
		dragAndDrop(driver,Sourcelocator,Destinationlocator);

		//Perform assertion
		String actualText=driver.findElement(By.cssSelector("#droppable>p")).getText();
		Assert.assertEquals(actualText, "Dropped!");
	}

	//Perform drag and drop actions
	public static void dragAndDrop(WebDriver driver,WebElement sourceElement, WebElement destinationElement)
	{
		Actions action = new Actions(driver);
		action.dragAndDrop(sourceElement, destinationElement).build().perform();
		
	}



}


