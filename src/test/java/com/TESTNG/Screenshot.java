package com.TESTNG;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	@Test
	public void screenshot() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost:8888");
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		
		String dest = "../TYSS_MANOJ/screenshots/Vtiger.png";
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		File destpath = new File(dest);
		Files.copy(src, destpath);
		
		
	}
}
