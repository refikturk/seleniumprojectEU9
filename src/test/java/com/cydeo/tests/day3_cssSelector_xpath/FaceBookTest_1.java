package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class FaceBookTest_1 {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        String expectedTitle = "Facebook -Log In or Sign Up";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }





    }
}
