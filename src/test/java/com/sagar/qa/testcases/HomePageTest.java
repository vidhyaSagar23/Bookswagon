package com.sagar.qa.testcases;

import com.sagar.qa.base.TestBase;
import com.sagar.qa.pages.HomePage;
import com.sagar.qa.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

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
    public void login(String title) throws InterruptedException {
        home.inputBar(number,password,title);
    }

    @Test
    public void clickNewArrivals() throws InterruptedException {
        home.arrivals(number,password);
    }
    @Test
    public void clickBoxSets() throws InterruptedException {
        home.boxSets(number,password);
    }

    @Test
    public void bestSellers() throws InterruptedException {
        home.bestSellers(number,password);
    }

    @Test
    public void fictionBooks() throws InterruptedException {
        home.fictionBooks(number,password);
    }

    @Test
    public void awardWinners() throws InterruptedException {
        home.awardWinners(number,password);
    }

    @Test
    public void featuredAuthors() throws InterruptedException {
        home.featuredAuthors(number,password);
    }

    @Test
    public void todaysDeal() throws InterruptedException {
        home.todaysDeal(number,password);
    }

    @Test
    public void requestBook() throws InterruptedException {
        home.requestBook(number,password);
    }

    @Test
    public void clickPersonalSettings() throws InterruptedException {
        home.personalSettings(number,password);
    }

    @Test
    public void myOrder() throws InterruptedException {
        home.myOrder(number,password);
    }

    @Test
    public void wishList() throws InterruptedException {
        home.wishList(number,password);
    }

    @Test
    public void giftCerticates() throws InterruptedException{
        home.giftCertificates(number,password);
    }

    @Test
    public void myAddress() throws InterruptedException{
        home.myAddress(number,password);
    }

    @Test
    public void changePassword() throws InterruptedException{
        home.myAddress(number,password);
    }

    @Test
    public void clickHeartWhislist() throws InterruptedException {
        home.heartWhisList(number, password);
    }

    @Test
    public void clickCart() throws InterruptedException {
        home.cart(number, password);
    }

    @Test
    public void clickAboutUs() throws InterruptedException{
        home.aboutUs(number,password);
    }

    @Test
    public void career() throws InterruptedException{
        home.career(number,password);
    }
    @Test
    public void blog() throws InterruptedException{
        home.blog(number,password);
    }
    @Test
    public void contactUs() throws InterruptedException{
        home.contactUs(number,password);
    }

    @Test
    public void privacyPolicy() throws InterruptedException{
        home.privacyPolicies(number,password);
    }

    @Test
    public void termsOfUse() throws InterruptedException{
        home.termsOfUse(number,password);
    }

    @Test
    public void copyRight() throws InterruptedException{
        home.copyRightPolicy(number,password);
    }

    @Test
    public void secureShopping() throws InterruptedException{
        home.secureShopping(number,password);
    }

    @Test
    public void payment() throws InterruptedException{
        home.payment(number,password);
    }

    @Test
    public void shipping() throws InterruptedException{
        home.shipping(number,password);
    }
    @Test
    public void returns() throws InterruptedException{
        home.returns(number,password);
    }

    @Test
    public void faq() throws InterruptedException{
        home.faq(number,password);
    }

    @Test
    public void affiliate() throws InterruptedException{
        home.affiliate(number,password);
    }

    @Test
    public void sitemap() throws InterruptedException{
        home.sitemap(number,password);
    }

    @Test
    public void facebook() throws InterruptedException{
        home.facebook(number,password);
    }

    @Test
    public void twitter() throws InterruptedException{
        home.twitter(number,password);
    }
    @Test
    public void linkedin() throws InterruptedException{
        home.linkedin(number,password);
    }
    @Test
    public void pinterest() throws InterruptedException{
        home.pinterest(number,password);
    }
    @Test
    public void instagram() throws InterruptedException{
        home.instagram(number,password);
    }

    @Test
    public void copyRightFooter() throws InterruptedException{
        String text=home.copyRightFooter(number,password);
        Assert.assertEquals(text,"Copyright © 2024 . Bookswagon.com. All Rights Reserved");
    }

    @AfterMethod
    public void close(){
        testBase.close();
    }
}
