package com.actitimetestNG.commonlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webDriverLib {
	
	public void waitForPageLoad() {
		BaseClass.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	public void waitForElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(BaseClass.driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));
		
		
	}
	
	public void waitForElementToBeVisible(WebElement element) {
		int count=0;
		while(count<20) {
			try {
				element.isDisplayed();
				break;
			}catch(Exception e) {
				count++;
			}
		}
		
	}
	
    public void waitForElementAndCLick(WebElement element) throws InterruptedException {
    	int count=0;
    	while(count<20) {
			try {
				element.click();
				break;
			}catch(Throwable e) {
				Thread.sleep(500);
				count++;
			}
		}
}
    
    public void select(WebElement elemnet ,String data) {
		Select sel = new Select(elemnet);
		sel.selectByVisibleText(data);
	}

}
