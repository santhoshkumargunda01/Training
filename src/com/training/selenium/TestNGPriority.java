package com.training.selenium;

import org.testng.annotations.Test;

public class TestNGPriority {
	
	@Test(priority=3)
	public void firstTest(){
		System.out.println("Am in First Test Method");
	}
	
	@Test(priority=1)
	public void SecondTest(){
		System.out.println("Am in SecondTest Method");
	}
	
	@Test(priority=2)
	public void ThirdTest(){
		System.out.println("Am in Third Test Method");
	}

}
