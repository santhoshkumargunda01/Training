package com.training.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGOptional {
	
	@Test
	@Parameters({"Browser","Optional_parameter"})
	public void multipleTest(String browser,@Optional String param ){
		WebDriver driver;

		if(browser.equalsIgnoreCase("firefox")){		
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://medialize.github.io/jQuery-contextMenu/demo.html");
			driver.manage().window().maximize();
			System.out.println("********************"+param);
		}
		else{
			
			System.setProperty("webdriver.chrome.driver", "D:\\santosh\\Raj\\Training\\Training\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.navigate().to("http://google.com");
			System.out.println("********************"+param);
		}

	}
}
