package com.apidemo.stepdefinition;

import org.testng.Assert;

import com.apidemo.base.TestBase;
import com.apidemo.screens.RecieveResultScreen;
import com.apidemo.utils.CommonUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReceivingResultStepdefinition extends TestBase{
	RecieveResultScreen recieveResultScreenObj;
	
	public ReceivingResultStepdefinition() {
		recieveResultScreenObj = new RecieveResultScreen(driver);
	}
	//for Receive Result
		@When("User Tap on Recieve Result")
		public void user_tap_on_recieve_result() {
			CommonUtils.explicitWait(10, recieveResultScreenObj.receiveResult);
			CommonUtils.do_tap(recieveResultScreenObj.receiveResult);
		}


		@When("User Tap on GET RESULT button")
		public void user_tap_on_get_result_button() {
			CommonUtils.explicitWait(5, recieveResultScreenObj.getResultButton);
			CommonUtils.do_tap(recieveResultScreenObj.getResultButton);
		}

		@When("User Tap on Violet button")
		public void user_tap_on_violet_button() {
			CommonUtils.explicitWait(5, recieveResultScreenObj.violet_button);
			CommonUtils.do_tap(recieveResultScreenObj.violet_button);
		}

		@When("User Tap on Corky button")
		public void user_tap_on_corky_button() {
			CommonUtils.explicitWait(5, recieveResultScreenObj.corky_button);
			CommonUtils.do_tap(recieveResultScreenObj.corky_button);
		}
		

		@Then("Result Should be visible on Receive Result Screen with {string}")
		public void result_should_be_visible_on_receive_result_screen_with_msg(String result) {
			CommonUtils.explicitWait(5, recieveResultScreenObj.result);
			String wholeResult = recieveResultScreenObj.result.getText();
			int index = wholeResult.indexOf('!');
			String expectedResult = wholeResult.substring(0, index+1);
			Assert.assertEquals(expectedResult, result);
		}
}
