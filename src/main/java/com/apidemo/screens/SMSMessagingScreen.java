package com.apidemo.screens;

import org.openqa.selenium.support.PageFactory;

import com.apidemo.base.TestBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SMSMessagingScreen extends TestBase{
	public SMSMessagingScreen(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	//selector 
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	public AndroidElement smsScreenTitle;
	
	@AndroidFindBy(className = "android.widget.CheckBox")
	public AndroidElement enable_checkbox;
	
	@AndroidFindBy(id = "com.hmh.api:id/sms_recipient")
	public AndroidElement recipient;

	@AndroidFindBy(id = "com.hmh.api:id/sms_content")
	public AndroidElement msgBody;

	@AndroidFindBy(id = "com.hmh.api:id/sms_send_message")
	public AndroidElement sendButton;

	@AndroidFindBy(id = "com.hmh.api:id/sms_status")
	public AndroidElement sms_status;
	
	public void enter_recipient(String recipients) {
		recipient.setValue(recipients);
	}
}
