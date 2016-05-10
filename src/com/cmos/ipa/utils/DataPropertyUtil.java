package com.cmos.ipa.utils;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * <code>数据读取配置文件工具类</code>
 * @author Hardy
 * @date 2016/5/10 14:40
 * @version 1.0
 */
public class DataPropertyUtil {

	//定义配置文件名称
	public static final String DEFAULTSET = "data";

	//初始化一个Hashmap集合
	protected static HashMap<String,Properties> propertiesSets = new HashMap<String, Properties>();

	private DataPropertyUtil() {
		
	}
	
	//初始化配置文件
	protected static void init() {
		init(DEFAULTSET);
	}
	
	//初始化配置文件
	protected static void init(String setName) {

		//国际化资源文件初始化
		ResourceBundle rb = ResourceBundle.getBundle(setName);
		//初始化配置文件工具
		Properties properties = new Properties();
		
		Enumeration<String> eu = rb.getKeys();
		while(eu.hasMoreElements()){
			String key = eu.nextElement().trim();
			String value = rb.getString(key).trim();
			try{
				value = new String(value.getBytes("ISO8859-1"),"UTF-8");
			}catch(Exception e){
				e.printStackTrace();
			}
			properties.put(key.toUpperCase(), value);
		}
		
		propertiesSets.put(setName, properties);
		
	}
	
	public static String getProperty(String key){
		if(propertiesSets.get(DEFAULTSET) == null){
			init();
		}
		return propertiesSets.get(DEFAULTSET).getProperty(key.toUpperCase());
	}
	
	public static Integer getPropertyInt(String key){
		int value = 0;
		try{
			value = Integer.parseInt(getProperty(key));
		}catch(Exception e){
			e.printStackTrace();
			System.exit(1);
		}
		return value;
	}
	
	public static Float getPropertyFloat(String key){
		float value = 0;
		try{
			value = Float.parseFloat(getProperty(key));
		}catch(Exception e){
			e.printStackTrace();
			System.exit(1);
		}
		return value;
	}
	
	public static String getProperty(String setName, String key){
		if(propertiesSets.get(setName) == null){
			init(setName);
		}
		String value = propertiesSets.get(setName).getProperty(key.toUpperCase());
		if(value == null){
			return "";
		}
		return value;
	}

}
