package com.sagar.qa.testcases;

import com.sagar.qa.base.TestBase;
import com.sagar.qa.pages.Login;
import com.sagar.qa.util.TestUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{
    public Login login=new Login();

    TestUtil utility=new TestUtil();
    public TestBase testBase= new TestBase();

    @BeforeMethod
    public void setUp() {
        testBase.initialization();
        login=new Login();
    }

    @DataProvider
    public Object[][] getLoginTestData(){
        Object data[][] = utility.getTestData("login");
        return data;
    }

    @Test(dataProvider = "getLoginTestData", priority = 2)
//    @Severity(SeverityLevel.CRITICAL)
//    @Description("Multiple user try to login the application")
//    @Feature("Login : 2")
//    @Story("User enter the valid username and password then login the application")
    public void login(String phoneNumber, String password) throws InterruptedException {
        log.info("Multiple user login method");
        login.login(phoneNumber, password);
    }

    @Test(priority = 1)
//    @Severity(SeverityLevel.CRITICAL)
//    @Description("User login the application")
//    @Feature("Login : 1")
//    @Story("User enter the valid username and password then login the application")
    public void singleUserLogin() throws InterruptedException {
        log.info("Single user Login method running..");
        login.singleUserLogin(props.getProperty("phonenumber"),props.getProperty("password"));
    }

    @AfterMethod
    public void close(){
        testBase.close();
    }
}
