package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {

    public static void main(String[] args) {

        //create webDriverManager
        WebDriverManager.chromedriver().setup();

        //create a web driver
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://www.yahoo.com");

        webDriver.manage().window().maximize();


        String expectedTitle =  "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";

        String actualTitle = webDriver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Title is as expected. Verification PASSED");
        }else{
            System.out.println("Title is NOT as expected. Verification FAILED");
        }



    }
}
