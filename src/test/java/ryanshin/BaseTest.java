package ryanshin;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {
	
	public AndroidDriver androidDriver;
	public AppiumDriverLocalService appiumDriverLocalService;

	public void ConfigureAppium() throws MalformedURLException {
		// programmatically start.
				AppiumDriverLocalService appiumDriverLocalService = new AppiumServiceBuilder().withAppiumJS(new File("//usr//local//lib//node_modules//appium//build//lib//main.js"))
						.withIPAddress("/127.0.0.1").usingPort(4723).build();
				appiumDriverLocalService.start();
				
				// Appium code => Appium Server => Mobile
				UiAutomator2Options uiAutomator2Options = new UiAutomator2Options();
				
				// set which device I want to automate
				
				uiAutomator2Options.setDeviceName("ryanphone");
				
				// set which app I want to automate
				uiAutomator2Options.setApp("//Users//ryanshin//eclipse-workspace//Appium//src//test//java//resources//ApiDemos-debug.apk");
				
				// add url and capabilities in parameter
				AndroidDriver androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723"), uiAutomator2Options);
	}
	
	public void tearDown() {
		androidDriver.quit();
		appiumDriverLocalService.stop();
	}
}
