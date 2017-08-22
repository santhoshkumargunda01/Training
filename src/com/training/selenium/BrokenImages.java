package com.training.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenImages {
	private static int invalidImageCount;

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://google.com");
		driver.manage().window().maximize();
		validateInvalidImages(driver);
		
	}

	public static void validateInvalidImages(WebDriver driver) {
		try {
			int invalidImageCount = 0;
			//Finding all links using tag name locator type
			List<WebElement> imagesList = driver.findElements(By.tagName("img"));
			System.out.println("Total no. of images are " + imagesList.size());
			//Looping over all the links and verify the link is valid
			for (WebElement imgElement : imagesList) {
				if (imgElement != null) {
					verifyimageActive(imgElement);
				}
			}
			System.out.println("Total no. of invalid images are "	+ invalidImageCount);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}


	public static void verifyimageActive(WebElement imgElement) {
		try {
			//Creaing an object to HTTP client
			HttpClient client = HttpClientBuilder.create().build();
			//Get the value of 'src' attribute of image (web element)  
			HttpGet request = new HttpGet(imgElement.getAttribute("src"));
			HttpResponse response = client.execute(request);
			// verifying response code he HttpStatus should be 200 if not,
			// increment as invalid images count
			if (response.getStatusLine().getStatusCode() != 200)
				invalidImageCount++;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Success code '200'
		//Server not found/down code 500
		//Client request is invalid/client request error code 400
		
	
}

}


