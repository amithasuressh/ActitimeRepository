package com.actitimetestNG.businesslib;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class User {
	
	@ FindBy(xpath ="//div[text()='Add User']/..")
	private WebElement adduserbtn;
	
	@ FindBy(xpath ="//input[@class='filterFieldInput inputFieldWithPlaceholder']")
	private WebElement searchTextArea;
	
	@ FindBy(xpath ="//span[@class='userNameSpan']")
	private WebElement searchText;
	
		
		
		// business libraries
	public void navigateToCreateUserPage() {
		adduserbtn.click();
	}
	
	public void enterSearchCriteria(String firName, String lastName) {
		
		String searchCriteria = lastName+','+Keys.SPACE+firName;
		searchTextArea.sendKeys(searchCriteria);
		searchText.click();
		}
	
	
}
