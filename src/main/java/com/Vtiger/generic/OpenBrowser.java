package com.Vtiger.generic;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {


	public static WebDriver driver;
	//public static void main(String[] args) throws EncryptedDocumentException, IOException {
public void LaunchBrowser() throws Throwable
{
		 PropertyFiles prop = new PropertyFiles(); 
		 // WebDriver driver;
		String BROWSER=	prop.readDataFromPropertyfiles("browser");

		if (BROWSER.equalsIgnoreCase("chrome")) 
		{
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		}
		else if (BROWSER.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		else
		{
			System.out.println("No Browser Provided Launching Default browser");
			driver= new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.get(prop.readDataFromPropertyfiles("url"));

//		driver.findElement(By.name("user_name")).sendKeys(prop.readDataFromPropertyfiles("username"));
//		driver.findElement(By.name("user_password")).sendKeys(prop.readDataFromPropertyfiles("password"));
//        driver.findElement(By.id("submitButton")).click();

}
	}

