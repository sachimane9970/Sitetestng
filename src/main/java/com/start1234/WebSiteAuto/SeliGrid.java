package com.start1234.WebSiteAuto;

	import java.net.MalformedURLException;
	import java.net.URL;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.remote.RemoteWebDriver;

	/**
	 * Hello world!
	 *
	 */
	public class SeliGrid {	
	    public static void main( String[] args ) throws MalformedURLException
	    {
	       DesiredCapabilities capabilities =new DesiredCapabilities();
	       capabilities.setBrowserName("chrome");
	    	
	    	WebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.3:4444/wd/hub"), capabilities);
	    	driver.get("https://www.facebook.com/");
	    	
	    	WebElement username=driver.findElement(By.id("email"));
	    	username.sendKeys("saura@gmai.com");
	    	
	    	WebElement password=driver.findElement(By.id("pass"));
	    	password.sendKeys("mypass");
	    	
	    	WebElement loginButn=driver.findElement(By.id("loginbutton"));
	    	loginButn.click();
	    	
	    	driver.quit();
	    }
	
	}


