package ryanshin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;

public class IOSSwipeTest extends IOSBaseTest {
	
	public void IOSSwipeTestDemo() {
		
		// invoke the app that is already on iPhone
		//Bundle ID: Ask to developer or google it. Otherwise they will give you the app file.
		Map<String, String> params = new HashMap<String, String>();
		params.put("bundleId", "com.apple.mobileslideshow");
		driver.executeScript("mobile:launchapp", params);
		driver.findElement(AppiumBy.iOSNsPredicateString("label == 'All Photos")).click();
	    List<WebElement> allPhtos = driver.findElements(AppiumBy.iOSClassChain("**/XCUIElementTypeCell"));
	    driver.findElement(By.xpath("//XCUIElementTypeCell[1]")).click();
	   
	    for(int i=0; i<allPhtos.size(); i++) {
		    // swipe left element
		    Map<String, Object> params1 = new HashMap<String, Object>();
		    params1.put("direction", "left");
		    driver.executeScript("mobile:swipe", params1);
	    }
	    
	    driver.navigate().back();
	    driver.findElement(AppiumBy.accessibilityId("Albums")).click(); // cleanup
		
	}
}
