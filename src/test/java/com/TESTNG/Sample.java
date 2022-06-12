package com.TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(Listners_01.class)
public class Sample {

	static WebDriver sdriver;
	WebDriver driver;
	
	@BeforeClass
	public void bc()
	{

		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		sdriver = driver;
	}
	
	@Test
	public void org() throws InterruptedException
	{
		
		driver.get("http://localhost:8888");
		WebElement un = driver.findElement(By.name("user_name"));
		un.sendKeys("admin");

		WebElement pwd = driver.findElement(By.name("user_password"));
		pwd.sendKeys("admin");

		WebElement log = driver.findElement(By.id("submitButton"));
		log.click();
		Assert.assertEquals(false, true);

		Thread.sleep(3000);
	      
	}
	public void contact() throws InterruptedException
	{
		
		driver.get("http://localhost:8888");
		WebElement un = driver.findElement(By.name("user_name"));
		un.sendKeys("admin");

		WebElement pwd = driver.findElement(By.name("user_password"));
		pwd.sendKeys("admin");

		WebElement log = driver.findElement(By.id("submitButton"));
		log.click();
		Assert.assertEquals(false, true);

		Thread.sleep(3000);
	      
	}
}
