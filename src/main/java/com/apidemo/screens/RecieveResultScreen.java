package com.apidemo.screens;

import org.openqa.selenium.support.PageFactory;

import com.apidemo.base.TestBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RecieveResultScreen extends TestBase{
	
	public RecieveResultScreen(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	//selector
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Receive Result']")	
	public AndroidElement receiveResult;
	
	@AndroidFindBy(id = "com.hmh.api:id/get")
	public AndroidElement getResultButton;
	
	@AndroidFindBy(id = "com.hmh.api:id/results")
	public AndroidElement result; 
	
	@AndroidFindBy(id = "com.hmh.api:id/corky")
	public AndroidElement corky_button;
	
	@AndroidFindBy(id = "com.hmh.api:id/violet")
	public AndroidElement violet_button;
	
}
