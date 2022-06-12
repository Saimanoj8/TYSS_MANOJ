package com.Vtiger.generic;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class TestDataa {


	@Test
	
	/**
	 * @author bharath reddy
	 * this method will return the firstname
	 * @return
	 */
	public String FirstName()
	{
		Faker f=new Faker();
		String fname= f.name().firstName();
		return fname;
	
	}
	
	public String LastName()
	{
		Faker f=new Faker();
		String fname= f.name().lastName();
		return fname;
	
	}
	
	public String Organisation()
	{
		Faker fake=new Faker();
		String company= fake.company().industry();
		return company;
	}
	public String Mobilenumber()
	{
		Faker fake1=new Faker();
		String phone= fake1.phoneNumber().cellPhone();
		return phone;
	}
}


