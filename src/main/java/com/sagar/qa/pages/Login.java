package com.sagar.qa.pages;

import com.sagar.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends TestBase {

    @FindBy(xpath = "//input[@id='ctl00_phBody_SignIn_txtEmail']")
    WebElement phoneNumber;

    @FindBy(xpath = "//input[@id='ctl00_phBody_SignIn_txtPassword']")
    WebElement password;

    @FindBy(xpath = "//a[@id='ctl00_phBody_SignIn_btnLogin']")
    WebElement loginButton;

    //	Initializing the Page objects
    public Login() {
        PageFactory.initElements(driver, this);
    }

    public void login(String phoneNumber, String password) throws InterruptedException {
//        ExtentTest test =extent.createTest("MultipleUserLogin");
        this.phoneNumber.sendKeys(phoneNumber);
        this.password.sendKeys(password);
        this.loginButton.click();
    }

    public void singleUserLogin(String phoneNumber, String password) throws InterruptedException {
//        ExtentTest test = extent.createTest("Login");
        this.phoneNumber.sendKeys(phoneNumber);
        this.password.sendKeys(password);
        this.loginButton.click();
    }
}
