package com.sagar.qa.testcases;

import com.sagar.qa.base.TestBase;
import com.sagar.qa.pages.AddAddress;
import com.sagar.qa.pages.HomePage;
import com.sagar.qa.util.TestUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AddAddressTest extends TestBase {

    AddAddress addAddress;
    TestUtil utility=new TestUtil();
    public TestBase testBase= new TestBase();

    String number=props.getProperty("phonenumber");
    String password=props.getProperty("password");
    String pincode=props.getProperty("pincode");

    @BeforeMethod
    public void setUp() {
        testBase.initialization();
        addAddress=new AddAddress();
    }
    @DataProvider
    public Object[][] getLoginTestData(){
        Object data[][] = utility.getTestData("address");
        return data;
    }
    @Test(dataProvider = "getLoginTestData")
    public void addAddress(String name, String companyName, String streetAddress, String landmark) throws InterruptedException {
        addAddress.addAddress(name, companyName, streetAddress, landmark, pincode, number, password);
    }
    @AfterMethod
    public void close(){
        testBase.close();
    }
}
