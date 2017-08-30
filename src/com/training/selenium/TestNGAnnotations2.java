package com.training.selenium;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestNGAnnotations2 {
	
	@AfterSuite
	public void aftersuite(){
		System.out.println("After suite");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("After Class");
	}
		
	@AfterTest
	public void afterTest(){
		System.out.println("After test");
	}
	@AfterMethod
	public void afterMethod(){
		System.out.println("After Method");
	}
	
	@Test
	public void test(){
		System.out.println("in Test");
	}

	
}
