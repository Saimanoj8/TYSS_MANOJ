package com.Vtiger.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Vtiger.ObjectRepo.CreateNewOrgPage;
import com.Vtiger.ObjectRepo.HomePage;
import com.Vtiger.ObjectRepo.OrgInfoPage;
import com.Vtiger.generic.BaseClass;
import com.Vtiger.generic.TestDataa;

public class TC01_CreateOrg_with_Testng extends BaseClass {

//	@Parameters("Orgname")
	@Test
	public void createorg () throws Throwable
	{
		HomePage homePage = new HomePage(driver);

		homePage.getOrglink().click();

		OrgInfoPage orgInfoPage= new OrgInfoPage(driver);
		orgInfoPage.getCreateorgbtn().click();
		
		TestDataa testData= new TestDataa();
		String Orgname=testData.Organisation();
//		JavaUtil javaUtil = new JavaUtil();
//		String orgname=testData.Organisation()+javaUtil.CreateRandomNumber();
		

		CreateNewOrgPage createNewOrgPage = new CreateNewOrgPage(driver);

		createNewOrgPage.getOrgname().sendKeys(Orgname);
		createNewOrgPage.getSaveorgbtn().click();

		Thread.sleep(4000);
		driver.navigate().refresh();

		homePage.getOrglink().click();

		orgInfoPage.searchforOrg(Orgname, "accountname");

		Thread.sleep(3000);

		String actualorgname=orgInfoPage.getfirstOrg().getText();

/*		if (Orgname.equals(actualorgname)) 
		{
			System.out.println("Tc Passes");
		}
		else {
			System.out.println("TC Fail");
		}
*/		
		Assert.assertEquals(Orgname, actualorgname);
		
		Thread.sleep(3000);
	
		
  

	}

}
