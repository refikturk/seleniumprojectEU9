package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkText_Practice {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");

        //3- Click to A/B Testing from top of the list.
        //Thread.sleep(2000);
        //driver.findElement(By.linkText("A/B Testing")).click();
        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click(); // after assign as a web element, can be clicked

        //4- Verify title is:
        // Expected: No A/B Test
        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASS!");
        }else{
            System.out.println("Title verification FAILED");
        }

        //5 - Go back to hame page by using the .back()
        driver.navigate().back();

        //6- Verify the title equals:
        //Expected: Practice
        String expectedTitle2 = "Practice";
        String actualTitle2 = driver.getTitle();

        if(actualTitle2.equals(expectedTitle2)){
            System.out.println("Title verification PASS!");
        }else{
            System.out.println("Title verification FAILED");
        }










    }
}
