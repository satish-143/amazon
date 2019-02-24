package com.amazon.satish.pages;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginPage1Test extends HomeBaseTest {

    @Test
    public void loginpage1() {
        HomePage1 homePage1= new HomePage1(driver);
        homePage1.openBrowser();
        homePage1.mouseMoveOpera();
        LoginPage1 loginPage1 = new LoginPage1(driver);
        loginPage1.clickContinue_Btn();
    }
}