package com.amazon.satish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class HomeBase {
    private WebDriver driver;

    public HomeBase(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public  String getTitle(){
       return this.driver.getTitle();
    }
}

