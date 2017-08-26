package com.training.selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoITExample {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/automation-practice-form");
		driver.manage().window().maximize();
		
		
		//Click Browse button in the web page 
	    driver.findElement(By.id("photo")).click(); 
	    //To run Executable file created by Auto IT 
	    Runtime.getRuntime().exec("C:\\Users\\BhagyaSri\\Desktop\\ss class\\upload.exe");
 
	    Thread.sleep(5000); 
	    
	    //to Close the current browser window which is associated with driver instance 
	    driver.close();
	    
	    
	    /*
	     1. Install Auto It tool and editor 
	     2. Write auto It script in the scite editor 
	     3. Save the file with .au3 extension
	     4. Compile the file by doing right click on .au3 file 
	     5. give the path of .exe file in the above runtime command
	     	     
	     */
	    
	    
	    
		
	}

}
