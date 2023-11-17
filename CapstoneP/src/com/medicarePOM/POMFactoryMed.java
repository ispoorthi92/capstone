package com.medicarePOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class POMFactoryMed {

		public WebDriver driver;
		
	String url="http://localhost:8080/medicare_1/";
	
		
	By Login = By.id("login");
	By UserID = By.id("username");
	By Password = By.id("password");
	By Loginin = By.xpath("//input[@value='Login']");
	By Product = By.xpath("//a[text()=\"View Products\"]");
	//Add this
	By Tablet = By.xpath("//a[@class=\"btn btn-success\"][1]");
	By CheckOut = By.xpath("//a[@class=\"btn btn-success btn-block\"]");
	By Select = By.xpath("//a[text()='Select']");
	By Pay = By.xpath("//a[text()='Pay']");
	
	public POMFactoryMed(ChromeDriver driver) {
		this.driver=driver;
	}

	/*public void MedicarePage(WebDriver driver)
	{
		this.driver=driver;
	}*/

	public void clickonLogin()
	{
		driver.findElement(Login).click();
	}
	
	public void EnterUserID(String email)
	{
		driver.findElement(UserID).sendKeys(email);
	}

	public void EnterPassword(String string)
	{
		driver.findElement(Password).sendKeys (string);
	}
	
	public void clickonLoginin()
	{
		driver.findElement(Loginin).click();
	}
	
	public void ViewProduct()
	{
		driver.findElement(Product).click();
		//WebElement Product = driver.findElement(By.xpath("//a[@href='/medicare/show/1/product']"));
		//Product.click();
	}
	
	public void Tablet() {
		driver.findElement(Tablet).click();

	}
	public void CheckOut() {
		driver.findElement(CheckOut).click();
	}
	public void Select() {
		driver.findElement(Select).click();
	}
	public void Pay() {
		driver.findElement(Pay).click();

	}
	}

