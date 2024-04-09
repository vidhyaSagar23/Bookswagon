package com.sagar.qa.pages;

import com.sagar.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddAddress extends TestBase {
    Login login=new Login();

    @FindBy(xpath = "//div[@class='accountbox']/a/img[@alt='My Address']")
    WebElement myAddress;

    @FindBy(xpath = "//div[@class='locationcenter']/a/img")
    WebElement addNewAddress;

    @FindBy(xpath = "//input[@id='ctl00_phBody_ShippingAddress_txtRecipientName']")
    WebElement fullName;

    @FindBy(xpath = "//input[@id='ctl00_phBody_ShippingAddress_txtCompanyName']")
    WebElement companyName;

    @FindBy(xpath = "//input[@id='ctl00_phBody_ShippingAddress_txtAddress']")
    WebElement streetAddress;

    @FindBy(xpath = "//input[@id='ctl00_phBody_ShippingAddress_txtLandmark']")
    WebElement landmark;

    @FindBy(xpath = "//input[@id='ctl00_phBody_ShippingAddress_txtPincode']")
    WebElement pincode;

    @FindBy(xpath = "//select[@id='ctl00_phBody_ShippingAddress_ddlState']")
    WebElement state;

    @FindBy(xpath = "//input[@id='ctl00_phBody_ShippingAddress_txtMobile']")
    WebElement mobile;

    @FindBy(xpath = "//a[@id='ctl00_phBody_ShippingAddress_imgSubmit']")
    WebElement updateBtn;

    public AddAddress() {
        PageFactory.initElements(driver, this);
    }
    public void addAddress(String name, String companyName, String streetAddress, String landmark, String pincode, String number, String password) throws InterruptedException {
        login.singleUserLogin(number,password);
        myAddress.click();
        addNewAddress.click();
        this.fullName.sendKeys(name);
        this.companyName.sendKeys(companyName);
        this.streetAddress.sendKeys(streetAddress);
        this.landmark.sendKeys(landmark);
        this.pincode.sendKeys(pincode);
        this.mobile.sendKeys(number);
        this.updateBtn.click();
    }
}
