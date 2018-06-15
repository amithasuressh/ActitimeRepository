package com.actitimetestNG.businesslib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Task {
	
	
	@FindBy (linkText ="Projects & Customers")
	private WebElement projcustbtn;
	
	@FindBy (xpath ="//span[text()='Create Customer']")
	private WebElement addnewcustomerbtn;
	
	@FindBy (xpath ="//span[text()='Create Project']")
	private WebElement addnewprojectbtn;
	
	
	public void navigateToCustomerPage() {
		projcustbtn.click();
		addnewcustomerbtn.click();
	}
		
	public void navigateToProjectPage() {
		projcustbtn.click();
		addnewprojectbtn.click();
	}

	public WebElement getprojcustbtn() {
		return projcustbtn;
	}

	public WebElement getAddnewcustomerbtn() {
		return addnewcustomerbtn;
	}

	public WebElement getAddnewprojectbtn() {
		return addnewprojectbtn;
	}
	
}
