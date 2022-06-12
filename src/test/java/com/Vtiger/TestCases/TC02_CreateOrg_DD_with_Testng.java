package com.Vtiger.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Vtiger.ObjectRepo.CreateNewOrgPage;
import com.Vtiger.ObjectRepo.HomePage;
import com.Vtiger.ObjectRepo.OrgInfoPage;
import com.Vtiger.generic.BaseClass;
import com.Vtiger.generic.JavaUtil;
import com.Vtiger.generic.TestDataa;
import com.Vtiger.generic.WebDriverUtil;

public class TC02_CreateOrg_DD_with_Testng extends BaseClass {

	@Test
	public void createorg_dd () throws Throwable {
		HomePage homePage= new HomePage(driver);
		homePage.getOrglink().click();

		OrgInfoPage orgInfoPage = new OrgInfoPage(driver);
		orgInfoPage.getCreateorgbtn().click();

		TestDataa testData= new TestDataa();
//		JavaUtil javaUtil = new JavaUtil();
//		String orgname=testData.Organisation() + javaUtil.CreateRandomNumber();
	     String  orgname=testData.Organisation();
		CreateNewOrgPage createNewOrgPage= new CreateNewOrgPage(driver);

		createNewOrgPage.getOrgname().sendKeys(orgname);
		WebDriverUtil webDriverUtil= new WebDriverUtil(driver);

		webDriverUtil.selectValuefromdd("Active", createNewOrgPage.getRating());

		webDriverUtil.selectValuefromdd(createNewOrgPage.getIndustry(), "Education");

		webDriverUtil.selectValuefromdd(createNewOrgPage.getType(), 3);

		createNewOrgPage.getSaveorgbtn().click();

		Thread.sleep(4000);
		driver.navigate().refresh();

		homePage.getOrglink().click();

		orgInfoPage.searchforOrg(orgname, "accountname");

		Thread.sleep(3000);

		String actualorgname=orgInfoPage.getfirstOrg().getText();
/*
		if (orgname.equals(actualorgname)) 
		{
			System.out.println("Tc Passes");
		}
		else {
			System.out.println("TC Fail");
		}
*/
		Assert.assertEquals(orgname, actualorgname);
		Thread.sleep(3000);
	}
}

