package com.Vtiger.generic;


import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriverUtil {

	WebDriver driver;

	public WebDriverUtil(WebDriver driver) {
		this.driver=driver;
	}
	

	public void maxwindow() {
		driver.manage().window().maximize();
	}


	public void pageloadtimeout() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public boolean elementIsDisplayed(WebElement element) {
		return element.isDisplayed();
	}

	public boolean elementIsSelected(WebElement element) {
		return element.isSelected();
	}
	public void elementIsClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}

	public void elementIsVisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated((By) element));
	}

	public void selectValuefromdd(WebElement element,int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	public void selectValuefromdd(WebElement element,String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public void selectValuefromdd(String text, WebElement element) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void moveToelement(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}

	public void dragandDrop(WebElement src, WebElement dest) {
		Actions action = new Actions(driver);
		action.dragAndDrop(src, dest).build().perform();
	}

	public void dragandDrop(WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element);
	}
	public void rightClick(WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element);
	}

	public void scrolltoelement(WebElement element) 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public void acceptAlert()
	{
		driver.switchTo().alert().accept();
	}

	public void dismissAlert()
	{
		driver.switchTo().alert().dismiss();
	}

	public void sendkeysAlert(String text)
	{
		driver.switchTo().alert().sendKeys(text);
	}

	public void switchWindow(String title) {
		Set<String> winids = driver.getWindowHandles();

		Iterator<String> it = winids.iterator();

		for (String id : winids) 
		{
			driver.switchTo().window(id);
			if(title.equalsIgnoreCase(driver.getTitle())) {
				break;
			}
		}

	}


}


