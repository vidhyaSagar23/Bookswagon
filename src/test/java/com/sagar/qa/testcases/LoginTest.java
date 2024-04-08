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

    @Test(dataProvider = "getLoginTestData", priority = 1)
    public void login(String phoneNumber, String password) throws InterruptedException {
        login.login(phoneNumber, password);
    }


    @Test
    public void singleUserLogin() throws InterruptedException {
        login.singleUserLogin(props.getProperty("phonenumber"),props.getProperty("password"));
    }
    @AfterMethod
    public void close(){
        testBase.close();
    }
}
