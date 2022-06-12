package com.Vtiger.generic;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFiles 
{
	public String readDataFromPropertyfiles(String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\bharath reddy\\Desktop\\Files\\localhost.properties");
		Properties prop = new Properties();
		prop.load(fis);
		prop.getProperty(key);
		
		return prop.getProperty(key);
	}
}
