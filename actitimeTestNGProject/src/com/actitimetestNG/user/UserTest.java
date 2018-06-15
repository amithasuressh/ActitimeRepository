package com.actitimetestNG.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitimetestNG.businesslib.Common;
import com.actitimetestNG.businesslib.Login;
import com.actitimetestNG.businesslib.CreateNewCustomer;
import com.actitimetestNG.businesslib.CreateUser;
import com.actitimetestNG.businesslib.Home;
import com.actitimetestNG.businesslib.Task;
import com.actitimetestNG.businesslib.User;
import com.actitimetestNG.commonlib.BaseClass;
import com.actitimetestNG.commonlib.FileDataUtils;
import com.actitimetestNG.commonlib.sampleListner;
import com.actitimetestNG.commonlib.webDriverLib;



public class UserTest extends BaseClass {
	FileDataUtils file = new FileDataUtils();
	webDriverLib wlib = new webDriverLib();
	
	@ Test()
	public void createUserTest() throws Throwable {
				
		String firstname = file.getExcelData("Sheet2",2,2);
		String lastname = file.getExcelData("Sheet2",2,3);
		String email = file.getExcelData("Sheet2",2,4);
		String username = file.getExcelData("Sheet2",2,5);
		String password = file.getExcelData("Sheet2",2,6);
		String passwordcopy = file.getExcelData("Sheet2",2,7);
		
		// navigate to user home page
		Home hPage = PageFactory.initElements(driver, Home.class);
		     hPage.navigateToUserPage();
		     
		// navigate to  create user home page     
		User uPage = PageFactory.initElements(driver,User.class);
		 uPage.navigateToCreateUserPage();
		
		 // create User
		 CreateUser cuPage = PageFactory.initElements(driver,CreateUser.class);
		 cuPage.createUser(firstname, lastname, email, username, password, passwordcopy);
	 
	}
	
	
	@ Test()
	public void modifyTest() throws Throwable {
		String firstname = file.getExcelData("Sheet2",6,2);
		String lastname = file.getExcelData("Sheet2",6,3);
		String email = file.getExcelData("Sheet2",6,4);
		String username = file.getExcelData("Sheet2",6,5);
		String password = file.getExcelData("Sheet2",6,6);
		String passwordcopy = file.getExcelData("Sheet2",6,7);
		
		String fname = file.getExcelData("Sheet2",5,2);
		String lname = file.getExcelData("Sheet2",5,3);
		

		// navigate to user home page
				Home hPage = PageFactory.initElements(driver, Home.class);
				     hPage.navigateToUserPage();
				     
		// navigate to  create user home page     
		User uPage = PageFactory.initElements(driver,User.class);
			 uPage.navigateToCreateUserPage();
				
		// create User
		 CreateUser cuPage = PageFactory.initElements(driver,CreateUser.class);
    		 cuPage.createUser(firstname, lastname, email, username, password, passwordcopy);
    		    		 
    	
    	// enter the firstname in the search textbox 	 
    		 uPage.enterSearchCriteria(firstname,lastname);
    		 
    		 
    	//update the firstname and lastname
    		 cuPage.modifyUser(fname, lname);
		
		}
	
	
	@ Test()
	public void searchUserTest() throws Throwable {
		
		String firstname = file.getExcelData("Sheet2",9,2);
		String lastname = file.getExcelData("Sheet2",9,3);
		String email = file.getExcelData("Sheet2",9,4);
		String username = file.getExcelData("Sheet2",9,5);
		String password = file.getExcelData("Sheet2",9,6);
		String passwordcopy = file.getExcelData("Sheet2",9,7);

		// navigate to user home page
				Home hPage = PageFactory.initElements(driver, Home.class);
				     hPage.navigateToUserPage();
				     
		// navigate to  create user home page     
		User uPage = PageFactory.initElements(driver,User.class);
			 uPage.navigateToCreateUserPage();
				
		// create User
		 CreateUser cuPage = PageFactory.initElements(driver,CreateUser.class);
    		 cuPage.createUser(firstname, lastname, email, username, password, passwordcopy);
    		    		 
    	
    	// enter the firstname in the search textbox 	 
    		 uPage.enterSearchCriteria(firstname,lastname);
    		    		 
		
	}
	
}
