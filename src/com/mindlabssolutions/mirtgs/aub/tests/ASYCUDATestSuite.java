package com.mindlabssolutions.mirtgs.aub.tests;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.paulhammant.ngwebdriver.NgWebDriver;


public class ASYCUDATestSuite 
{
	private final Logger LOGGER = org.apache.log4j.LogManager.getLogger(getClass());
	
	
    private final  String BASE_URL = "http://localhost:3200";
    private final String DRIVER_PATH_CHROME = "D:\\Demo\\mirtgsqa\\drivers\\chromedriver.exe";
    public WebDriver webDriver ; 
	
	@Test
	public void testASYCUDAOffline() 
	{
		LOGGER.info("starting aub asycuda testing");
		
		System.setProperty("webdriver.chrome.driver", DRIVER_PATH_CHROME);
		this.webDriver=new ChromeDriver();
		this.webDriver.get(BASE_URL);	
		WebElement loginButton = 
				this.webDriver.findElement(By.xpath("//*[@id=\"form1\"]/button"));
		loginButton.click();
		 JavascriptExecutor executor = (JavascriptExecutor) webDriver;
		NgWebDriver ngWebDriver = new NgWebDriver(executor);
		
		 WebDriverWait myWaitVar = new WebDriverWait(webDriver,20);
			String sideBarStr= "//*[@id=\"menu-toggle\"]";
		 myWaitVar.until(ExpectedConditions.elementToBeClickable(By.xpath(sideBarStr)));
			WebElement sideBar = this.webDriver.findElement(By.xpath(sideBarStr));
			sideBar.click();
	
//		executor.executeScript("alert('Welcome to Guru99');");

		
		System.out.println();
		
		String asycudaLinkStr = "//*[@id=\"sidebar-wrapper\"]/nav/ul/li[4]/ul/li[2]/a";
		WebElement asycduaLink = this.webDriver.findElement(By.xpath(asycudaLinkStr));
		asycduaLink.click();
		
	}
	
	
}
