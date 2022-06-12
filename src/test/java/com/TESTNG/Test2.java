package com.TESTNG;

import org.testng.annotations.Test;

public class Test2 extends Annotations {

	@Test(groups = {"smoke"})
	public void testIOSapp() {
		System.out.println("testIOSapp");

	}
	@Test(groups = {"regression"})
	public void testdesktopapp() {
		System.out.println("testdesktopapp");
		
	}
}
