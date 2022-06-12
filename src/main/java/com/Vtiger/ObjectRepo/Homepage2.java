package com.Vtiger.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Vtiger.generic.WebDriverUtil;

public class Homepage2 {

	WebDriver driver;
	public Homepage2(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	@FindBy(xpath="(//[text()='Organizations'])[1]")
	private WebElement orglink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement signoutimg;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signoutbutton;
	
	public WebElement getOrglink() {
		return orglink;
	}

	public WebElement getSigningout() {
		return signoutimg;
	}

	public WebElement getSigningoutbtn() {
		return signoutbutton;
     }
	
	public void signout()
	{
		WebDriverUtil wdu = new WebDriverUtil(driver);
		wdu.moveToelement(signoutbutton);
		signoutbutton.click();
	}
	
	
	
	
	
	
	
	
}
