package MobileTesting.Appium;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

/*
 * Open app package and app activity name using appium
 */

public class AppPackageAppActivity extends BaseTest{

	@Test
	public void openAppUsingAppium() throws MalformedURLException, URISyntaxException, InterruptedException {

		/*
		 * Open screen on emulator on which you wanted to perform activity.
		 * Hit below command on cmd to check package name and activity name.
		 * Command - adb shell dumpsy window | find "mCurrentFocus"
		 * once u hit the command u will get one url, anything before / is package name and rest is activity name
		 */

		Activity activity = new Activity("io.appium.android.apis", "io.appium.android.apis.preference.PreferenceDependencies");
		((JavascriptExecutor) driver).executeScript("mobile: startActivity", ImmutableMap.of("intent",
				"io.appium.android.apis/io.appium.android.apis.preference.PreferenceDependencies"
				));

		driver.findElement(By.id("android:id/checkbox")).click();

		DeviceRotation landScape = new DeviceRotation(0,0,90);
		driver.rotate(landScape);

		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		assertEquals(alertTitle, "WiFi settings");

		//copy paste 

		driver.setClipboardText("Abhi");

		//key Events
		driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.findElement(By.className("android.widget.Button")).click();

		driver.pressKey(new KeyEvent(AndroidKey.BACK));

		driver.pressKey(new KeyEvent(AndroidKey.HOME));

	}
}
