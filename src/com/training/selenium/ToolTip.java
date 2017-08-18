package com.training.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ToolTip {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://docs.seleniumhq.org");
		driver.manage().window().maximize();	

		//Tools tip case 1	
		//Get the webelement using CSS locator 
		WebElement element = driver.findElement(By.cssSelector("#header>h1 a"));
		// Get tooltip text
		String toolTipText = element.getAttribute("title");
		System.out.println("Tool tip text present :- " + toolTipText);

		// Compare tool tip text
		Assert.assertEquals("Return to Selenium home page", toolTipText);
		toolTipCase2(driver);



	}


	public static void toolTipCase2(WebDriver driver) {
		driver.get("https://jqueryui.com/tooltip/");

		// As there is frame, we have to navigate to frame
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));

		// Text box field, where we mouse hover
		WebElement element = driver.findElement(By.id("age"));

		// Use action class to mouse hover on Text box field
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		WebElement toolTipElement = driver.findElement(By.xpath("//div[@role='tooltip']"));

		// To get the tool tip text and assert
		String toolTipText = toolTipElement.getText();
		System.out.println("Tool tip text "+toolTipText);
		Assert.assertEquals("We ask for your age only for statistical purposes.", toolTipText);

	}




}