package com.Vtiger.TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Vtiger.generic.OpenBrowser;
import com.Vtiger.generic.TestDataa;
import com.Vtiger.generic.WebDriverUtil;
public class VtigerLogin_TC03 extends OpenBrowser{

	public static void main(String[] args) throws Throwable {

		OpenBrowser ob= new OpenBrowser();
		ob.LaunchBrowser(); 
		
		 WebDriverUtil wu = new WebDriverUtil(driver);
		 wu.pageloadtimeout();
		 
		 driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		 driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		 driver.findElement(By.name("lastname")).click();
		 
		 TestDataa ln = new TestDataa();
		 String contactname = ln.LastName();
		 driver.findElement(By.name("lastname")).sendKeys(contactname);
         
         String currentpagetitle = driver.getTitle();
         System.out.println("parent title:"+ currentpagetitle);
         
         driver.findElement(By.xpath("//input[@name='account_name']/following-sibling::img")).click();
         
         wu.switchWindow("Accounts");
         driver.findElement(By.id("search_txt")).sendKeys("Zenq Technologies");
         driver.findElement(By.name("search")).click();
         driver.findElement(By.id("1")).click();
         wu.switchWindow("Contacts");
         driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
         String contactid=driver.findElement(By.xpath("//td[@id='mouseArea_First Name']/../td[4]")).getText();
         driver.findElement(By.xpath("//a[.='Contacts']")).click();
         driver.findElement(By.xpath("//input[@class='txtBox']")).sendKeys(contactid);
         driver.findElement(By.name("submit")).click();
         String actualcontactlastname=driver.findElement(By.xpath("(//a[@title='Contacts'])[2]")).getText();
         if (actualcontactlastname.equals(contactname)) 
 		{
 			System.out.println("Tc Passes");
 		}
 		else {
 			System.out.println("TC Fail");
 		}
         
         WebElement signoutimg=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));

         wu.moveToelement(signoutimg);

 		driver.findElement(By.xpath("//a[.='Sign Out']")).click();

 		Thread.sleep(10000);

 		driver.close();

         
	}

}
