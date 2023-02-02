package com.apidemo.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.apidemo.utils.LogUtil;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class TestBase {
	
	static AppiumDriverLocalService service;
	public static AppiumDriver<MobileElement> driver;	
	private static DesiredCapabilities capablities = new DesiredCapabilities();
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	
	public static Properties prop = new Properties();
	
	public TestBase() {
		
		try {
			FileInputStream fis = new FileInputStream("src\\main\\java\\com\\apidemo\\data\\data.xlsx");
			workbook = new XSSFWorkbook(fis);
		}
		catch( FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	/*
	public void startService() {
		service = AppiumDriverLocalService.buildDefaultService();
		service.start();
		LogUtil.info("Service is started");
	}*/
	public void launchAndIntallApp() {
		sheet = workbook.getSheet("config_data");
	
		capablities.setCapability("appium-version", sheet.getRow(1).getCell(1).getStringCellValue());
		capablities.setCapability("platformVersion", String.valueOf(sheet.getRow(1).getCell(2).getNumericCellValue()));
		capablities.setCapability("platformName", sheet.getRow(1).getCell(3).getStringCellValue());
		capablities.setCapability("appPackage", sheet.getRow(1).getCell(4).getStringCellValue());
		capablities.setCapability("appActivity", sheet.getRow(1).getCell(5).getStringCellValue());
		capablities.setCapability("deviceName", sheet.getRow(1).getCell(6).getStringCellValue());
		capablities.setCapability("app",System.getProperty("user.dir")+sheet.getRow(1).getCell(7).getStringCellValue());
		capablities.setCapability("isHeadless", true);
		capablities.setCapability("avdArgs", "-no-window");
		
		try {
			driver = new AndroidDriver<MobileElement>(new URL(sheet.getRow(1).getCell(0).getStringCellValue()),capablities);
			LogUtil.info("Driver Initiated");
		}catch(Exception e) {
			e.printStackTrace();
			LogUtil.info("Exception is occured in Driver Initiation");
		}
		LogUtil.info("******************** App Started ********************");
	}

	public void afterScenario() {
		driver.quit();		
	}
	
	/*
	public void stopService() {
		service.stop();
		LogUtil.info("Srevice Stoped");
	}
	/*

}
