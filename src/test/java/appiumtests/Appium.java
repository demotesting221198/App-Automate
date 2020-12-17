package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.*;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Appium {
	
	@Test
	public void AppiumTest() throws MalformedURLException, InterruptedException {
		     
		      
		      // Set your access credentials
		      DesiredCapabilities caps = new DesiredCapabilities();
			
		      String username = System.getenv("BROWSERSTACK_USERNAME");

		      String accessKey = System.getenv("BROWSERSTACK_ACCESS_KEY");

		      
		      
		      // Set URL of the application under test
		      caps.setCapability("app", "bs://add37755095121b49bbd6b84f00185d6f3557977");
		      
		      // Specify device and os_version for testing
		      caps.setCapability("device", "Google Pixel 3");
		      caps.setCapability("os_version", "9.0");
		        
		      // Set other BrowserStack capabilities
		      caps.setCapability("project", "Amazon");
		      
		      caps.setCapability("build", "V1.1");
		      
		      caps.setCapability("name", "Amazon's Script");
		      
		      caps.setCapability("browserstack.appium_version", "1.7.1");
		      
		      caps.setCapability("browserstack.local", "false");
		      
		      caps.setCapability("browserstack.networkLogs", "true");
		      
		      caps.setCapability("browserstack.networkProfile", "4g-lte-good");
		      
		      caps.setCapability("browserstack.console", "warnings");
		      
		      caps.setCapability("browserstack.timezone", "Kolkata");
		        
		      
		      // Initialise the remote Webdriver using BrowserStack remote URL
		      // and desired capabilities defined above
		      AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
		      new URL("http://hub.browserstack.com/wd/hub"), caps);
		      
		      JavascriptExecutor jse = (JavascriptExecutor)driver;
		        

		      /* Write your Custom code here */
		      
		      
		     try {
		    	 Thread.sleep(6000);
		     }catch(Exception e) {
		    	 System.out.println(e.getMessage());
		     }
		      
		      
		      
		     driver.findElementByAccessibilityId("Continue in English").click();
		     
		     
		     try {
		    	 Thread.sleep(6000);
		     }catch(Exception e) {
		    	 System.out.println(e.getMessage());
		     }
		      
		      
		      driver.findElement(By.id("in.amazon.mShop.android.shopping:id/skip_sign_in_button")).click();
		      
		      try {
			    	 Thread.sleep(6000);
			     }catch(Exception e) {
			    	 System.out.println(e.getMessage());
			     }
		      
		      
		      
		      MobileElement search = driver.findElement(By.id("in.amazon.mShop.android.shopping:id/rs_search_src_text"));
		      
		      search.sendKeys("iPhone X");
		      
		      search.sendKeys(Keys.ENTER);
		      
		      
		      try {
			    	 Thread.sleep(4000);
			     }catch(Exception e) {
			    	 System.out.println(e.getMessage());
			     }
		      
		      
		      jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Reached End of Script!\"}}");
		      
		        
		        
		      // Invoke driver.quit() after the test is done to indicate that the test is completed.
		      driver.quit();
		    
		    }
		      
		  }
		
		
		
		
		
