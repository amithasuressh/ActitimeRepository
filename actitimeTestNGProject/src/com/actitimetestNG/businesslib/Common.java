package com.actitimetestNG.businesslib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Common {

	@ FindBy(linkText ="Logout")
	private WebElement logoutLink; 
    
	public void logout() {
        logoutLink.click();
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
		
}	
	

