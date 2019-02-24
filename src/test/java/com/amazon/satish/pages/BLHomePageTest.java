package com.amazon.satish.pages;

import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class BLHomePageTest extends  HomeBaseTest{
    private final String AMAZON_URL = "https://www.amazon.in/";
    private  HomePage homepage;

    @Test
    public void homePageVerify(){
        homepage = new HomePage(driver, AMAZON_URL);
        String title = homepage.getTitle();
        assertEquals(title
               ,"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
    }

    @Test
    public void verifySignInLink(){
        SignInPage1 signInPage1 = homepage.clickSignInLinkFromHomePage();
        signInPage1.clickContinue();


    }

}