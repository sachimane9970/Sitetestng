package com.start1234.WebSiteAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Hello world!
 *
 */
public class App 
{
    WebDriver driver;
    
	public static void main( String[] args )
    {
        App ref=new App();
        ref.setup();
        signin ref2=new signin(ref.driver);
        ref2.signin();
        registration ref3=new registration(ref.driver);
        ref3.refgitration();
        ref.teardown();
    }
    
    public void setup()
    {
    	
      System.out.println( "Hello World!" );
        
        System.setProperty("webdriver.chrome.driver" , "resource/chromedriver.exe" );
        
        driver= new ChromeDriver();
        driver.get ("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        
    }
       
    public void teardown()
    {
    	
        driver.quit();
    	
    }
 
}
