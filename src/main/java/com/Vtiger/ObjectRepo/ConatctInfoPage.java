package com.Vtiger.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConatctInfoPage {

	WebDriver driver;

	public ConatctInfoPage(WebDriver driver)
	{
		//	this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindAll({@FindBy(xpath="//img[@title='Create Contact...']"), @FindBy(id="Submit")})
	private WebElement createcontactsimg;

	public WebElement getCreatecontactsimg() {
		return createcontactsimg;
	}

	@FindBy(name="search_text")
	private WebElement searchcontacttxtfld;

	@FindBy(name="submit")
	private WebElement searchcontactbtn;

	public WebElement getSearchcontacttxtfld() {
		return searchcontacttxtfld;
	}

	public WebElement getSearchcontactbtn() {
		return searchcontactbtn;
	}
	@FindBy(id="bas_searchfield")
	private WebElement searchforcontactDD;

	public WebElement getSearchforcontactDD() {
		return searchforcontactDD;
	}

	public void checkcontactcreated(String contactname) 
	{
		getSearchcontacttxtfld().sendKeys(contactname);

		getSearchcontactbtn().click();
	}

	@FindBy (xpath="(//a[@title='Contacts'])[2]")
	private WebElement actualcontact;

	public WebElement getactualcontact() {
		return actualcontact;
	}

}

