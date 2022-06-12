package com.Vtiger.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrgPage {

	WebDriver driver;


	public CreateNewOrgPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//input[@name='accountname']")
	private WebElement orgname;

	@FindBy(name="industry")
	private WebElement industry;

	@FindBy(name="accounttype")
	private WebElement type;

	@FindBy(name="rating")
	private WebElement rating;

	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveorgbtn;

	public WebElement getOrgname() {
		return orgname;
	}

	public WebElement getIndustry() {
		return industry;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getRating() {
		return rating;
	}

	public WebElement getSaveorgbtn() {
		return saveorgbtn;
	}

}
