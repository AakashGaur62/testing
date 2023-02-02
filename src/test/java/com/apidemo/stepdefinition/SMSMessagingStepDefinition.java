package com.apidemo.stepdefinition;

import org.testng.Assert;

import com.apidemo.base.TestBase;
import com.apidemo.screens.SMSMessagingScreen;
import com.apidemo.utils.CommonUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SMSMessagingStepDefinition extends TestBase{
	SMSMessagingScreen SMSMessagingScreenObj;
	
	public SMSMessagingStepDefinition() {
		SMSMessagingScreenObj = new SMSMessagingScreen(driver);
	}
	
	//for SMS messaging


		@When("User enable the sms checkbox")
		public void user_enable_the_sms_checkbox() {
			CommonUtils.explicitWait(10, SMSMessagingScreenObj.enable_checkbox);
			CommonUtils.do_tap(SMSMessagingScreenObj.enable_checkbox);
		}

		@When("User Enter the Recipient {string}")
		public void user_enter_the_recipient(String recipient) {
			CommonUtils.explicitWait(5, SMSMessagingScreenObj.recipient);
			SMSMessagingScreenObj.recipient.setValue(recipient);
		}

		@When("User Enter the Message {string}")
		public void user_enter_the_message(String msg) {
			CommonUtils.explicitWait(5, SMSMessagingScreenObj.msgBody);
			SMSMessagingScreenObj.msgBody.setValue(msg);
		}

		@When("User Tap on send button")
		public void user_tap_on_send_button() {
			CommonUtils.explicitWait(5, SMSMessagingScreenObj.recipient);
			CommonUtils.do_tap(SMSMessagingScreenObj.sendButton);
		}
		
		
		//for SMS messaging
		
		@Then("Message status should be {string}")
		public void message_status_should_be(String smsStatus) {
		    Assert.assertEquals(SMSMessagingScreenObj.sms_status.getText(),smsStatus);
		}
}
