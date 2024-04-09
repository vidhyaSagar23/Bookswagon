package com.sagar.qa.testcases;

import com.sagar.qa.base.TestBase;
import com.sagar.qa.pages.HomePage;
import com.sagar.qa.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.*;

@Listeners({com.sagar.qa.listeners.Listeners.class})
public class HomePageTest extends TestBase{
    HomePage home;

    TestUtil utility=new TestUtil();
    public TestBase testBase= new TestBase();

    String number=props.getProperty("phonenumber");
    String password=props.getProperty("password");

    @BeforeMethod
    public void setUp() {
        testBase.initialization();
        home=new HomePage();
    }

    @DataProvider
    public Object[][] getLoginTestData(){
        Object data[][] = utility.getTestData("search");
        return data;
    }
    @Test(dataProvider = "getLoginTestData", priority = 1)
    public void search(String title) throws InterruptedException {
        log.info("Search books method is executing");
        System.out.println(number+" "+password);
        home.inputBar(number,password,title);
    }

    @Test
    public void clickNewArrivals() throws InterruptedException {
        log.info("Click new Arrivals is executing");
        home.arrivals(number,password);
    }
    @Test
    public void clickBoxSets() throws InterruptedException {
        log.info("Click Box Sets is executing");
        home.boxSets(number,password);
    }

    @Test
    public void bestSellers() throws InterruptedException {
        log.info("Best sellers is executing");
        home.bestSellers(number,password);
    }

    @Test
    public void fictionBooks() throws InterruptedException {
        log.info("Fiction Books");
        home.fictionBooks(number,password);
    }

    @Test
    public void awardWinners() throws InterruptedException {
        log.info("Award Winners is executing");
        home.awardWinners(number,password);
    }

    @Test
    public void featuredAuthors() throws InterruptedException {
        log.info("Featured Authors is executing");
        home.featuredAuthors(number,password);
    }

    @Test
    public void todaysDeal() throws InterruptedException {
        log.info("Today's Deal is executing");
        home.todaysDeal(number,password);
    }

    @Test
    public void requestBook() throws InterruptedException {
        log.info("Request Book is executing");
        home.requestBook(number,password);
    }

    @Test
    public void clickPersonalSettings() throws InterruptedException {
        log.info("Personal Settings");
        home.personalSettings(number,password);
    }

    @Test
    public void myOrder() throws InterruptedException {
        log.info("My order is executing");
        home.myOrder(number,password);
    }

    @Test
    public void wishList() throws InterruptedException {
        log.info("Wish list is executing");
        home.wishList(number,password);
    }

    @Test
    public void giftCerticates() throws InterruptedException{
        log.info("gift certificates is executing");
        home.giftCertificates(number,password);
    }

    @Test
    public void myAddress() throws InterruptedException{
        log.info("My address is executing");
        home.myAddress(number,password);
    }

    @Test
    public void changePassword() throws InterruptedException{
        log.info("Change Password is executing");
        home.myAddress(number,password);
    }

    @Test
    public void clickHeartWhislist() throws InterruptedException {
        log.info("add to wish list is executing");
        home.heartWhisList(number, password);
    }

    @Test
    public void clickCart() throws InterruptedException {
        log.info("click cart is executing");
        home.cart(number, password);
    }

    @Test
    public void clickAboutUs() throws InterruptedException{
        log.info("click about us is executing");
        home.aboutUs(number,password);
    }

    @Test
    public void career() throws InterruptedException{
        log.info("career is is executing");
        home.career(number,password);
    }
    @Test
    public void blog() throws InterruptedException{
        log.info("Blog is executing");
        home.blog(number,password);
    }
    @Test
    public void contactUs() throws InterruptedException{
        log.info("Contact us is executing ");
        home.contactUs(number,password);
    }

    @Test
    public void privacyPolicy() throws InterruptedException{
        log.info("Privacy policies is executing");
        home.privacyPolicies(number,password);
    }

    @Test
    public void termsOfUse() throws InterruptedException{
        log.info("Terms of use is executing");
        home.termsOfUse(number,password);
    }

    @Test
    public void copyRight() throws InterruptedException{
        log.info("Copy right is executing");
        home.copyRightPolicy(number,password);
    }

    @Test
    public void secureShopping() throws InterruptedException{
        log.info("Secure shopping is executing");
        home.secureShopping(number,password);
    }

    @Test
    public void payment() throws InterruptedException{
        log.info("Payment is executing");
        home.payment(number,password);
    }

    @Test
    public void shipping() throws InterruptedException{
        log.info("Shipping is executing");
        home.shipping(number,password);
    }
    @Test
    public void returns() throws InterruptedException{
        log.info("Returns is executing");
        home.returns(number,password);
    }

    @Test
    public void faq() throws InterruptedException{
        log.info("Faq is executing");
        home.faq(number,password);
    }

    @Test
    public void affiliate() throws InterruptedException{
        log.info("Affiliate is executing");
        home.affiliate(number,password);
    }

    @Test
    public void sitemap() throws InterruptedException{
        log.info("Sitemap is executing");
        home.sitemap(number,password);
    }

    @Test
    public void facebook() throws InterruptedException{
        log.info("Facebook is executing");
        home.facebook(number,password);
    }

    @Test
    public void twitter() throws InterruptedException{
        log.info("Twitter is executing");
        home.twitter(number,password);
    }
    @Test
    public void linkedin() throws InterruptedException{
        log.info("Linked in is executing");
        home.linkedin(number,password);
    }
    @Test
    public void pinterest() throws InterruptedException{
        log.info("Pinterest is executing");
        home.pinterest(number,password);
    }
    @Test
    public void instagram() throws InterruptedException{
        log.info("Instagram is executing");
        home.instagram(number,password);
    }

    @Test
    public void copyRightFooter() throws InterruptedException{
        log.info("Copy Rights is executing");
        String text=home.copyRightFooter(number,password);
        Assert.assertEquals(text,"Copyright © 2024 . Bookswagon.com. All Rights Reserved");
    }

    @AfterMethod
    public void close(){
        testBase.close();
    }
}
