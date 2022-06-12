package com.Vtiger.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactOrg_popup {

	WebDriver driver;

	public ContactOrg_popup(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='search_txt']")
	private WebElement searchorgtxtfld;

	@FindBy(xpath="//input[@name='search']")
	private WebElement searchbtn;

	@FindBy(id="1")
	private WebElement selectorg;

	public WebElement getSearchorgtxtfld() {
		return searchorgtxtfld;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getSelectorg() {
		return selectorg;
	}
	
	public void searchandSelectforOrg(String orgname) throws InterruptedException {
		getSearchorgtxtfld().sendKeys(orgname);
		getSearchbtn().click();
		Thread.sleep(5000);
		getSelectorg().click();
	}
	
	

}

