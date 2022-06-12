package com.Vtiger.generic;

import java.util.Random;

import org.testng.annotations.Test;

public class JavaUtil {

	@Test
	public void CreateRandomNumber()
	{
		Random random= new Random();
//		int number= random.nextInt(10);
	int number=random.nextInt(20);
		

		System.out.println(number);
	}
}
