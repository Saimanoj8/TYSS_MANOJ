
package com.Vtiger.TestCases;

import org.openqa.selenium.By;

import com.Vtiger.ObjectRepo.HomePage;
import com.Vtiger.ObjectRepo.LoginPage;
import com.Vtiger.ObjectRepo.OrgInfoPage;
import com.Vtiger.generic.OpenBrowser;
import com.Vtiger.generic.TestDataa;

public class Org_TC_01_with_POM extends OpenBrowser {
	public static void main(String[] args) throws Throwable {
		
		OpenBrowser op = new OpenBrowser();
		op.LaunchBrowser();
		
		LoginPage lp = new LoginPage(driver);
		lp.logintoApp();
		
		Thread.sleep(2000);
		
		HomePage hp = new HomePage(driver);
		hp.getOrglink().click();
		
		OrgInfoPage orgp = new OrgInfoPage(driver);
		orgp.getCreateorgbtn().click();
		orgp.getCreateorgnametxtbtn().click();
         
		TestDataa td = new TestDataa();
	String orgname = td.Organisation();
	
	orgp.getCreateorgnametxtbtn().sendKeys(orgname);
	
	hp.getOrglink().click();
	orgp.searchforOrg(orgname, "2");
		
		
//		OrganizationsPage orgp = new OrganizationsPage(driver);
//		orgp.createorg(orgname);
//		orgp.searchorg(orgname,"2");
        		
		Thread.sleep(2000);
		String name = driver.findElement(By.xpath("//a[@title='Organizations']")).getText();
		System.out.println(name);
		
		if(name.equals(orgname))
		{	
			
			System.out.println("Organization is Successfully Created-Verified-Pass");
		}
		else
		{
			System.out.println("Organization is not Created");
		}
//		
//		HomePage hp = new HomePage(driver);
//		hp.logoutfromApp(); 
//	
		
		
		
		
	}
	
}
