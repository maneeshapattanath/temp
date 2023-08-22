package com.example;

//import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class BeaconOrbit {
	public String baseUrl = "http://192.168.31.27:7001/Account/Login";
	   String driverPath = "C:\\browserdrivers\\geckodriver.exe";
	   public WebDriver driver; 

	    public String expected = null;
	    public String actual = null;
	        @BeforeTest
	      public void launchBrowser() {
	          System.out.println("launching firefox browser"); 
	        //  System.setProperty("webdriver.gecko.driver", driverPath);
	          System.setProperty("webdriver.geckoe.driver","driversPath");
	          driver= new FirefoxDriver();
	          driver.get(baseUrl);
	      }
	      
	      @BeforeMethod
	      public void Login() {
	    	  driver.get("http://192.168.31.27:7001/Account/Login");

	    	// Maximize window size of browser
	    	driver.manage().window().maximize();

	    	// Enter your login id
	    	driver.findElement(By.id("UserName")).sendKeys("orbit");

	    	// Enter your login password
	    	driver.findElement(By.id("Password")).sendKeys("orbit*123");

	    	driver.findElement(By.id("btnSubmit")).click();

	      }
	   
	      @AfterTest
	      public void terminateBrowser(){
	          driver.close();
	      }
	   
}
