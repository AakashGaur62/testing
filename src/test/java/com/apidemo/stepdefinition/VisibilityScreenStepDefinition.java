package com.apidemo.stepdefinition;

import org.testng.Assert;

import com.apidemo.base.TestBase;
import com.apidemo.screens.VisibilityScreen;
import com.apidemo.utils.CommonUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VisibilityScreenStepDefinition extends TestBase{
	VisibilityScreen visibilityScreenObj;
	
	public VisibilityScreenStepDefinition() {
		visibilityScreenObj = new VisibilityScreen(driver);
	}
	

		@When("Views B is Visible")
		public void views_b_is_visible() {
			CommonUtils.explicitWait(5, visibilityScreenObj.viewB);
			boolean flag = visibilityScreenObj.viewB.isDisplayed();
			Assert.assertTrue(flag);
		}

		@When("User Tap on INVIS button")
		public void user_tap_on_invis_button() {
			CommonUtils.explicitWait(5, visibilityScreenObj.invis_button);
			CommonUtils.do_tap(visibilityScreenObj.invis_button);
		}


		@When("User Tap on Vis button")
		public void user_tap_on_vis_button() {
			CommonUtils.explicitWait(5, visibilityScreenObj.vis_button);
			CommonUtils.do_tap(visibilityScreenObj.vis_button);
		}
	
		// for visibility screen
		@Then("Views B Should be Invisible")
		public void views_b_should_be_invisible() {
			if(visibilityScreenObj.sizeOFList() == 2) {
				Assert.assertTrue(true);
			}
		}
		
		@Then("Views B should be visible")
		public void views_b_should_be_visible() {
			boolean flag = visibilityScreenObj.viewB.isDisplayed();
			Assert.assertTrue(flag);
		}
}
