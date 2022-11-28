package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {

    public static void main(String[] args) {

        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");


        //3- Verify “Reset password” button text is as expected:
        //Expected: Reset password
        String expectedResetPasswordText = "Reset password";
        WebElement actualResetPasswordTextElement = driver.findElement(By.cssSelector("button[value='Reset password'"));
        String actualResetPasswordText = actualResetPasswordTextElement.getText();
        System.out.println(actualResetPasswordText);

        if(actualResetPasswordText.equals(expectedResetPasswordText)){
            System.out.println("Reset password text verification is PASSED!");
        } else {
            System.out.println("Reset password text verification is FAILED!!!");
        }









    }
}
