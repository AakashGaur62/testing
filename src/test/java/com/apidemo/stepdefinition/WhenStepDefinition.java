package com.apidemo.stepdefinition;



import com.apidemo.base.TestBase;
import com.apidemo.screens.AppOptionScreen;

import com.apidemo.screens.HomeScreen;
import com.apidemo.screens.OSScreen;
import com.apidemo.screens.ViewsOptionScreen;
import com.apidemo.utils.CommonUtils;

import io.cucumber.java.en.When;

public class WhenStepDefinition extends TestBase{

	HomeScreen homeScreenObj;
	ViewsOptionScreen viewsOptionScreenObj;
	OSScreen OSScreenObj;
	AppOptionScreen appOptionScreenObj;


	public WhenStepDefinition() {
		homeScreenObj = new HomeScreen(driver);
		viewsOptionScreenObj = new ViewsOptionScreen(driver);
		OSScreenObj = new OSScreen(driver);
		appOptionScreenObj = new AppOptionScreen(driver);

	}

	//for background of theme
	@When("User Tap on Views")
	public void user_Tap_on_views() {  
		CommonUtils.explicitWait(10, homeScreenObj.views);
		CommonUtils.do_tap(homeScreenObj.views);
	}

	@When("Tap on Controls")
	public void Tap_on_controls() {
		CommonUtils.explicitWait(5, viewsOptionScreenObj.controls);
		CommonUtils.do_tap(viewsOptionScreenObj.controls);
	}


	//for scroll down the screen
	@When("User Scroll Up the Screen")
	public void scroll_down_the_screen() {
		CommonUtils.swipeScreen(CommonUtils.Direction.UP);
	}

	//for SMS messaging
	@When("User Tap on OS")
	public void user_tap_on_os() {
		CommonUtils.explicitWait(5, homeScreenObj.OS);
		CommonUtils.do_tap(homeScreenObj.OS);
	}

	@When("User Tap SMS Messaging")
	public void user_tap_sms_messaging() {
		CommonUtils.explicitWait(5, OSScreenObj.SMSMeassaging);
		CommonUtils.do_tap(OSScreenObj.SMSMeassaging);
	}

	// for visibility feature
	@When("User Tap on Visibility Option")
	public void user_tap_on_visibility_option() {
		CommonUtils.explicitWait(5, viewsOptionScreenObj.visibility);
		CommonUtils.do_tap(viewsOptionScreenObj.visibility);
	}

	//for receiving result screen
	@When("User Tap on App")
	public void user_tap_on_app() {
		CommonUtils.explicitWait(5, homeScreenObj.APP);
		CommonUtils.do_tap(homeScreenObj.APP);
	}

	@When("User Tap On Fragment")
	public void user_tap_on_fragment() {
		CommonUtils.explicitWait(5, appOptionScreenObj.fragment);
		CommonUtils.do_tap(appOptionScreenObj.fragment);
	}
}
