package com.TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {
	

	@Test
	public void org() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost:8888");
		WebElement un = driver.findElement(By.name("user_name"));
	boolean value = un.isDisplayed();
	Assert.assertEquals(value, true);
	un.sendKeys("admin");
	
	    WebElement pwd = driver.findElement(By.name("user_password"));
	       boolean pwdvalue = pwd.isDisplayed();
	       
	       Assert.assertEquals(pwdvalue, true);
	       pwd.sendKeys("admin");
	       
	      WebElement log = driver.findElement(By.id("submitButton"));
	      boolean logvalue = log.isDisplayed();
	      Assert.assertEquals(logvalue, true);
	      log.click();
	      
	      Thread.sleep(3000);
	      
	}
	
}
