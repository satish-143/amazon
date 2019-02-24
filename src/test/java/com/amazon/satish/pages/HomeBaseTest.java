package com.amazon.satish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.*;

public class HomeBaseTest {
    protected  WebDriver driver;
    protected final String AMAZON_URL = "https://www.amazon.in/";

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kameswari\\IdeaProjects\\newtoursdemoaut\\src" +
                "\\main\\resources\\drivers\\t\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }
}