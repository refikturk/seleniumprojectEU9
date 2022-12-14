package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_Windows_Practice {

    WebDriver driver;

    //@BeforeMethod
    @BeforeClass
    public void setupMethod() {
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website : https://practice.cydeo.com/windows
        driver.get("https://practice.cydeo.com/windows");

    }


        @Test
        public void multiple_window_test () {
        //Storing your main handle into a string
        String mainHandle = driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);

        //4. Assert: Title is "Windows"
        String expectedTitle = "Windows";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

        //5. Click to: "Click Here" link
            WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));

            clickHereLink.click();

            actualTitle = driver.getTitle();

            System.out.println("Title after click:" + actualTitle);

        //6. Switch to new Window
        for (String each : driver.getWindowHandles()){

            driver.switchTo().window(each);
            System.out.println("Current title while switching windows: " + driver.getTitle());

        }




        }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

}
