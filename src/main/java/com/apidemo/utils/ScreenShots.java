package com.apidemo.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.apidemo.base.TestBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class ScreenShots extends TestBase{
	
	public static void takeScreenShot(AppiumDriver<MobileElement> driver,String filename) {
		
		String  screenshotFileName = System.getProperty("user.dir");

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File(screenshotFileName + "/screenshots/" + filename + ".png"));
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static byte[] getByteScreenshot(AppiumDriver<MobileElement> driver) throws IOException 
	{
	    File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    byte[] fileContent = FileUtils.readFileToByteArray(src);
	    return fileContent;
	}
}
