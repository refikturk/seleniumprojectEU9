package com.cydeo.tests.day7_webTables_utilities_javafaker;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T1_WindowHandle {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void window_handling_test(){


        //1. Create new test and make set ups
        //2. Go to : https://www.amazon.com
        driver.get("https://www.amazon.com");
        //3. Copy paste the lines from below into your class
        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");
        //4. Create a logic to switch to the tab where Etsy.com is open

        Set<String> allWindowHandles = driver.getWindowHandles();

        for (String each : allWindowHandles){

            driver.switchTo().window(each);

            System.out.println("Current URL: "+driver.getCurrentUrl());

            if(driver.getCurrentUrl().contains("etsy")){
                break;
            }


        }

        //5. Assert: Title contains “Etsy”
        //Lines to be pasted:
        String actualTitle = driver.getTitle();
        String expectedTitle = "etsy";

        Assert.assertTrue(actualTitle.toLowerCase().contains(expectedTitle));




        //These lines will simply open new tabs using something called JavascriptExecutor
        //and get those pages. We will learn JavascriptExecutor later as well.



    }



}
