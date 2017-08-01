package com.training.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementCommands {
		
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test");
		
		driver.findElement(By.xpath("//input[@name='firstname']")).clear();
		
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		System.out.println(driver.findElement(By.xpath("//input[@name='firstname']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//button[@id='submit']")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//input[@value='Manual Tester']")).isSelected());
		
		driver.findElement(By.xpath("//button[@id='submit']")).submit();
		
		System.out.println(driver.findElement(By.xpath("//strong[text()='PERSONAL INFORMATION']")).getText());
		System.out.println(driver.findElement(By.xpath("//strong[text()='PERSONAL INFORMATION']")).getTagName());
		
		System.out.println(driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("name"));
		
		System.out.println(driver.findElement(By.xpath("//input[@name='firstname']")).getSize());
		System.out.println(driver.findElement(By.xpath("//input[@name='firstname']")).getLocation());
		
		
		List<WebElement> lstCheckBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for (int i = 0; i < lstCheckBox.size(); i++) {
			if(!(lstCheckBox.get(i).isSelected())){
			lstCheckBox.get(i).click();
			}
		}
		
		
		
		driver.close();
	}

}
