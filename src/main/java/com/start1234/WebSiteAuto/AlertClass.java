package com.start1234.WebSiteAuto;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://output.jsbin.com/usidix/1");
		driver.manage().window().maximize();
		
		WebElement go=driver.findElement(By.xpath("//input[@type='button']"));
		go.click();
		
		Thread.sleep(4000);
		Alert alt=driver.switchTo().alert();
		
		String mytext=alt.getText();
		System.out.println(mytext);
		Thread.sleep(4000);
		alt.accept();
		
		
		Thread.sleep(4000);
		driver.quit();

	}

}
