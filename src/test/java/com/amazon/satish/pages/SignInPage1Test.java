package com.amazon.satish.pages;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SignInPage1Test extends HomeBaseTest {

    @Test
    public void signPageVerify(){
        HomePage homePage = new HomePage(driver, AMAZON_URL);
       SignInPage1 signInPage1 = homePage.clickSignInLinkFromHomePage();
       String actualTitle = signInPage1.getTitle();
       assertEquals(actualTitle,"Amazon Sign In");
    }
}