package com.training.selenium;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class RightClick {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://medialize.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
	
		//Explicit wait: waiting for an element presence
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='context-menu-one btn btn-neutral']")));
		
		//Finding an element and store it in a web element variable
		By locator =By.xpath("//span[@class='context-menu-one btn btn-neutral']");
		WebElement element=driver.findElement(locator);
		
		//Perform Right click 
		rightClick(driver,element);
		
		//Find an element in menu which is displayed after right click
		WebElement elementEdit =driver.findElement(By.xpath("/html/body/ul/li[1]"));
		elementEdit.click();
		
		//Switching to an alert and get the text on it 
		Alert alert=driver.switchTo().alert();
		String textEdit = alert.getText();
		System.out.println(textEdit);
		Assert.assertEquals(textEdit, "clicked: edit", "Failed to click on Edit link");
		
		
	}
	
	
	public static void rightClick(WebDriver driver, WebElement element) {
		try {
			Actions action = new Actions(driver);
			action.contextClick(element).build().perform();
			System.out.println("Sucessfully Right clicked on the element");
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document "
					+ e.getStackTrace());
		} catch (NoSuchElementException e) {
			System.out.println("Element " + element + " was not found in DOM "
					+ e.getStackTrace());
		} catch (Exception e) {
			System.out.println("Element " + element + " was not clickable "
					+ e.getStackTrace());
		}
	}

}
