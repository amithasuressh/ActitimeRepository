package com.actitimetestNG.commonlib;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitimetestNG.businesslib.Common;
import com.actitimetestNG.businesslib.Login;

public class BaseClass {
	
	//global declaration of the  driver object
		public static WebDriver driver;
		
		FileDataUtils file = new FileDataUtils();
		webDriverLib wLib = new webDriverLib();
		
		
		@BeforeClass
		public void configBC() throws Throwable{
			//launch the browser
			
			Properties pobj = file.getPropertiesFileObj();
			String browserName = pobj.getProperty("browser");
			
			if (browserName.equals("firefox")) {
				driver = new FirefoxDriver();
			}else if (browserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver","./resources/chromedriver.exe");
				driver = new ChromeDriver();
			}
		
		}
		
		@BeforeMethod
		public void configBm() throws Throwable {
			//login into Actitime application
			Properties pobj = file.getPropertiesFileObj();
			System.out.println("Login");
			
			wLib.waitForPageLoad();
			String url = pobj.getProperty("url");
			driver.get(url);
		
			wLib.waitForPageLoad();
			Login lpage = PageFactory.initElements(driver,Login.class);
			String username = pobj.getProperty("username");
	        String password = pobj.getProperty("password");
	        lpage.Login(username, password);

		}

		
		@AfterMethod
		public void configAM() throws Throwable {
			//logout
			
			 
			Common cPage = PageFactory.initElements(driver,Common.class);
			wLib.waitForElementAndCLick(cPage.getLogoutLink());
			
		}	
		
		
		
		@AfterClass
		//driver close 
		public void configAC() throws Throwable{
			//driver close
			driver.close();
			driver.quit();
		}
		
		

}
