package com.hrms.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {

	public static Properties prop;
	
	public static void readProperty(String filepath){
		try {
		FileInputStream fis=new FileInputStream (filepath);
		prop=new Properties();
		prop.load(fis);
		fis.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}
	
}
