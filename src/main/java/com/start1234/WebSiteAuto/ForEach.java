package com.start1234.WebSiteAuto;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForEach {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		
		String parentWindow =driver.getWindowHandle();
	
		Set<String> allWindow = driver.getWindowHandles();
		
		for (String win : allWindow) 
		{			
			driver.switchTo().window(win);
			
			if (!  win.equals(parentWindow)) {
				driver.close();
			}
			
		}

		driver.switchTo().window(parentWindow);
		WebElement Create=driver.findElement(By.xpath("//button[@title='Create Job Alert']"));
		Create.click();
		
		Thread.sleep(10000);
		driver.quit();
	}

}
