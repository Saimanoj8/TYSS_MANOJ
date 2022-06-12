package com.Vtiger.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContactPage {

WebDriver driver;
	
	public CreateNewContactPage(WebDriver driver) {  
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(name = "lastname")
	private WebElement lastNameEdt;


	public WebElement getLastNameEdt() {
		return lastNameEdt;
	}


	public WebElement getOrganizationLookUpImage() {
		return organizationLookUpImage;
	}


	public WebElement getSaveBtn() {
		return saveBtn;
	}


	@FindBy(xpath = "//input[@name='account_name']/following-sibling::img[@alt='Select']")
	private WebElement organizationLookUpImage;


	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	@FindBy(xpath="//td[@id='mouseArea_First Name']/../td[4]")
	private WebElement contactid;
	
	public WebElement getcontactid() {
		return contactid;
	}


}

