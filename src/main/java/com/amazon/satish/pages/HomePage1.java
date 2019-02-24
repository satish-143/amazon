package com.amazon.satish.pages;
import com.openqa.satish.amazon.variables.VariablesStored;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage1 extends HomeBase1 {
    protected WebDriver driver;
    WebElement Click_but;
    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-link-yourAccount\"]/span[1]")
    WebElement Signin1;
    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-link-yourAccount\"]/span[2]")
    WebElement Signin2;
    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-flyout-ya-signin\"]/a/span")
    WebElement Signin3;

    public HomePage1(WebDriver driver1){
        super(driver1);
        this.driver = driver1;
    }
    public void openBrowser(){
        this.driver.get(VariablesStored.Amazon_URl);
    }


    public LoginPage1 mouseMoveOpera(){

        Actions moveElement = new Actions(driver);
        moveElement.moveToElement(Signin1).moveToElement(Signin2).moveToElement(Signin3).click().build().perform();
        return new LoginPage1(driver);
    }
}

