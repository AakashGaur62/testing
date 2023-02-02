package com.apidemo.screens;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.apidemo.base.TestBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class VisibilityScreen extends TestBase{
	public VisibilityScreen(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//selectors
	
	@AndroidFindBy(id = "com.hmh.api:id/victim")
	public AndroidElement viewB;
	
	@AndroidFindBy(id = "com.hmh.api:id/vis")
	public AndroidElement vis_button;
	
	@AndroidFindBy(id = "com.hmh.api:id/invis")
	public AndroidElement invis_button; 
	
	public int sizeOFList() {
		List<MobileElement> views = driver.findElements(By.className("android.widget.TextView"));
		return views.size();
	}
}
