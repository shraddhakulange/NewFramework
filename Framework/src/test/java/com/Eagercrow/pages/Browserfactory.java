package com.Eagercrow.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browserfactory {
	
	public static WebDriver driver;

	 public  static WebDriver openbrowser(String browser,String browsername,String url)
	 {
		if(browsername.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "/Framework/Driver/chromedriver.exe");
		}
		else if(browsername.equalsIgnoreCase("IE"))
		{
			driver=new InternetExplorerDriver();
			System.setProperty("WebDriver.ie.driver", "./Driver/IEDriver.exe");
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			System.setProperty("webDriver.gecko.driver", "/Driver/geckoDriver.exe");
			
		}
		else
			System.out.println("unable to reach browser please specifyt right once");
	 
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get(url);
		return driver;
	 }
 public void teardown()
 {
	driver.quit(); 
 }
 
}
