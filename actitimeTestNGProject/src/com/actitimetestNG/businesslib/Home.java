package com.actitimetestNG.businesslib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitimetestNG.commonlib.webDriverLib;

public class Home {
	webDriverLib wlib = new webDriverLib();
	
	@FindBy (xpath ="//div[text()='TASKS']")
	private WebElement taskImg;
	
	@FindBy (xpath ="//div[text()='USERS']")
	private WebElement userImg;

	//business libraries
	public void navigateToTaskPage() throws InterruptedException {
		wlib.waitForElementAndCLick(taskImg);		
	}
	
	public void navigateToUserPage() throws InterruptedException {
		wlib.waitForElementAndCLick(userImg);
		
	}

	public WebElement getTaskImg() {
		return taskImg;
	}

	public WebElement getUserImg() {
		return userImg;
	}
}
