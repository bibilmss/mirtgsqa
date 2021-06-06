package com.mindlabssolutions.mirtgs.aub.tests;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.paulhammant.ngwebdriver.NgWebDriver;

public class ASYCUDASIGTASOfllineestSuite {
	private final Logger LOGGER = org.apache.log4j.LogManager.getLogger(getClass());

	private final String BASE_URL = "http://localhost:3200";
	private final String DRIVER_PATH_CHROME = "D:\\Demo\\mirtgsqa\\drivers\\chromedriver.exe";
	public WebDriver webDriver;
	
	String offlineAsycudaId = "123123";

	@Test
	public void testASYCUDAOffline() 
	{
		LOGGER.info("starting aub asycuda testing");

		System.setProperty("webdriver.chrome.driver", DRIVER_PATH_CHROME);
		this.webDriver = new ChromeDriver();
		this.webDriver.get(BASE_URL);
		WebElement loginButton = this.webDriver.findElement(By.xpath("//*[@id=\"form1\"]/button"));
		loginButton.click();
		JavascriptExecutor executor = (JavascriptExecutor) webDriver;
		NgWebDriver ngWebDriver = new NgWebDriver(executor);

		WebDriverWait myWaitVar = new WebDriverWait(webDriver, 20);
		String sideBarStr = "//*[@id=\"menu-toggle\"]";
		myWaitVar.until(ExpectedConditions.elementToBeClickable(By.xpath(sideBarStr)));
		WebElement sideBar = this.webDriver.findElement(By.xpath(sideBarStr));
		sideBar.click();

		String transactionStr = "//*[@id=\"sidebar-wrapper\"]/nav/ul/li[4]";
		myWaitVar.until(ExpectedConditions.elementToBeClickable(By.xpath(transactionStr)));
		WebElement transactionLink = this.webDriver.findElement(By.xpath(transactionStr));
		Point location = transactionLink.getLocation();

		Actions actions = new Actions(webDriver);
		actions.moveByOffset(location.getX(), location.getY()).build().perform();

		String asycudaOfflineStr = "//*[@id=\"sidebar-wrapper\"]/nav/ul/li[4]/ul/li[2]/a";
		myWaitVar.until(ExpectedConditions.elementToBeClickable(By.xpath(asycudaOfflineStr)));
		WebElement asycudaOffline = this.webDriver.findElement(By.xpath(asycudaOfflineStr));
		myWaitVar.until(ExpectedConditions.elementToBeClickable(asycudaOffline));
		asycudaOffline.click();
		
		String asycudaInputBox = "//*[@id=\"page-content-wrapper\"]/div[2]/div/div/app-asycuda-transfer/div/div/div[2]/div[1]/div/div/div[2]/input";
		By asycudaInputBoxXPath = By.xpath(asycudaInputBox);
		myWaitVar.until(ExpectedConditions.elementToBeClickable(asycudaInputBoxXPath));
		WebElement asycudaInputBoxXpath = this.webDriver.findElement(asycudaInputBoxXPath);
		asycudaInputBoxXpath.sendKeys(offlineAsycudaId);
		
		String asycudaFetchBtnStr="//*[@id=\"page-content-wrapper\"]/div[2]/div/div/app-asycuda-transfer/div/div/div[2]/div[2]/div/div/div[3]/button";
		By asycudaFetchBtnXpath = By.xpath(asycudaFetchBtnStr);
		myWaitVar.until(ExpectedConditions.elementToBeClickable(asycudaFetchBtnXpath));
		WebElement asycudaFetchBtn = this.webDriver.findElement(asycudaFetchBtnXpath);
		asycudaFetchBtn.click();
		
	}
	@Test
	public void testSIGTASOffline() 
	{
		LOGGER.info("starting aub asycuda testing");

		System.setProperty("webdriver.chrome.driver", DRIVER_PATH_CHROME);
		this.webDriver = new ChromeDriver();
		this.webDriver.get(BASE_URL);
		WebElement loginButton = this.webDriver.findElement(By.xpath("//*[@id=\"form1\"]/button"));
		loginButton.click();
		JavascriptExecutor executor = (JavascriptExecutor) webDriver;
		NgWebDriver ngWebDriver = new NgWebDriver(executor);

		WebDriverWait myWaitVar = new WebDriverWait(webDriver, 20);
		String sideBarStr = "//*[@id=\"menu-toggle\"]";
		myWaitVar.until(ExpectedConditions.elementToBeClickable(By.xpath(sideBarStr)));
		WebElement sideBar = this.webDriver.findElement(By.xpath(sideBarStr));
		sideBar.click();

		String transactionStr = "//*[@id=\"sidebar-wrapper\"]/nav/ul/li[4]";
		myWaitVar.until(ExpectedConditions.elementToBeClickable(By.xpath(transactionStr)));
		WebElement transactionLink = this.webDriver.findElement(By.xpath(transactionStr));
		Point location = transactionLink.getLocation();

		Actions actions = new Actions(webDriver);
		actions.moveByOffset(location.getX(), location.getY()).build().perform();
//
//		String asycudaOfflineStr = "//*[@id=\"sidebar-wrapper\"]/nav/ul/li[4]/ul/li[2]/a";
//		myWaitVar.until(ExpectedConditions.elementToBeClickable(By.xpath(asycudaOfflineStr)));
//		WebElement asycudaOffline = this.webDriver.findElement(By.xpath(asycudaOfflineStr));
//		myWaitVar.until(ExpectedConditions.elementToBeClickable(asycudaOffline));
//		asycudaOffline.click();
//		
//		String asycudaInputBox = "//*[@id=\"page-content-wrapper\"]/div[2]/div/div/app-asycuda-transfer/div/div/div[2]/div[1]/div/div/div[2]/input";
//		By asycudaInputBoxXPath = By.xpath(asycudaInputBox);
//		myWaitVar.until(ExpectedConditions.elementToBeClickable(asycudaInputBoxXPath));
//		WebElement asycudaInputBoxXpath = this.webDriver.findElement(asycudaInputBoxXPath);
//		asycudaInputBoxXpath.sendKeys(offlineAsycudaId);
//		
//		String asycudaFetchBtnStr="//*[@id=\"page-content-wrapper\"]/div[2]/div/div/app-asycuda-transfer/div/div/div[2]/div[2]/div/div/div[3]/button";
//		By asycudaFetchBtnXpath = By.xpath(asycudaFetchBtnStr);
//		myWaitVar.until(ExpectedConditions.elementToBeClickable(asycudaFetchBtnXpath));
//		WebElement asycudaFetchBtn = this.webDriver.findElement(asycudaFetchBtnXpath);
//		asycudaFetchBtn.click();
		
	}

}
