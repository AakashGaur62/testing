package com.apidemo.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\java\\com\\apidemo\\feature"},
		glue={"com.apidemo.stepdefinition","HookFile"},
		dryRun = false,
		monochrome = true,//it will display the console output in proper readable format
		tags = "@VisibilityScreenTest or @ThemeScreenTest or @ReceiveResultTest or @SMSMessagingTest or",
		plugin = {"pretty","html:cucumber-reports/reports_html.html"
				,"json:cucumber-reports/report_json.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)

public class Run extends AbstractTestNGCucumberTests {
	/*This class will be empty*/
}
