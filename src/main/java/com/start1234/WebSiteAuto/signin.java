package com.start1234.WebSiteAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signin
{
WebDriver driver;

By usernameLocator= By.id("email_create");//page object model
By createmailLocator= By.id("SubmitCreate");
//we create this above because we can find easily locators

	public signin(WebDriver driver2) {
		driver=driver2;
}

	public void signin()
    {
    	
    	WebElement username = driver.findElement (usernameLocator);//page object model
        username.sendKeys("sachin.chai1234@gmail.com");
        
        WebElement createmail = driver.findElement (createmailLocator);
        createmail.click();

        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        

    }


}
