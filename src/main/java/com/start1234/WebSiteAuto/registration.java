package com.start1234.WebSiteAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class registration {
	WebDriver driver;
	
	 public registration(WebDriver driver2) {
    driver=driver2;
	 }

	public void refgitration()
	    {
	    	
	        WebElement gender = driver.findElement (By.id("id_gender1"));
	        gender.click();
	        
	        WebElement custname = driver.findElement(By.xpath("//input[@data-validate='isName'][@type='text']"));
	        custname.sendKeys("sachin");
	        
	        WebElement lastname = driver.findElement(By.id("customer_lastname"));
	        lastname.sendKeys("Mane");
	        
	        WebElement password= driver.findElement(By.id("passwd"));
	        password.sendKeys("123456");
	        
	        Select drpdob= new Select (driver.findElement(By.id("days")));
	        
	        drpdob.selectByValue("23");
	        
	        Select drpmonth= new Select (driver.findElement(By.xpath("//select[@id='months'][@name='months']")));
	        
	        drpmonth.selectByValue("1");
	        
	        Select drpyear= new Select (driver.findElement(By.xpath("//select[@id='years'][@name='years']")));
	        
	        drpyear.selectByValue("2017");
	        
	        WebElement chkbox= driver.findElement(By.cssSelector("input[type='checkbox'][value='1']"));
	        chkbox.click();
	    	
	    }
}
