package com.cydeo.tests.HomeWorkTasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC_Flipkart1 {

    WebDriver driver;

    @BeforeMethod
    public void setUpDriver(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void task1(){

        // Go to https://www.flipkart.com/
        //- Locate Wire Headphones
        driver.get("https://www.flipkart.com");


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement target = driver.findElement(By.linkText("Wired Headphones"));

        target.click();




    }






}
