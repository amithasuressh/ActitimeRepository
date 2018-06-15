package com.actitimetestNG.businesslib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

	//WebElement locator
	 @ FindBy(name="username")
	 private WebElement userEdit;
	 
	 @ FindBy(name="pwd")
	 private WebElement passwordEdit;
	 
	 @ FindBy(id = "loginButton")
	 private WebElement loginButton;
	 
	 // business libraries
	 public void Login() {
		 userEdit.sendKeys("admin");
		 passwordEdit.sendKeys("manager");
		 loginButton.click();
	 }
	 
	 public void Login(String usrName, String pwd) {
		 userEdit.sendKeys(usrName);
		 passwordEdit.sendKeys(pwd);
		 loginButton.click();
	 }

	public WebElement getUserEdit() {
		return userEdit;
	}

	public WebElement getPasswordEdit() {
		return passwordEdit;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
}
