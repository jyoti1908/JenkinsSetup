package Concepts;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test success");
	}
	
	

	@Override
	public void onTestFailure(ITestResult result) {
	System.out.println("test failed" +result.getName());
	}
	

	@Override
	public void onTestSkipped(ITestResult result) {
	System.out.println("test skipped");	
	}
	

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test started"    +result.getName());	
	}
	
	
}
