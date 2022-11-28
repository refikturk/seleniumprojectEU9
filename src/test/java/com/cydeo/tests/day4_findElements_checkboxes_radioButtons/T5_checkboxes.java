package com.cydeo.tests.day4_findElements_checkboxes_radioButtons;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_checkboxes {

    public static void main(String[] args) throws InterruptedException {


        //1. Go to https://practice.cydeo.com/checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/checkboxes");

        // 2. Confirm checkbox #1 is NOT selected by default
        WebElement checBox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        System.out.println("checBox1.isSelected(), expecting = false " + checBox1.isSelected());

        // 3. Confirm checkbox #2 is SELECTED by default.
        WebElement checBox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));
        System.out.println("checBox2.isSelected(), expecting = true " + checBox2.isSelected());

        //4. Click checkbox #1 to select it.
        Thread.sleep(2000);
        checBox1.click();

        //5. Click checkbox #2 to deselect it.
        Thread.sleep(2000);
        checBox2.click();

        //6. Confirm checkbox #1 is SELECTED.
        System.out.println("checBox1.isSelected() = " + checBox1.isSelected());
        //7. Confirm checkbox #2 is NOT selected
        System.out.println("checBox2.isSelected() = " + checBox2.isSelected());




    }
}
/*
        1. Go to http://practice.cydeo.com/checkboxes
        2. Confirm checkbox #1 is NOT selected by default
        3. Confirm checkbox #2 is SELECTED by default.
        //4. Click checkbox #1 to select it.
        //5. Click checkbox #2 to deselect it.
        //6. Confirm checkbox #1 is SELECTED.
        //7. Confirm checkbox #2 is NOT selected
        */
