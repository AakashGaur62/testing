package com.apidemo.screens;

import org.openqa.selenium.support.PageFactory;

import com.apidemo.base.TestBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ThemeScreen extends TestBase{
	
	public ThemeScreen(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//android element
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]")
	public AndroidElement lightTheme;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]")
	public AndroidElement darkTheme;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]")
	public AndroidElement holoLightTheme;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[4]")
	public AndroidElement holoDarkTheme;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[5]")
	public AndroidElement customTheme;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[6]")
	public AndroidElement holoOrOldTheme;
	

	@AndroidFindBy(id = "android:id/action_bar_title")
	public  AndroidElement holoLightThemeTitle;
	
	@AndroidFindBy(id = "android:id/action_bar_title")
	public  AndroidElement holoDarkThemeTitle;
	
	@AndroidFindBy(id = "android:id/action_bar_title")
	public  AndroidElement holoOrOldThemeTitle;
	
	@AndroidFindBy(id = "android:id/action_bar_title")
	public  AndroidElement ThemeTitleActionBar;
	
	@AndroidFindBy(id = "android:id/title")
	public  AndroidElement ThemeTitle;	
	
}
