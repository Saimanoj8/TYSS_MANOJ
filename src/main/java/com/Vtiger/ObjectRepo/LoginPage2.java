package com.Vtiger.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.Vtiger.generic.PropertyFiles;

public class LoginPage2 {

	public LoginPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "user_name")
	WebElement usernametxtfld;
	
	@FindBys({@FindBy(name = "user_password"),@FindBy(xpath="//input[@type='password']")})
	WebElement passwordtxtfld;
	
	@FindAll({@FindBy(id = "submitButton"), @FindBy(xpath="//input=[@type='submit']")})
	WebElement loginbtn;

	public WebElement getUsernametxtfld() {
		return usernametxtfld;
	}

	public WebElement getPasswordtxtfld() {
		return passwordtxtfld;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
    
	 PropertyFiles prop = new PropertyFiles(); 
	 
	 public void logintoAPP() throws Throwable
	 {

		 usernametxtfld.sendKeys(prop.readDataFromPropertyfiles("username"));
		 passwordtxtfld.sendKeys(prop.readDataFromPropertyfiles("password"));
		 loginbtn.click();
		 
	 }


}

