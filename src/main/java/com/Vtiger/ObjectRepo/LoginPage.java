package com.Vtiger.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Vtiger.generic.PropertyFiles;

public class LoginPage { //Rule 1 Page Shpuld be class name

WebDriver driver;
	
//	FileUtility fileutility= new FileUtility();
	
	public LoginPage(WebDriver driver)  		//Rule 5 Use constructor for initilization
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="user_name")				//Rule 2 Use @findby annotation to loacte
	 WebElement usernametxtfld;		//Rule 3  Declare webelements as pvt
	
	@FindBy(name="user_password")
	private WebElement passwordtxtfld;
	
	@FindBy(id="submitButton")
	private WebElement loginbtn;

	public WebElement getUsernametxtfld() {  		//Rule 4 Provide getters
		return usernametxtfld;
	}

	public WebElement getPasswordtxtfld() {
		return passwordtxtfld;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	public void logintoApp() throws Throwable
	{
		PropertyFiles proppertyFiles= new PropertyFiles();
		usernametxtfld.sendKeys(proppertyFiles.readDataFromPropertyfiles("username"));
		passwordtxtfld.sendKeys(proppertyFiles.readDataFromPropertyfiles("password"));
		loginbtn.click();
	}
	
	public void logintoApp(String username,String password) 
	{
		usernametxtfld.sendKeys(username);
		passwordtxtfld.sendKeys(password);
		loginbtn.click();
		
	}

	

}
