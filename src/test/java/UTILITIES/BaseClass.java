package UTILITIES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	WebDriver driver;
    
	
	@Parameters({"browser","websiteurl"})



          @BeforeMethod
    	  public void beforemethod(String browsername, String URL) throws InterruptedException {
    			Ibroswer(browsername, URL);
    			  
  		 	 
    		}
    		 
    	
          @AfterMethod
    	  public void aftermethod() {
    		  
    	  driver.close();
    	  }
    	  
    	  public void Ibroswer(String browsername, String URL) throws InterruptedException {
    		  if (browsername.equalsIgnoreCase("chrome")) {
    			  
    			WebDriverManager.chromedriver().setup();
    			driver = new ChromeDriver();
    			driver.get(URL);
    			driver.manage().window().maximize();
    			Thread.sleep(3000);
    			 
    		  }else if (browsername.equalsIgnoreCase("Edge")) {
    			  WebDriverManager.chromedriver().setup();
    			  driver.get(URL);
    			  driver.manage().window().maximize();
    			  Thread.sleep(3000);
    			  
    			  
    			  
    		  }
    			  
    			  
    			  
    		  }}
    		  
 

    		  