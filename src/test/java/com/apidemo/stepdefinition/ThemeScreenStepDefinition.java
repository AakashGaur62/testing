package com.apidemo.stepdefinition;

import org.testng.Assert;

import com.apidemo.base.TestBase;
import com.apidemo.screens.ThemeScreen;
import com.apidemo.utils.CommonUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ThemeScreenStepDefinition extends TestBase{
	ThemeScreen themeScreenObj;
	
	public ThemeScreenStepDefinition() {
		themeScreenObj = new ThemeScreen(driver);
	}
	
	//for light theme
		@When("User Tap on Light Theme")
		public void user_Tap_on_light_theme() {
			CommonUtils.explicitWait(5, themeScreenObj.lightTheme);
			CommonUtils.do_tap(themeScreenObj.lightTheme);
		}

		// For dark theme
		@When("User Tap on Dark Theme")
		public void user_Tap_on_dark_theme() {
			CommonUtils.explicitWait(5, themeScreenObj.darkTheme);
			CommonUtils.do_tap(themeScreenObj.darkTheme);
		}

		//for holo light theme
		@When("User Tap on Holo Light Theme")
		public void user_Tap_on_holo_light_theme() {
			CommonUtils.explicitWait(5, themeScreenObj.holoLightTheme);
			CommonUtils.do_tap(themeScreenObj.holoLightTheme);
		}

		// for Holo Dark Theme
		@When("User Tap on Holo Dark  Theme")
		public void user_Tap_on_holo_dark_theme() {
			CommonUtils.explicitWait(5, themeScreenObj.holoDarkTheme);
			CommonUtils.do_tap(themeScreenObj.holoDarkTheme);
		}

		//For custom theme
		@When("User Tap on Custom Theme")
		public void user_Tap_on_custom_theme() {
			CommonUtils.explicitWait(5, themeScreenObj.customTheme);
			CommonUtils.do_tap(themeScreenObj.customTheme);
		}

		//For Holo or old theme
		@When("User Tap on Holo or Old Theme")
		public void user_Tap_on_holo_or_old_theme() {
			CommonUtils.explicitWait(5, themeScreenObj.holoOrOldTheme);
			CommonUtils.do_tap(themeScreenObj.holoOrOldTheme);
		}
		
		//for light theme
		@Then("Light Theme is Visible")
		public void light_theme_is_visible() {
			Assert.assertEquals(themeScreenObj.ThemeTitle.getText(),"Views/Controls/1. Light Theme");
		}
		
		//for dark theme
		@Then("Dark Theme is Visible")
		public void dark_theme_is_visible() {
			Assert.assertEquals(themeScreenObj.ThemeTitle.getText(),"Views/Controls/2. Dark Theme");
		}
		
		//for holo lighttheme
		@Then("Holo Light Theme is Visible")
		public void holo_theme_is_visible() {
			Assert.assertEquals(themeScreenObj.ThemeTitleActionBar.getText(),"Views/Controls/3. Holo Light Theme");
		}
		
		//holo dark theme
		@Then("Holo Dark Theme is Visible")
		public void holo_dark_theme_is_visible() {
			Assert.assertEquals(themeScreenObj.ThemeTitleActionBar.getText(),"Views/Controls/4. Holo Dark Theme");
		}
		
		// for custom theme
		@Then("Custom Theme is Visible")
		public void custom_theme_is_visible() {
			Assert.assertEquals(themeScreenObj.ThemeTitle.getText(),"Views/Controls/5. Custom Theme");
		}
		
		//for holo old theme
		@Then("Holo or Old Theme is Visible")
		public void holo_or_old_theme_is_visible() {
		    Assert.assertEquals(themeScreenObj.ThemeTitleActionBar.getText(),"Views/Controls/6. Holo or Old Theme");
		}
}
