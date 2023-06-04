package ryanshin;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class IOSBasics extends IOSBaseTest {
	
	@Test
	public void IOSBasicTest() {
		
		
		// attributes: xpath, className, IOS, iosclassChain, IOSPredicateString, accessibility id, id
		driver.findElement(AppiumBy.accessibilityId("Alert Views")).click();
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == 'Text Entry'`]")).click();
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIELementTypeCell")).sendKeys("Hello World");
		driver.findElement(AppiumBy.accessibilityId("OK")).click();
		driver.findElement(AppiumBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND vale BEGINSWITH[c] 'confirm'")).click();
		String text = driver.findElement(AppiumBy.iOSNsPredicateString("name BEGINSWITH[c] 'A message'")).getText();
		System.out.println(text);
		driver.findElement(AppiumBy.iOSNsPredicateString("label == 'confirm'")).click();
		
		
	}

}
