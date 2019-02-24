package com.amazon.satish.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SignInpage2Test extends HomeBaseTest {



    @Test
    public void signPage2Verify(){
        HomePage homePage = new HomePage(driver, AMAZON_URL);
        SignInPage1 signInPage1 = homePage.clickSignInLinkFromHomePage();
        signInPage1.emialID("j.sarathchandra1@gmail.com");
        SignInpage2 signInpage2 = signInPage1.clickContinue();
        String actualTitle = signInpage2.getTitle();
        assertEquals(actualTitle,"Amazon Sign In");
    }
    @Test
    public void dropDown(){
        WebElement DropMySelectElement=driver.findElement(By.id("dsfdsf"));
        Select oselect=new Select(DropMySelectElement);
        oselect.selectByVisibleText("ravi");

    }

}