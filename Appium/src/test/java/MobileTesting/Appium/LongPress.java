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



public class LongPress extends BaseTest{

	@FindBy(xpath ="//android.widget.TextView[@content-desc='Views']")	
	private WebElement View;	

	@FindBy(xpath = "//android.widget.TextView[@content-desc='Expandable Lists']")
	private WebElement ExpandableList;

	@FindBy(xpath = "//android.widget.TextView[@text='People Names']")
	private WebElement ele;





	@Test
	public void LongPressGesture() throws MalformedURLException, URISyntaxException, InterruptedException {


		//View.click();
		driver.findElement(AppiumBy.accessibilityId("view")).click();
		ExpandableList.click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) ele).getId(),"duration",2000));
		Thread.sleep(2000);




	}
}
