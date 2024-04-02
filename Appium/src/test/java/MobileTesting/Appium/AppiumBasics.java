package MobileTesting.Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;


public class AppiumBasics {

	@Test
	public void AppiumTest() throws MalformedURLException, URISyntaxException {

		//Appium code -> Appium server -> Mobile.

		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("C://Users//HP//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();		

		service.start();

		UiAutomator2Options option = new UiAutomator2Options();
		option.setDeviceName("Pixel_3a_API_34_extension_level_7_x86_64");
		option.setApp("E://Appium Project//Appium//src//test//java//resources//ApiDemos-debug.apk");

		AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), option);

		driver.quit();

		service.stop();
	}
}
