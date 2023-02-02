package com.apidemo.stepdefinition;



import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.apidemo.base.TestBase;
import com.apidemo.utils.LogUtil;
import com.apidemo.utils.ScreenShots;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HookFile extends TestBase{
	
	/*
	@BeforeSuite
	public void startServiceAtSuitLevel() {
		startService();
	}*/
	
	@Before
	public void startAppium() {
		launchAndIntallApp();
	}

	@After
	public void closeservice(Scenario scenario) {
		if(scenario.isFailed()) {
			ScreenShots.takeScreenShot(driver, scenario.getName());
			try {
				scenario.attach(ScreenShots.getByteScreenshot(driver), "image/jpg", scenario.getName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			LogUtil.info("****** Taking screensshot of failed test case ******");
		}
		afterScenario();
		LogUtil.info("******"+ scenario.getName() +" was Tested Successfully ******");
	}
	
	/*
	@AfterSuite
	public void stopServiceAtSuitLevel() {
		stopService();
	}*/
}
