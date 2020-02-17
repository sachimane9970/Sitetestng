package com.start1234.WebSiteAuto;

import org.testng.annotations.Test;


  import org.openqa.selenium.By;
  import org.openqa.selenium.WebDriver;
  import org.openqa.selenium.WebElement;
  import org.openqa.selenium.chrome.ChromeDriver;
  import org.openqa.selenium.firefox.FirefoxDriver;
  import org.openqa.selenium.ie.InternetExplorerDriver;
  import org.testng.annotations.AfterTest;
  import org.testng.annotations.BeforeTest;
  import org.testng.annotations.Parameters;
  import org.testng.annotations.Test;

  public class NewTestNg {
  	WebDriver driver;

  	@Parameters("abc")
  	@BeforeTest
  	public void setup(String mycomingbrowserName) {
  		
  		System.out.println(mycomingbrowserName);
  		
  		if (mycomingbrowserName.equals("chrome")) {
  			System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
  			driver = new ChromeDriver();
  		}
  		
  		else if(mycomingbrowserName.equals("ie"))
  		{
  			System.setProperty("webdriver.ie.driver", "resource/IEDriverServer.exe");
  			driver = new InternetExplorerDriver();
  		}
  		
  		else if(mycomingbrowserName.equals("firefox"))
  		{
  			System.setProperty("webdriver.gecko.driver", "resource/geckodriver.exe");
  			driver = new FirefoxDriver();
  		}
  			
  		driver.get("https://www.facebook.com/");
  		driver.manage().window().maximize();
  	}
  	@Test
  	public void loginMethod() {
  		WebElement username = driver.findElement(By.id("email"));
  		username.sendKeys("saurab@gmail.com");

  		WebElement pass = driver.findElement(By.id("pass"));
  		pass.sendKeys("saurab@gmail.com");

  		WebElement login = driver.findElement(By.id("loginbutton"));
  		login.click();
  	}
  	/*@AfterTest
  	public void tearDown() {
  		try {
  			Thread.sleep(4000);
  		} catch (InterruptedException e) {
  			e.printStackTrace();
  		}
  		driver.quit();	
  	}*/
  }


