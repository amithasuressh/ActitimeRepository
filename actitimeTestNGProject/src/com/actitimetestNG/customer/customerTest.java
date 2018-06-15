package com.actitimetestNG.customer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitimetestNG.businesslib.Common;
import com.actitimetestNG.businesslib.Login;
import com.actitimetestNG.businesslib.CreateNewCustomer;
import com.actitimetestNG.businesslib.Home;
import com.actitimetestNG.businesslib.Task;

import com.actitimetestNG.commonlib.BaseClass;
import com.actitimetestNG.commonlib.FileDataUtils;
import com.actitimetestNG.commonlib.sampleListner;
import com.actitimetestNG.commonlib.webDriverLib;

public class customerTest extends BaseClass {
	
		
		FileDataUtils file = new FileDataUtils();
		webDriverLib wlib = new webDriverLib();
		
		@ Test()
		public void createCustomerTest() throws Throwable {
			
		// read the page from excel
		String customerName = file.getExcelData("sheet1",2,2);	
		
		//navigate to task page
		Home hpage = PageFactory.initElements(driver, Home.class);
		hpage.navigateToTaskPage();

		//navigate to customer Page
		Task tPage = PageFactory.initElements(driver, Task.class);
		tPage.navigateToCustomerPage();
		
		//create customer
		CreateNewCustomer cPage = PageFactory.initElements(driver, CreateNewCustomer.class);
		cPage.createcustomer(customerName);

			
		}

		@ Test()
		public void createCustomerWithDescTest() throws Throwable {
			
		// read the page from excel
		String customerName = file.getExcelData("Sheet1",5,2);	
		String customerDesc = file.getExcelData("Sheet1", 5,3);
	
		//navigate to task page
		Home hpage = PageFactory.initElements(driver, Home.class);
		hpage.navigateToTaskPage();
		
		//navigate to customer Page
		Task tPage = PageFactory.initElements(driver, Task.class);
		tPage.navigateToCustomerPage();
		
		//create customer
		CreateNewCustomer cPage = PageFactory.initElements(driver, CreateNewCustomer.class);
		cPage.createcustomer(customerName, customerDesc);

			
		}
	
}

