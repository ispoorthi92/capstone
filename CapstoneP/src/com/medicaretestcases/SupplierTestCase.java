package com.medicaretestcases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.medicarePOM.POMFactoryMed;


public class SupplierTestCase {
public WebDriver driver;
	
    POMFactoryMed pf;
	
	@BeforeMethod
	
	public void StartBrowser() throws MalformedURLException, InterruptedException 
	{
		System.setProperty("WebDriver.chome.driver", ".\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	//	driver.manage().window().maximize();
	   Thread.sleep(3000);
		driver.get(GlobalVariable.url);
		Thread.sleep(10000);
		
		pf = new POMFactoryMed(driver);
		
		}
	
   @Test
	
	public void LoginTestcase() throws InterruptedException
	{
	    pf.clickonLogin();
		
		Thread.sleep(4000);
		pf.EnterUserID("spoorthi@supplier.com");
		
		Thread.sleep(4000);
		pf.EnterPassword("Dhruvika");
		
		Thread.sleep(4000);
		pf.clickonLoginin();
		
		Thread.sleep(4000);
		pf.ViewProduct();
		
		Thread.sleep(4000);
		pf.Tablet();
		
		Thread.sleep(4000);
		pf.CheckOut();
		
		Thread.sleep(4000);
		pf.Select();
		
		Thread.sleep(4000);
		pf.Pay();
		
		Thread.sleep(2000);
	}
	
	@AfterMethod()
	
	public void closeBrowser() 
	{
		driver.close(); 
	}
}