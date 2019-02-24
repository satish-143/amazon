package com.amazon.satish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class HomeBase4 {
    private WebDriver driver;

    public HomeBase4(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
}
