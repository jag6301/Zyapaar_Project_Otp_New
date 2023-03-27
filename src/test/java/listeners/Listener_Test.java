package listeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import testclass.Base_Test;
import utility.Screen;

public class Listener_Test extends Base_Test implements ITestListener {
    WebDriver driver;
   ExtentReports extent = Extend_Repo.extentReportGenerator();
	
	ExtentTest test;
		@Override
		public void onTestStart(ITestResult result) {
			 test = extent.createTest(result.getName());
			System.out.println("TEST CASE "+result.getMethod().getMethodName()+" HAS BEEN STARTED");
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			System.out.println("TEST CASE"+result.getMethod().getMethodName()+"HAS BEEN SUCCESS");
			test.log(Status.PASS, "Test case has been passed");
		}

		@Override
		public void onTestFailure(ITestResult result) {
			System.out.println("TEST CASE "+result.getMethod().getMethodName()+" HAS BEEN FAILED");
			test.fail(result.getThrowable());
	        try {
				Screen.good(driver,result.getMethod().getMethodName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		@Override
		public void onTestSkipped(ITestResult result) {
			System.out.println("TEST CASE "+result.getMethod().getMethodName()+" HAS BEEN SKIPPED");
			test.log(Status.SKIP, "Test case has been skipped");

		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			
		}
		@Override
		public void onTestFailedWithTimeout(ITestResult result) {
			
		}

		@Override
		public void onStart(ITestContext context) {
			System.out.println("TEST TAG "+context.getName()+" HAS BEEN STARTED");

		}

		@Override
		public void onFinish(ITestContext context) {
			System.out.println("TEST TAG "+context.getName()+" HAS BEEN FINISHED");
			extent.flush();

		}


}
