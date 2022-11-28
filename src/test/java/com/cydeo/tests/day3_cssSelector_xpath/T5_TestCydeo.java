package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_TestCydeo {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://access.cydeo.com/login");

        WebElement inputBoxPlace = driver.findElement(By.cssSelector("input[type='email']"));
        inputBoxPlace.sendKeys("rfkturk43@gmail.com" + Keys.ENTER);

        //Thread.sleep(5000);
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //input[@type='password']

        WebElement passwordInputBox = driver.findElement(By.xpath("//input[@type='password'"));
        passwordInputBox.click();
        passwordInputBox.sendKeys("Aybuke09@"+Keys.ENTER);





    }

}
