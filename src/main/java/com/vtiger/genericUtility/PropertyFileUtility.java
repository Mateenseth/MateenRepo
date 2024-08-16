package com.vtiger.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility {
	public 	String readDataFromPf(String key) throws Throwable {
		FileInputStream fis=new FileInputStream(Iconstantpaths.propertfilepath);
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(key);
		
}
}
