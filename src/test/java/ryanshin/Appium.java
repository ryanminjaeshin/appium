package ryanshin;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Appium extends BaseTest {
	
	@Test
	public void WifiSettingTest() throws MalformedURLException {
		

		// Actual Automation
		// Xpath, id, className, androidUIAutomtor(AppiumBy.), accessibilityId(AppiumBy.)
		androidDriver.findElement(AppiumBy.accessibilityId("Preference")).click();
		tearDown();

	}


}
