package com.start1234.WebSiteAuto;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowFrame {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.dev/selenium/docs/api/java/index.html");
		driver.manage().window().maximize();

		WebElement frame1 = driver.findElement(By.xpath("//frame[@name='packageListFrame']"));		
		driver.switchTo().frame(frame1);		
		WebElement firstElm= driver.findElement(By.xpath("//a[@href='com/thoughtworks/selenium/package-frame.html']"));
		firstElm.click();	
		driver.switchTo().defaultContent();
		
		Thread.sleep(4000);
		
		WebElement frame2 = driver.findElement(By.xpath("//frame[@name='packageFrame']"));		
		driver.switchTo().frame(frame2);	
		WebElement firstSec= driver.findElement(By.xpath("//a[@title='interface in com.thoughtworks.selenium'][@href='CommandProcessor.html']"));
		firstSec.click();
	//you are supposed to switch to default content
		
		
		Thread.sleep(4000);
		driver.quit();
	}

}
