package test45;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Mylistener implements ITestListener{
	
	public void onStart(ITestResult result) {
	    System.out.println("Before all the test execution starts here");
	  }

	public void onTestStart(ITestResult result) {
		System.out.println("Before all the testmethods execution  starts here");
	  }
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed");
	  }
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed");
	  }
	
	public void onTestSkip(ITestResult result) {
		System.out.println("Test Skipped");
	  }
	
	public void onFinish(ITestResult result) {
		System.out.println("After all the test execution finishes here");
	  }
	
	
	
	
	
	
	
}
