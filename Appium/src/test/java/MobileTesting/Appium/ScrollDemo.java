package MobileTesting.Appium;


import java.net.MalformedURLException;
import java.net.URISyntaxException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;



public class ScrollDemo extends BaseTest{

	@Test
	public void LongPressGesture() throws MalformedURLException, URISyntaxException, InterruptedException {


		driver.findElement(AppiumBy.accessibilityId("view")).click();
		Thread.sleep(2000);
		// Where to scroll known prior
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
		//Thread.sleep(2000);

		//No prior idea
		scrollToEndAction();

	}
}
