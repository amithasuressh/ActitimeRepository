package com.actitimetestNG.businesslib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewCustomer {
	
	@FindBy (id = "customerLightBox_nameField")
	private WebElement customerNameEdt;
	
	@FindBy (id = "customerLightBox_descriptionField")
	private WebElement customerDescriptionEdt;
	
	@FindBy (xpath ="//span[text()='Create Customer']")
	private WebElement createCustomerBtn;
	
	public void createcustomer(String CustomerName) {
		customerNameEdt.sendKeys(CustomerName);
		createCustomerBtn.click();
	}
	
	public void createcustomer(String CustomerName, String description) {
		customerNameEdt.sendKeys(CustomerName);
		customerDescriptionEdt.sendKeys(description);
		createCustomerBtn.click();
	}

	public WebElement getCustomerNameEdt() {
		return customerNameEdt;
	}

	public WebElement getCustomerDescriptionEdt() {
		return customerDescriptionEdt;
	}

	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}
	

}
