package com.Vtiger.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Vtiger.generic.WebDriverUtil;

public class OrganizationsPage {

	WebDriver driver;
	public OrganizationsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//[text()='Organizations'])[1]")
	private WebElement orglink;
	
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement orgimage;
	
	@FindBy(name="search_text")
	private WebElement searchbox;
	
	@FindBy(name="search_field")
	private WebElement orgdropdown;
	
	@FindBy(name="submit")
	private WebElement  searchbutton;
	
	@FindBy(name="accountname")
	private WebElement orgnametextbox;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebutton;
	
	
	public WebElement getOrglink() {
		return orglink;
	}

	public WebElement getOrgimage() {
		return orgimage;
	}

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getOrgdropdown() {
		return orgdropdown;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}

	public WebElement getOrgnametextbox() {
		return orgnametextbox;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}
	
	public void searchorg(String orgname, String value) throws Throwable
	{
		WebDriverUtil wdu = new WebDriverUtil(driver);
		orglink.click();
		searchbox.sendKeys("orgname");
		
		wdu.selectValuefromdd(orgdropdown, value);
		Thread.sleep(2000);
	    searchbox.click();	
	}
	
	public void createorg(String orgname)
	{
		orglink.click();
		orgimage.click();
		orgnametextbox.sendKeys(orgname);
		savebutton.click();
	}
	
	
	
	
	
	
	
	
	
	
}
