package com.training.selenium;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("Before suite method");
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("Before Test method");
	}
	
	
	@Test
	public void beforeTestTag(){
		System.out.println("Before test tag method");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Before Method method");
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("Before class method");
	}
	

}
