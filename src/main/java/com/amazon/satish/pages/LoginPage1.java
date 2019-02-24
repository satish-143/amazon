package com.amazon.satish.pages;

import com.openqa.satish.amazon.variables.VariablesStored;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage1 extends HomeBase1 {
    WebDriver driver;
    @FindBy(how = How.XPATH, using = "//*[@id=\"ap_email\"]")
    WebElement emailName;
    @FindBy(how = How.XPATH, using = "//*[@id=\"continue\"]")
    WebElement submit_Btn;

    public LoginPage1(WebDriver driver){
        super(driver);
        this.driver = driver;
    }
    public LoginPage2 clickContinue_Btn(){
        emailName.sendKeys(VariablesStored.email_ID);
        submit_Btn.submit();
        return new LoginPage2(driver);
    }
}
