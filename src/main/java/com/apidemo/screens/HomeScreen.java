package com.apidemo.screens;

import org.openqa.selenium.support.PageFactory;

import com.apidemo.base.TestBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomeScreen extends TestBase{
	public HomeScreen(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'App']")
	public AndroidElement APP;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'OS']")
	public AndroidElement OS;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Views']")
	public AndroidElement views;
	
}
