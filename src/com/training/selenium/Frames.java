package com.training.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
		driver.manage().window().maximize();	
		
		driver.navigate().refresh();	
		
		
		int frames = driver.findElements(By.tagName("iframe")).size();
		
		System.out.println(frames);
		
		//driver.switchTo().frame("IF2");
		
		//driver.switchTo().frame(1);
		
		//driver.switchTo().frame("iframe2");
		
		//driver.findElement(By.xpath("//div[@class='detail-entry']//a/img")).click();
		 		//Switch by Index
		
		
		//Switch by frame name
		//driver.switchTo().frame("iframe1");
		
		//Switch by frame ID
		//driver.switchTo().frame("IF1");
		
		WebElement iframeElement = driver.findElement(By.id("IF2"));
		
		
		//now use the switch command
		driver.switchTo().frame(iframeElement);
		
		driver.findElement(By.xpath("//div[@class='detail-entry']//a/img")).click();
		
		////Switch back to the main window
		driver.switchTo().defaultContent();
		
	}

}
