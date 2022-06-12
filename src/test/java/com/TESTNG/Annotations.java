package com.TESTNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Annotations {

	@BeforeSuite(groups = {"smoke","sanity","regression"} )
	public void bs() {
		System.out.println("Before suite");
	}


	@AfterSuite(groups = {"smoke","sanity","regression"} )
	public void as() {
		System.out.println("after suite");
	}


	@BeforeTest(groups = {"smoke","sanity","regression"} )
	public void bt() {
		System.out.println("before test");
	}

	@AfterTest(groups = {"smoke","sanity","regression"} )
	public void at() {
		System.out.println("after test");
	}

	@BeforeClass(groups = {"smoke","sanity","regression"} )
	public void bc() {
		System.out.println("Before class");
	}
	@AfterClass(groups = {"smoke","sanity","regression"} )
	public void  ac() {
		System.out.println("after class");
	}

	@BeforeMethod(groups = {"smoke","sanity","regression"} )
	public void bm() {
		System.out.println("before method");
	}

	@AfterMethod(groups = {"smoke","sanity","regression"} )
	public void am() {
		System.out.println("After method");
	}




}
