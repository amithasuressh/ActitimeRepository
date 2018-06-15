package com.actitimetestNG.businesslib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitimetestNG.commonlib.webDriverLib;

public class CreateUser {
	
	webDriverLib wlib = new webDriverLib();	
	
	@ FindBy(id ="userDataLightBox_firstNameField")
	private WebElement firstname;
	
	@ FindBy(id ="userDataLightBox_lastNameField")
	private WebElement lastname;
	
	@ FindBy(id ="userDataLightBox_emailField")
	private WebElement email;
	
	@ FindBy(id ="userDataLightBox_usernameField")
	private WebElement username;
	
	@ FindBy(id ="userDataLightBox_passwordField")
	private WebElement password;
	
	@ FindBy(id ="userDataLightBox_passwordCopyField")
	private WebElement passwordcopy;
	
	@ FindBy(xpath ="//span[text()='Create User']")
	private WebElement createuserbtn;
	
	@ FindBy(xpath = "//span[text()='Save Changes']")
	private WebElement savechangesbtn;
	
	public void createUser(String fname, String lname, String mail, String uname, String pwd, String pwdcopy) {
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		email.sendKeys(mail);
		username.sendKeys(uname);
		password.sendKeys(pwd);
		passwordcopy.sendKeys(pwdcopy);
		createuserbtn.click();
		
	}
	
	public void modifyUser(String fname, String lname) throws Throwable {
		firstname.clear();
		firstname.sendKeys(fname);
		
		lastname.clear();
		lastname.sendKeys(lname);
		wlib.waitForElementAndCLick(savechangesbtn);
		
	}
	
	
	

}
