package MobileTesting.Appium;


import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;



public class DragAndDrop extends BaseTest{

	@Test
	public void DragAndDropTest() throws MalformedURLException, URISyntaxException, InterruptedException {


		driver.findElement(AppiumBy.accessibilityId("view")).click();
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		WebElement source =driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		// Java
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) source).getId(),
		    "endX", 706,
		    "endY", 638
		));
		Thread.sleep(3000);

		

	}
}
