package com.amazon.satish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends HomeBase{

    private WebDriver driver;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Hello, Sign in')]")
    private WebElement signin1;
    @FindBy(how = How.XPATH, using="//a[@data-nav-role='signin']/span[contains(text(), 'Sign in')]")
    private WebElement signin2;

    public HomePage(WebDriver driver,String Amazon_Url){
        super(driver);
        this.driver = driver;
        driver.get(Amazon_Url);
    }


    public SignInPage1 clickSignInLinkFromHomePage(){
        Actions signIn=new Actions(driver);
        signIn.moveToElement(signin1).moveToElement(signin2).click().build().perform();
        return new SignInPage1(driver);
    }
}

