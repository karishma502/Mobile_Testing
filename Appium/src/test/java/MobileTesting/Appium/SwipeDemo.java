package MobileTesting.Appium;


import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;



public class SwipeDemo extends BaseTest{

	@Test
	public void SwipeDemoTest() throws MalformedURLException, URISyntaxException, InterruptedException {


		driver.findElement(AppiumBy.accessibilityId("view")).click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='1. Photos']")).click();
		WebElement FirstImage =driver.findElement(By.xpath("(//android.widget.ImageView)[1]"));
		assertEquals(driver.findElement(By.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"),"true");

		//Swipe

		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				"elementId",((RemoteWebElement) FirstImage).getId(),
				"direction", "left",
				"percent", 0.75
				));
		assertEquals(driver.findElement(By.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"),"false");



	}
}
