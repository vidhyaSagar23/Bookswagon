package com.sagar.qa.listeners;

import com.aventstack.extentreports.ExtentTest;
import com.sagar.qa.base.TestBase;
import com.sagar.qa.util.TestUtil;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners extends TestBase implements ITestListener {

    TestUtil utility;
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println(result.getMethod().getMethodName()+" :onTestStart");
        extent.attachReporter(spark);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println(result.getMethod().getMethodName()+" :onTestSuccess");
        ExtentTest test = extent.createTest(result.getMethod().getMethodName()).assignAuthor("Sagar").assignDevice("Chrome");
        test.pass("Test successfully executed");
        extent.flush();
    }

    @Override
    public void onTestFailure(ITestResult result){
        System.out.println(result.getMethod().getMethodName()+" :onTestFailure");
        ExtentTest test = extent.createTest(result.getMethod().getMethodName()).assignAuthor("Sagar").assignDevice("Chrome");
        test.fail("Test method failed");
        String fTname=result.getMethod().getMethodName();
        utility = new TestUtil();
        try {
            utility.failedTest(fTname);
        } catch (IOException e) {
            e.printStackTrace();
        }
        test.addScreenCaptureFromPath("C:\\Users\\sagar\\Desktop\\SELENIUM TESTING\\selenium_page_object_model\\BS_ScreenShots"+result.getMethod().getMethodName()+".png");
        extent.flush();
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println(result.getMethod().getMethodName()+" :onTestSkipped");
        ExtentTest test = extent.createTest(result.getMethod().getMethodName());
        test.skip("Test method failed");
        extent.flush();
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println(result.getMethod().getMethodName()+" :onTestFailedButWithinSuccessPercentage");
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println(context);
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println(context);
    }


}
