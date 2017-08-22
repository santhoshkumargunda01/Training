package com.training.selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cookies {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.flipcart.com");
		driver.manage().window().maximize();
		
		Cookie name = new Cookie("mycookie", "123456789123");
		driver.manage().addCookie(name);
		
		//Get all cookies
		Set<Cookie> cookies = driver.manage().getCookies();
		
		for(Cookie cookie:cookies){
			System.out.println(cookie.getName());
		}
		
		//Delete cookie with name
		driver.manage().deleteCookieNamed("SN");
		
		//Delete all cookies 
		driver.manage().deleteAllCookies();
		
		Set<Cookie> aftercookies = driver.manage().getCookies();
		
		for(Cookie cookie:aftercookies){
			System.out.println("Aftert"+cookie.getName());
		}
		
		
		
	}

}
