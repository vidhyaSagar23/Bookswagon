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
        this.phoneNumber.sendKeys(phoneNumber);
        Thread.sleep(2000);
        this.password.sendKeys(password);
        Thread.sleep(2000);
        this.loginButton.click();
        Thread.sleep(2000);
    }

    public void singleUserLogin(String phoneNumber, String password) throws InterruptedException {
        this.phoneNumber.sendKeys(phoneNumber);
        Thread.sleep(2000);
        this.password.sendKeys(password);
        Thread.sleep(2000);
        this.loginButton.click();
        Thread.sleep(2000);
    }
}
