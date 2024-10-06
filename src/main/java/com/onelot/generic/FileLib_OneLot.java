package com.onelot.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileLib_OneLot {
	
	
	public void redDataFromExcel() {
		
		
		
	}
	
	public String radDataFromPropertyFile(String userKey) throws IOException {
		FileInputStream fis=new FileInputStream("./testdata/propertyfile.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String userData= pro.getProperty(userKey);
		return userData;
		
		
		
	}

}
