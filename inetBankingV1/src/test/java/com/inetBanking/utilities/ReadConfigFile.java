package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfigFile {
	
	Properties prop;
	
	public ReadConfigFile() {
		File src = new File("./Configurations/config.properties");
		
		try {
		FileInputStream fis = new FileInputStream(src);
		prop = new Properties();
		prop.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is: "+e.getMessage());
		}
	}
	
	public String getApplicationURL() {
		String url = prop.getProperty("baseURL");
		return url;
	}
	
	public String getUserName() {
		String userName = prop.getProperty("UserName");
		return userName;	
	}
	
	public String getPassword() {
		String password = prop.getProperty("Password");
		return password;
	}
	
	public String getChromePath() {
		String chromepath = prop.getProperty("chromePath");
		return chromepath;
	}

	public String getIEPath() {
		String iepath = prop.getProperty("iePath");
		return iepath;
	}
	
	public String getFireFoxPath() {
		String ffpath = prop.getProperty("fireFoxPath");
		return ffpath;
	}
	
	
}
