package com.amazon.satish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPage1 extends HomeBase {

    private WebDriver driver;
    @FindBy(how = How.ID, using = "ap_email")
    private WebElement email;
    @FindBy(how = How.ID, using="continue")
    private WebElement continueBtn;

    public SignInPage1(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void emialID(String emailID){
        email.sendKeys(emailID);
    }

    public SignInpage2 clickContinue(){
        continueBtn.submit();
        return new SignInpage2(driver);
    }
}
