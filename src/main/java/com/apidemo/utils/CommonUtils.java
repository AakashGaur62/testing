package com.apidemo.utils;



import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.apidemo.base.TestBase;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;

import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class CommonUtils extends TestBase {
	
	public static void do_tap(AndroidElement element) {
		AndroidTouchAction touch = new AndroidTouchAction (driver);
		touch.tap (TapOptions.tapOptions().withElement (ElementOption.element(element))).perform ();
	}
	
	public static void implicitWait() {
		
		int timeUnit = Integer.valueOf(200);
		//logger.info("Implicit wait : waited for " + String.valueOf(timeUnit)+ " seconds .");
		
		driver.manage().timeouts().implicitlyWait(timeUnit,TimeUnit.SECONDS); 
	}
	 public static void explicitWait(int time, AndroidElement locator) {
		 WebDriverWait wait = new WebDriverWait(driver,time);
		 wait.until(ExpectedConditions.visibilityOf(locator));
	 }
	
	//function for swipe up screen(I take it from Appium's official website)
		public static void swipeScreen(Direction dir) {
		    System.out.println("swipeScreen(): dir: '" + dir + "'"); // always log your actions

		    // Animation default time:
		    //  - Android: 300 ms
		    //  - iOS: 200 ms
		    // final value depends on your app and could be greater
		    final int ANIMATION_TIME = 200; // ms

		    final int PRESS_TIME = 200; // ms

		    int edgeBorder = 10; // better avoid edges
		    PointOption pointOptionStart, pointOptionEnd;

		    // init screen variables
		    Dimension dims = driver.manage().window().getSize();

		    // init start point = center of screen
		    pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);

		    switch (dir) {
		        case DOWN: // center of footer
		            pointOptionEnd = PointOption.point(dims.width / 2, (dims.height - edgeBorder)/2);
		            break;
		        case UP: // center of header
		            pointOptionEnd = PointOption.point(dims.width / 2, edgeBorder);
		            break;
		        case LEFT: // center of left side
		            pointOptionEnd = PointOption.point(edgeBorder, dims.height / 2);
		            break;
		        case RIGHT: // center of right side
		            pointOptionEnd = PointOption.point(dims.width - edgeBorder, dims.height / 2);
		            break;
		        default:
		            throw new IllegalArgumentException("swipeScreen(): dir: '" + dir + "' NOT supported");
		    }

		    // execute swipe using TouchAction
		    try {
		        new TouchAction(driver)
		                .press(pointOptionStart)
		                // a bit more reliable when we add small wait
		                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
		                .moveTo(pointOptionEnd)
		                .release().perform();
		    } catch (Exception e) {
		        System.err.println("swipeScreen(): TouchAction FAILED\n" + e.getMessage());
		        return;
		    }

		    // always allow swipe action to complete
		    try {
		        Thread.sleep(ANIMATION_TIME);
		    } catch (InterruptedException e) {
		        // ignore
		    }
		}

		public enum Direction {
		    UP,
		    DOWN,
		    LEFT,
		    RIGHT;
		}
}
