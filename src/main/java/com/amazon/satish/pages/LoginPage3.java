package com.amazon.satish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage3 extends HomeBase1 {
    WebDriver driver;
    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-link-yourAccount\"]/span[1]")
    WebElement yourAcco1;

    public LoginPage3(WebDriver driver){
        super(driver);
        this.driver=driver;
    }

    public LoginPage4 click_Continue(){
        Actions moveToMouse= new Actions(driver);
        moveToMouse.moveToElement(yourAcco1).click().build().perform();

        return null;
    }
}
