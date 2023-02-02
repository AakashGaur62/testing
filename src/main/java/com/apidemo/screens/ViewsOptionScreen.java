package com.apidemo.screens;

import org.openqa.selenium.support.PageFactory;

import com.apidemo.base.TestBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ViewsOptionScreen extends TestBase{
	public ViewsOptionScreen(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Controls']")
	public AndroidElement controls;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Visibility']")
	public AndroidElement visibility;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Date Widgets']")
	public AndroidElement dateWidgets;
	
	
}
