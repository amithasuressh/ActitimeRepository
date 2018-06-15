package com.actitimetestNG.commonlib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class sampleListner implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		
		String failedTestName = result.getMethod().getMethodName();
		EventFiringWebDriver eDriver = new EventFiringWebDriver(BaseClass.driver);
		File scrFile = eDriver.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./screenshots/"+failedTestName+".png");
		try {
			FileUtils.copyFile(scrFile,destFile);
		}catch(IOException e) {
		}
		
		}
	
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	

}
