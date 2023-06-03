package ryanshin;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Appium {
	
	// Run with TestNG
	@Test
	public void AppiumTest() throws MalformedURLException {
		// Appium code => Appium Server => Mobile
		UiAutomator2Options uiAutomator2Options = new UiAutomator2Options();
		// set which device I want to automate
		uiAutomator2Options.setDeviceName("ryanphone");
		// set which app I want to automate
		uiAutomator2Options.setApp("//Users//ryanshin//eclipse-workspace//Appium//src//test//java//resources//ApiDemos-debug.apk");
		
		// add url and capabilities in parameter
		AndroidDriver androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723"), uiAutomator2Options);
		
	}


}
