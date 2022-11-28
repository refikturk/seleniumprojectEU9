package com.cydeo.tests.day5_tesNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class task5_dropdownMenu {

    WebDriver driver;

    //1. Open Chrome browser
    @BeforeMethod
    public void driverSetUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }


        @Test
    public void selectIllionis(){
        WebElement dropDownMenu = driver.findElement(By.id("state"));
        Select stateDropDown = new Select(dropDownMenu);

        //WebElement currentlySelectedOption = stateDropDown.getFirstSelectedOption();
         //   System.out.println(currentlySelectedOption);

        stateDropDown.selectByVisibleText("Illinois");
        String currentlySelectedOptionByVisibleText = stateDropDown.getFirstSelectedOption().getText();
        System.out.println(currentlySelectedOptionByVisibleText);

        stateDropDown.selectByValue("VA");
        String currentlySelectedOptionByValue = stateDropDown.getFirstSelectedOption().getText();
        System.out.println(currentlySelectedOptionByValue);

        stateDropDown.selectByIndex(5);
        String selectedOptionByIndexNumber = stateDropDown.getFirstSelectedOption().getText();

        System.out.println(selectedOptionByIndexNumber);

        String expectedResultOfLastOption = "California";

        // verify final selected option is "California"
        Assert.assertEquals(selectedOptionByIndexNumber, expectedResultOfLastOption, "FAILED");








    }


    //1. Open Chrome browser
    //2. Go to http://practice.cybertekschool.com/dropdown
    //3. Select Illinois
    //4. Select Virginia
    //5. Select California
    //6. Verify
    //final selected option is California.
    //Use all Select options. (visible text, value, index)





}
