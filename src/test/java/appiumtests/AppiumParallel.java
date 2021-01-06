package appiumtests;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AppiumParallel {
	
	
	
	@Test
	public void AppiumTestParallel1() throws MalformedURLException, InterruptedException {
		
		
		    
		      DesiredCapabilities caps = new DesiredCapabilities();
		     
		      
		      // Set your access credentials
		      caps.setCapability("browserstack.user", "bhagyeshnanwani4");
		      caps.setCapability("browserstack.key", "bQc9V5scoYwsAqxRnUvc");
		      
		      // Set URL of the application under test
		      caps.setCapability("app", "bs://69e379f54a143f15cc94905ec168425ba6e4c54f");
		      
		      // Specify device and os_version for testing
		      caps.setCapability("device", "Google Pixel 3");
		      caps.setCapability("os_version", "9.0");
		        
		      // Set other BrowserStack capabilities
		      caps.setCapability("project", "Amazon");
		      
		      caps.setCapability("build", System.getenv("BROWSERSTACK_BUILD_NAME"));
		      
		      caps.setCapability("name", "Amazon's Script");
		      
		      caps.setCapability("browserstack.local", "false");
		      
		        
		      
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
	
	
	
	
	
	@Test
	public void AppiumTestParallel2() throws MalformedURLException, InterruptedException {
		
		
		    
		      DesiredCapabilities caps = new DesiredCapabilities();
		     
		      
		      // Set your access credentials
		      caps.setCapability("browserstack.user", "bhagyeshnanwani4");
		      caps.setCapability("browserstack.key", "bQc9V5scoYwsAqxRnUvc");
		      
		      // Set URL of the application under test
		      caps.setCapability("app", "bs://69e379f54a143f15cc94905ec168425ba6e4c54f");
		      
		      // Specify device and os_version for testing
		      caps.setCapability("os_version", "8.0");
		      caps.setCapability("device", "Samsung Galaxy S9");
		        
		      // Set other BrowserStack capabilities
		      caps.setCapability("project", "Amazon");
		      
		      caps.setCapability("build", "V1.1");
		      
		      caps.setCapability("name", "Amazon's Script");
		      
		      
		     
		        
		      
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
	
	
			
	
	@Test
	public void AppiumTestParallel3() throws MalformedURLException, InterruptedException {
		
		
		    
		      DesiredCapabilities caps = new DesiredCapabilities();
		     
		      
		      // Set your access credentials
		      caps.setCapability("browserstack.user", "bhagyeshnanwani4");
		      caps.setCapability("browserstack.key", "bQc9V5scoYwsAqxRnUvc");
		      
		      // Set URL of the application under test
		      caps.setCapability("app", "bs://69e379f54a143f15cc94905ec168425ba6e4c54f");
		      
		      // Specify device and os_version for testing
		      caps.setCapability("os_version", "9.0");
		      caps.setCapability("device", "Xiaomi Redmi Note 7");
		      
		        
		      // Set other BrowserStack capabilities
		      caps.setCapability("project", "Amazon");
		      
		      caps.setCapability("build", "V1.1");
		      
		      caps.setCapability("name", "Amazon's Script");
		      
		     
		        
		      
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
	
	
	
	
	@Test
	public void AppiumTestParallel4() throws MalformedURLException, InterruptedException {
		
		
		    
		      DesiredCapabilities caps = new DesiredCapabilities();
		     
		      
		      // Set your access credentials
		      caps.setCapability("browserstack.user", "bhagyeshnanwani4");
		      caps.setCapability("browserstack.key", "bQc9V5scoYwsAqxRnUvc");
		      
		      // Set URL of the application under test
		      caps.setCapability("app", "bs://69e379f54a143f15cc94905ec168425ba6e4c54f");
		      
		      // Specify device and os_version for testing
		      caps.setCapability("os_version", "9.0");
		      
		      caps.setCapability("device", "Motorola Moto G7 Play");
		        
		      // Set other BrowserStack capabilities
		      caps.setCapability("project", "Amazon");
		      
		      caps.setCapability("build", "V1.1");
		      
		      caps.setCapability("name", "Amazon's Script");
		     
		        
		      
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


