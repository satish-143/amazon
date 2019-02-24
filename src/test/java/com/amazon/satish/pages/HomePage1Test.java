package com.amazon.satish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class HomePage1Test extends HomeBaseTest1 {

    @Test(priority =2 )
    public void homePage1() {
        HomePage1 homePage1 = new HomePage1(driver);
        homePage1.openBrowser();
        homePage1.mouseMoveOpera();

    }

}