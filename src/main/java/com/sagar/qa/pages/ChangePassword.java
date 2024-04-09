package com.sagar.qa.pages;

import com.sagar.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePassword extends TestBase {
    public Login login=new Login();

    public ChangePassword(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='accountbox']/a/img[@alt='Change Password']")
    WebElement navigateChangePass;
    @FindBy(xpath = "//input[@id='ctl00_phBody_ChangePassword_txtCurPwd']")
    WebElement oldPass;

    @FindBy(xpath = "//input[@id='ctl00_phBody_ChangePassword_txtNewPassword']")
    WebElement newPass;

    @FindBy(xpath = "//input[@id='ctl00_phBody_ChangePassword_txtConfirmPwd']")
    WebElement confirmPass;

    @FindBy(xpath = "//a[@id='ctl00_phBody_ChangePassword_imgSubmit']")
    WebElement changePassBtn;

    @FindBy(xpath = "//a[@id='ctl00_phBody_ChangePassword_imgSubmit']/following-sibling::a/input")
    WebElement cancelBtn;

    public void changePass(String pass, String newPass, String confirmPass, String number, String password) throws InterruptedException {
        login.singleUserLogin(number,password);
        this.navigateChangePass.click();
        this.oldPass.sendKeys(pass);
        this.newPass.sendKeys(newPass);
        this.confirmPass.sendKeys(confirmPass);
        this.changePassBtn.click();
    }

    public void changePassCancel(String pass, String newPass, String confirmPass, String number, String password) throws InterruptedException {
        login.singleUserLogin(number,password);
        this.navigateChangePass.click();
        this.oldPass.sendKeys(pass);
        this.newPass.sendKeys(newPass);
        this.confirmPass.sendKeys(confirmPass);
        this.cancelBtn.click();
    }
}
