package com.sagar.qa.testcases;

import com.sagar.qa.base.TestBase;
import com.sagar.qa.pages.ChangePassword;
import com.sagar.qa.util.TestUtil;
import org.testng.annotations.*;

@Listeners({com.sagar.qa.listeners.Listeners.class})
public class ChangePasswordTest extends TestBase {

    String number=props.getProperty("phonenumber");
    String password=props.getProperty("password");
    TestUtil utility=new TestUtil();
    public TestBase testBase= new TestBase();
    public ChangePassword changePassword;

    @BeforeMethod
    public void setUp() {
        testBase.initialization();
        changePassword=new ChangePassword();
    }

    @DataProvider
    public Object[][] getLoginTestData(){
        Object data[][] = utility.getTestData("changepassword");
        return data;
    }

    @Test(dataProvider = "getLoginTestData")
    public void changePass(String pass, String newPass, String confirmPass) throws InterruptedException {
        log.info("Change Password method is executing");
        changePassword.changePass(pass,newPass,confirmPass,number,password);
    }

    @Test(dataProvider = "getLoginTestData")
    public void changePassCancel(String pass, String newPass, String confirmPass) throws InterruptedException {
        log.info("Cancel Change password method is executing");
        changePassword.changePassCancel(pass,newPass,confirmPass,number,password);
    }

    @AfterMethod
    public void close(){
        testBase.close();
    }
}
