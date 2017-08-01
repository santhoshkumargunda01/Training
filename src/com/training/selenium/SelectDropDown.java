package com.training.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectDropDown {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//select[@id='continents']"));
		
		Select ddnContinents = new Select(element);
		
		ddnContinents.selectByIndex(2);
		ddnContinents.selectByVisibleText("Europe");
		
		Select ddnSeleniumCommands = new Select(driver.findElement(By.xpath("//select[@name='selenium_commands']")));
		
		ddnSeleniumCommands.selectByIndex(4);
		ddnSeleniumCommands.selectByVisibleText("Wait Commands");
		
		ddnSeleniumCommands.deselectByIndex(4);
		ddnSeleniumCommands.deselectByVisibleText("Wait Commands");
		
		ddnSeleniumCommands.selectByVisibleText("WebElement Commands");
		
		System.out.println(ddnContinents.getFirstSelectedOption().getText());
		
		
		
		
	}

}
