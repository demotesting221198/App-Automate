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

	 public static final String USERNAME = System.getenv("BROWSERSTACK_USERNAME");
	  
	 public static final String ACCESS_KEY = System.getenv("BROWSERSTACK_ACCESS_KEY");

	
	@Test
	public void AppiumTest() throws MalformedURLException, InterruptedException {
		     
		      
		      // Set your access credentials
		      DesiredCapabilities caps = new DesiredCapabilities();
			
		      //String userName = System.getenv("BROWSERSTACK_USERNAME");
			  //String accessKey = System.getenv("BROWSERSTACK_ACCESS_KEY");
			  

		      
		      
		      // Set URL of the application under test
		      
		      
		      // Specify device and os_version for testing
		       caps.setCapability("device", "Samsung Galaxy S8 Plus");
   			   caps.setCapability("os_version", "7.0");
    		   caps.setCapability("project", "My First Project");
    		   caps.setCapability("build", System.getenv("BROWSERSTACK_BUILD_NAME"));
    		   caps.setCapability("name", "Bstack-[Java] Sample Test");
		        
		      // Set other BrowserStack capabilities
		      
		      
		      
		      
		      
		      caps.setCapability("app", "bs://69e379f54a143f15cc94905ec168425ba6e4c54f");
		        
		      
		      // Initialise the remote Webdriver using BrowserStack remote URL
		      // and desired capabilities defined above
		      //AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
		      //new URL("http://hub.browserstack.com/wd/hub"), caps);
		      
			   AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("https://"+USERNAME+":"+ACCESS_KEY+"@hub-cloud.browserstack.com/wd/hub"), caps);

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
		
		
		
		
		
