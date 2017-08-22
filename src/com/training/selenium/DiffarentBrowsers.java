package com.training.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DiffarentBrowsers {
	
	public static void main(String[] args) {
		System.out.println("launching chrome browser");
		

		WebDriver driver;
		
		//Setting chrome driver executable path 
		/*System.setProperty("webdriver.chrome.driver", "D:\\santosh\\anotherWS\\SeleniumTraining\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//Launching google.com in chrome 
		driver.navigate().to("http://google.com");*/
		
		System.setProperty("webdriver.ie.driver", "D:/santosh/anotherWS/SeleniumTraining/Drivers/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://google.com");
		
	}

}
