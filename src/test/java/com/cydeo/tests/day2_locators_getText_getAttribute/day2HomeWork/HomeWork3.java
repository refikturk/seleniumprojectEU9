package com.cydeo.tests.day2_locators_getText_getAttribute.day2HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork3 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://google.com");

        //3- Click to Gmail from top right.
        WebElement gmailButton = driver.findElement(By.className("gb_d"));
        gmailButton.click();
        //4- Verify title contains:
        //Expected: Gmail
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        System.out.println(actualTitle.contains(expectedTitle));

        //5- Go back to Google by using the .back();
        driver.navigate().back();
        //6- Verify title equals:
        //Expected: Google
        String expectedTitle2 = "Google";
        String actualTitle2 = driver.getTitle();
        System.out.println(actualTitle2.equals(expectedTitle2));








    }



}
/*TC #3: Back and forth navigation
        1- Open a chrome browser
        2- Go to: https://google.com
        3- Click to Gmail from top right.
        4- Verify title contains:
        Expected: Gmail
        5- Go back to Google by using the .back();
        6- Verify title equals:
        Expected: Google

 */