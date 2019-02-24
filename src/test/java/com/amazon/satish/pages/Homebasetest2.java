package com.amazon.satish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homebasetest2 {
    protected WebDriver driver;

    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kameswari\\IdeaProjects\\newtoursdemoaut\\src\\main\\resources\\drivers\\t\\chromedriver.exe");
        driver = new ChromeDriver();

    }
}
