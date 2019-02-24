package com.amazon.satish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInpage2 extends HomeBase{

    private WebDriver driver;
    @FindBy(how = How.ID, using = "ap_password")
    private WebElement passw;
    @FindBy(how = How.ID, using="signInSubmit")
    private WebElement signButton;

    public SignInpage2(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    public void password(String Passw){
        passw.sendKeys(Passw);
    }

    public ALHomePage clickContinue(){
        signButton.submit();
        driver = null;
        return new ALHomePage(driver);
    }



}
