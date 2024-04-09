package com.sagar.qa.pages;

import com.sagar.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Affiliate extends TestBase {

    Login login=new Login();

    public Affiliate(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[text()='Affiliate']")
    WebElement navigateAffiliate;
    @FindBy(xpath = "//div[@class='get-started']/a")
    WebElement getStarted;

    @FindBy(xpath = "//input[@id='ctl00_phBody_txtEmail']")
    WebElement email;

    @FindBy(xpath = "//input[@id='ctl00_phBody_txtPassword']")
    WebElement password;

    @FindBy(xpath = "//input[@id='ctl00_phBody_btnLogin']")
    WebElement loginBtn;

    @FindBy(xpath = "//a[text()='About the Programme']")
    WebElement aboutProgram;

    @FindBy(xpath = "//a[text()='Payments']")
    WebElement payments;

    @FindBy(xpath = "//a[text()='Terms & Conditions']")
    WebElement TermsConditions;

    @FindBy(xpath = "//a[text()='Contact Us']")
    WebElement contactUs;




    public void clickGetStarted(String number, String password) throws InterruptedException {
        login.singleUserLogin(number, password);
        navigateAffiliate.click();
        getStarted.click();
    }

    public void loginAffiliate(String email, String passAffiliate,String number, String password) throws InterruptedException {
        login.singleUserLogin(number,password);
        this.navigateAffiliate.click();
        this.email.sendKeys(email);
        this.password.sendKeys(passAffiliate);
        this.loginBtn.click();
    }

    public void payments(String number, String password) throws InterruptedException {
        login.singleUserLogin(number,password);
        this.navigateAffiliate.click();
        this.payments.click();
    }

    public void TermsConditions(String number, String password) throws InterruptedException {
        login.singleUserLogin(number,password);
        this.navigateAffiliate.click();
        this.TermsConditions.click();
    }

    public void aboutProgram(String number, String password) throws InterruptedException {
        login.singleUserLogin(number,password);
        this.navigateAffiliate.click();
        this.aboutProgram.click();
    }

    public void contactUs(String number, String password) throws InterruptedException {
        login.singleUserLogin(number,password);
        this.navigateAffiliate.click();
        this.contactUs.click();
    }
}
