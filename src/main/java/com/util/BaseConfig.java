package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseConfig {
	static FileInputStream fs;
	String value;
	public static String getConfig(String value) {
		
		String path = "./config.properties";
		// read = FileInputStream => data convert into byte code
		try {
			fs = new FileInputStream(path);// file not found exception
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		// read actual notepad data with java = class knowns as properties class
		Properties pro = new Properties();
		try {
			pro.load(fs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//IO exception
		
		// read single config data
		String configName = pro.get(value).toString();
		
		
		
		return configName;
		
		}
	public static void main(String[] args) {
		String value = BaseConfig.getConfig("URL");
		System.out.println(value);
		value = BaseConfig.getConfig("user");
		System.out.println(value);
		value = BaseConfig.getConfig("password");
		System.out.println(value);
		
	}
}
