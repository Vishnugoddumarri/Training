package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;




public class Listeners extends Utility implements ITestListener {
    public void onTestStart(ITestResult result) {
        System.out.println(result.getName()+" test case started");

    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("The name of the testcase passed is :"+result.getName());

    }

    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Failed Test");
        screenshotClick();
    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }
}
