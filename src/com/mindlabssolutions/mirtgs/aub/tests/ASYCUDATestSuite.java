package com.mindlabssolutions.mirtgs.aub.tests;

import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ASYCUDATestSuite 
{
	private Logger logger = org.apache.log4j.LogManager.getLogger(getClass());
	
    private final  String BASE_URL = "http://localhost:3200";
    String driverPath = "C:\\geckodriver.exe";
    public WebDriver webDriver ; 
	
	@Test
	public void testASYCUDA() 
	{
		logger.info("starting aub asycuda testing");
		
		System.setProperty("webdriver.chrome.driver", "/media/bibilmchacko/mindlabs/Development/SeleniumDrivers/chromedriver");
		this.webDriver=new ChromeDriver();
		this.webDriver.get(BASE_URL);		
		
		
		
	}
	
	
}
