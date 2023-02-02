package com.apidemo.screens;

import org.openqa.selenium.support.PageFactory;

import com.apidemo.base.TestBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AppOptionScreen extends TestBase{
	public AppOptionScreen(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	//by selector
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Fragment']")
	public AndroidElement fragment;
}
