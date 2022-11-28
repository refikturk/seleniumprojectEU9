package com.cydeo.tests.day4_findElements_checkboxes_radioButtons;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T1_xpath_cssSelector_practice {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //providing extra time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        // c. "E-mail" text
        WebElement emailLabel = driver.findElement(By.cssSelector("label[for='email']"));

        // d. E-mail input box

        WebElement inputBox1_ex1 = driver.findElement(By.xpath("//input[@name='email']"));

        //e . "Retrieve password" button
        WebElement retrievePasswordButton = driver.findElement(By.xpath("//button[@id='form_submit']"));

        // f. f. “Powered by Cydeo" text
        WebElement poweredByCydeo = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("retrievePasswordButton.isDisplayed() = " + retrievePasswordButton.isDisplayed());
        System.out.println("poweredByCydeo.isDisplayed() = " + poweredByCydeo.isDisplayed());

        //3-Locate all the links in the page.
        //window : alt+enter -> it allows create automatically variable
        //mac   : option + Enter --> press enter again
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        //4- Print out the number of the links on the page:
        System.out.println("allLinks size is:" + allLinks.size());

        //5- Print out the texts of the links:
        for (WebElement each : allLinks) {
            System.out.println("Text of link:" + each.getText());
            System.out.println("href value : "+ each.getAttribute("href"));

        }








    }



}
