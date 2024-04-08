package com.sagar.qa.pages;

import com.sagar.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    Login login=new Login();

    @FindBy(xpath = "//input[@id='inputbar']")
    WebElement searchBar;

    @FindBy(xpath = "//a[text()='New Arrivals']")
    WebElement newArrivals;

    @FindBy(xpath = "//a[text()='Box Sets']")
    WebElement boxSets;

    @FindBy(xpath = "//a[text()='Best sellers']")
    WebElement bestSellers;

    @FindBy(xpath = "//a[text()='Fiction Books']")
    WebElement fictionBooks;

    @FindBy(xpath = "//a[text()='Award Winners']")
    WebElement awardWinners;

    @FindBy(xpath = "//a[text()='Featured Authors']")
    WebElement featuredAuthors;

    @FindBy(xpath = "//li[@id='ctl00_li4']/a")
    WebElement todaysDeal;

    @FindBy(xpath = "//li[@id='ctl00_li1']/a")
    WebElement requestBook;

    @FindBy(xpath = "//div[@class='accountbox']/a")
    WebElement personalSettings;

    @FindBy(xpath = "//div[@class='accountbox']/a/img[@alt='My Order']")
    WebElement myOrder;

    @FindBy(xpath = "//div[@class='accountbox']/a/img[@alt='Wishlist']")
    WebElement wishlist;

    @FindBy(xpath = "//div[@class='accountbox']/a/img[@alt='My Gift Certificates']")
    WebElement giftCertificates;

    @FindBy(xpath = "//div[@class='accountbox']/a/img[@alt='My Address']")
    WebElement myAddress;

    @FindBy(xpath = "//div[@class='accountbox']/a/img[@alt='Change Password']")
    WebElement changePassword;

    @FindBy(xpath = "//a[@class='wishlisticonheader']")
    WebElement heartWhisList;

    @FindBy(xpath = "//a/span[@class='itemcount']")
    WebElement cart;

    @FindBy(xpath = "//a[text()='About Us']")
    WebElement aboutUs;

    @FindBy(xpath = "//a[text()='Career']")
    WebElement career;

    @FindBy(xpath = "//a[text()='Blog']")
    WebElement blog;

    @FindBy(xpath = "//a[text()='Contact Us']")
    WebElement contactUs;

    @FindBy(xpath = "//a[text()='Privacy Policies']")
    WebElement privacyPolicies;

    @FindBy(xpath = "//a[text()='Terms of Use']")
    WebElement termsOfUse;

    @FindBy(xpath = "//a[text()='Secure Shopping']")
    WebElement secureShopping;

    @FindBy(xpath = "//a[text()='Copyright Policy']")
    WebElement copyRight;

    @FindBy(xpath = "//a[text()='Payment']")
    WebElement payment;

    @FindBy(xpath = "//a[text()='Shipping']")
    WebElement shipping;

    @FindBy(xpath = "//a[text()='Return']")
    WebElement returns;

    @FindBy(xpath = "//a[text()='FAQ']")
    WebElement faq;

    @FindBy(xpath = "//a[text()='Affiliate']")
    WebElement affilate;

    @FindBy(xpath = "//a[text()='Sitemap']")
    WebElement siteMap;

    @FindBy(xpath = "//span[@class='allrightreserve']")
    WebElement allRights;

    @FindBy(xpath = "//span[@class='allrightreserve']/parent::div")
    WebElement copyRightFooter;

    @FindBy(xpath = "//li[@class='list-inline-item']/a/img[@alt='Facebook']")
    WebElement faceBook;

    @FindBy(xpath = "//li[@class='list-inline-item']/a/img[@alt='Twitter']")
    WebElement twitter;

    @FindBy(xpath = "//li[@class='list-inline-item']/a/img[@alt='Linkedin']")
    WebElement linkedin;

    @FindBy(xpath = "//li[@class='list-inline-item']/a/img[@alt='Pinterest']")
    WebElement pinterest;

    @FindBy(xpath = "//li[@class='list-inline-item']/a/img[@alt='Instagram']")
    WebElement instagram;

    @FindBy(id = "btnTopSearch")
    WebElement searchBtn;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void inputBar(String phoneNumber, String password,String title) throws InterruptedException {
        login.singleUserLogin(phoneNumber,password);
        this.searchBar.sendKeys(title);
        Thread.sleep(2000);
        this.searchBtn.click();
        Thread.sleep(3000);
    }

    public void arrivals(String phoneNumber, String password) throws InterruptedException {
       login.singleUserLogin(phoneNumber,password);
        this.newArrivals.click();
        Thread.sleep(2000);
    }

    public void boxSets(String phoneNumber, String password) throws InterruptedException {
        login.singleUserLogin(phoneNumber,password);
        this.boxSets.click();
        Thread.sleep(2000);
    }
    public void bestSellers(String phoneNumber, String password) throws InterruptedException {
        login.singleUserLogin(phoneNumber,password);
        this.bestSellers.click();
        Thread.sleep(2000);
    }

    public void fictionBooks(String phoneNumber, String password) throws InterruptedException {
        login.singleUserLogin(phoneNumber,password);
        this.fictionBooks.click();
        Thread.sleep(2000);
    }

    public void awardWinners(String phoneNumber, String password) throws InterruptedException {
        login.singleUserLogin(phoneNumber,password);
        this.awardWinners.click();
        Thread.sleep(2000);
    }

    public void featuredAuthors(String phoneNumber, String password) throws InterruptedException {
        login.singleUserLogin(phoneNumber,password);
        this.featuredAuthors.click();
        Thread.sleep(2000);
    }

    public void todaysDeal(String phoneNumber, String password) throws InterruptedException {
        login.singleUserLogin(phoneNumber,password);
        this.todaysDeal.click();
        Thread.sleep(2000);
    }

    public void requestBook(String phoneNumber, String password) throws InterruptedException {
        login.singleUserLogin(phoneNumber,password);
        this.requestBook.click();
        Thread.sleep(2000);
    }

    public void personalSettings(String phoneNumber, String password) throws InterruptedException {
        login.singleUserLogin(phoneNumber,password);
        this.personalSettings.click();
    }

    public void myOrder(String phoneNumber, String password) throws InterruptedException {
        login.singleUserLogin(phoneNumber,password);
        this.myOrder.click();
        Thread.sleep(2000);
    }

    public void wishList(String phoneNumber, String password) throws InterruptedException {
        login.singleUserLogin(phoneNumber,password);
        this.wishlist.click();
        Thread.sleep(2000);
    }

    public void giftCertificates(String phoneNumber, String password) throws InterruptedException {
        login.singleUserLogin(phoneNumber,password);
        this.giftCertificates.click();
        Thread.sleep(2000);
    }

    public void myAddress(String phoneNumber, String password) throws InterruptedException {
        login.singleUserLogin(phoneNumber,password);
        this.myAddress.click();
        Thread.sleep(2000);
    }

    public void changePassword(String phoneNumber, String password) throws InterruptedException {
        login.singleUserLogin(phoneNumber,password);
        this.changePassword.click();
        Thread.sleep(2000);
    }

    public void heartWhisList(String phoneNumber, String password) throws InterruptedException {
        login.singleUserLogin(phoneNumber,password);
        this.heartWhisList.click();
        Thread.sleep(2000);
    }

    public void cart(String phoneNumber, String password) throws InterruptedException {
        login.singleUserLogin(phoneNumber,password);
        this.cart.click();
        Thread.sleep(2000);
    }

    public void aboutUs(String phoneNumber, String password) throws InterruptedException {
        login.singleUserLogin(phoneNumber,password);
        this.aboutUs.click();
        Thread.sleep(2000);
    }

    public void career(String phoneNumber, String password) throws InterruptedException {
        login.singleUserLogin(phoneNumber,password);
        this.career.click();
        Thread.sleep(2000);
    }

    public void blog(String phoneNumber, String password) throws InterruptedException {
        login.singleUserLogin(phoneNumber, password);
        this.blog.click();
        Thread.sleep(2000);
    }

    public void contactUs(String phoneNumber, String password) throws InterruptedException {
        login.singleUserLogin(phoneNumber,password);
        this.contactUs.click();
        Thread.sleep(2000);
    }

    public void privacyPolicies(String phoneNumber, String password) throws InterruptedException {
        login.singleUserLogin(phoneNumber,password);
        this.privacyPolicies.click();
        Thread.sleep(2000);
    }

    public void termsOfUse(String phoneNumber, String password) throws InterruptedException {
        login.singleUserLogin(phoneNumber,password);
        this.termsOfUse.click();
        Thread.sleep(2000);
    }

    public void secureShopping(String phoneNumber, String password) throws InterruptedException {
        login.singleUserLogin(phoneNumber,password);
        this.termsOfUse.click();
        Thread.sleep(2000);
    }

    public void copyRightPolicy(String phoneNumber, String password) throws InterruptedException {
        login.singleUserLogin(phoneNumber,password);
        this.copyRight.click();
        Thread.sleep(2000);
    }

    public void payment(String phoneNumber, String password) throws InterruptedException {
        login.singleUserLogin(phoneNumber,password);
        this.payment.click();
        Thread.sleep(2000);
    }

    public void shipping(String phoneNumber, String password) throws InterruptedException {
        login.singleUserLogin(phoneNumber,password);
        this.shipping.click();
        Thread.sleep(2000);
    }

    public void returns(String phoneNumber, String password) throws InterruptedException {
        login.singleUserLogin(phoneNumber,password);
        this.returns.click();
        Thread.sleep(2000);
    }

    public void faq(String phoneNumber, String password) throws InterruptedException {
        login.singleUserLogin(phoneNumber,password);
        this.faq.click();
        Thread.sleep(2000);
    }

    public void affiliate(String phoneNumber, String password) throws InterruptedException {
        login.singleUserLogin(phoneNumber,password);
        this.affilate.click();
        Thread.sleep(2000);
    }
    public void sitemap(String phoneNumber, String password) throws InterruptedException {
        login.singleUserLogin(phoneNumber,password);
        this.siteMap.click();
        Thread.sleep(2000);
    }

    public void facebook(String phoneNumber, String password) throws InterruptedException {
        login.singleUserLogin(phoneNumber,password);
        this.faceBook.click();
        Thread.sleep(2000);
    }

    public void twitter(String phoneNumber, String password) throws InterruptedException {
        login.singleUserLogin(phoneNumber,password);
        this.twitter.click();
        Thread.sleep(2000);
    }
    public void linkedin(String phoneNumber, String password) throws InterruptedException {
        login.singleUserLogin(phoneNumber,password);
        this.linkedin.click();
        Thread.sleep(2000);
    }
    public void pinterest(String phoneNumber, String password) throws InterruptedException {
        login.singleUserLogin(phoneNumber,password);
        this.pinterest.click();
        Thread.sleep(2000);
    }

    public void instagram(String phoneNumber, String password) throws InterruptedException {
        login.singleUserLogin(phoneNumber,password);
        this.instagram.click();
        Thread.sleep(2000);
    }

    public String copyRightFooter(String phoneNumber, String password) throws InterruptedException {
        login.singleUserLogin(phoneNumber,password);
        String text = this.copyRightFooter.getText();
        Thread.sleep(2000);
        return text;
    }
}
