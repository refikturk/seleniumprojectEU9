package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryLoginPage {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://http://library1.cydeo.com/login.html
        driver.get("https://library1.cydeo.com/login.html");

        //3. Enter username: "incorrect@email.com
        WebElement userNameInput = driver.findElement(By.className("form-control"));
        userNameInput.sendKeys("incorrect@email.com");

        //4. Enter password: "incorrect password"
        WebElement inputPassword = driver.findElement(By.id("inputPassword"));
        inputPassword.sendKeys("incorrect password");

        //5. find sign in button and click
        WebElement singInButton = driver.findElement(By.tagName("button"));
        singInButton.click();

        //6. verify visually "Sorry, Wrong Email or Password"














    }
}
