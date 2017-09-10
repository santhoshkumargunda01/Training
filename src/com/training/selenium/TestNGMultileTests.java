package com.training.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultileTests {
	
	@Test
	@Parameters("Browser")
	public void multipleTest(String browser){
		WebDriver driver;

		if(browser.equalsIgnoreCase("firefox")){		
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://medialize.github.io/jQuery-contextMenu/demo.html");
			driver.manage().window().maximize();
		}
		else{
			
			System.setProperty("webdriver.chrome.driver", "D:\\santosh\\Raj\\Training\\Training\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.navigate().to("http://google.com");
		}



	}

}
