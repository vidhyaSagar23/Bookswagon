package com.sagar.qa.testcases;

import com.sagar.qa.base.TestBase;
import com.sagar.qa.pages.Affiliate;
import com.sagar.qa.util.TestUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AffiliateTest extends TestBase {
    public Affiliate affiliate;
    TestUtil utility=new TestUtil();
    public TestBase testBase= new TestBase();

    String number=props.getProperty("phonenumber");
    String password=props.getProperty("password");

    @BeforeMethod
    public void setUp() {
        testBase.initialization();
        affiliate=new Affiliate();
    }

    @DataProvider
    public Object[][] getLoginTestData(){
        Object data[][] = utility.getTestData("affiliate");
        return data;
    }

    @Test
    public void clickGetStarted() throws InterruptedException {
        affiliate.clickGetStarted(number, password);
    }

    @Test(dataProvider = "getLoginTestData")
    public void loginAffiliate(String email, String passAffiliate) throws InterruptedException {
        affiliate.loginAffiliate(email, passAffiliate,number,password);
    }

    @Test
    public void clickAboutProgram() throws InterruptedException {
        affiliate.aboutProgram(number, password);
    }

    @Test
    public void contactUs() throws InterruptedException {
        affiliate.contactUs(number,password);
    }

    @Test
    public void Payments() throws InterruptedException {
        affiliate.payments(number,password);
    }

    @Test
    public void TermAndContions() throws InterruptedException {
        affiliate.TermsConditions(number,password);
    }

    @AfterMethod
    public void close(){
        testBase.close();
    }
}
