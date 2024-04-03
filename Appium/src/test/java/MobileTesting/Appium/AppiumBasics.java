package MobileTesting.Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;



public class AppiumBasics extends BaseTest{

	@Test
	public void WifiSettingName() throws MalformedURLException, URISyntaxException {

		//Appium code -> Appium server -> Mobile.

		//actual Automation

		//XPath , accessibilityId

		driver.findElement(AppiumBy.accessibilityId("Preference")).click();


	}
}
