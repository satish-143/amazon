package com.amazon.satish.pages;

import com.openqa.satish.amazon.variables.VariablesStored;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage2 extends HomeBase1 {
    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ap_password\"]")
    WebElement pssword_Name;
    @FindBy(how = How.XPATH, using = "//*[@id=\"signInSubmit\"]")
    WebElement Login_Btn;

    public LoginPage2(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    public LoginPage3 clickContinue_Btn(){
        pssword_Name.sendKeys(VariablesStored.pssw_name);
        Login_Btn.submit();
        return new LoginPage3(driver);
    }

}
