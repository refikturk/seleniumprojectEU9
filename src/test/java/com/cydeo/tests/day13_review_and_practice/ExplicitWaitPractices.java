package com.cydeo.tests.day13_review_and_practice;

import com.cydeo.pages.DynamicControlsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitPractices {

    DynamicControlsPage dynamicControlsPage;

    @BeforeMethod
    public void setupMethod(){
        //TC #2: Explicit wait practice
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/dynamic_controls
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
        dynamicControlsPage = new DynamicControlsPage();
    }

    @Test
    public void remove_button_test(){
        //3- Click to “Remove” button
        dynamicControlsPage.removeButton.click();

        //4- Wait until “loading bar disappears”
        BrowserUtils.waitForInvisibilityOf(dynamicControlsPage.loadingBar);

        //5- Verify:
        //a. Checkbox is not displayed
        //Assert.assertTrue(dynamicControlsPage.checkbox.isDisplayed());

        try{
            Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            Assert.assertTrue(!dynamicControlsPage.checkbox.isDisplayed());
            //assertFalse method will pass the test if the boolean value returned : is False
            Assert.assertFalse(dynamicControlsPage.checkbox.isDisplayed());
        } catch (NoSuchElementException e){
            //e.printStackTrace();
            Assert.assertTrue(true);
        }


        //b. “It’s gone!” message is displayed.
        Assert.assertTrue(dynamicControlsPage.message.isDisplayed());
        Assert.assertTrue(dynamicControlsPage.message.getText().equals("It's gone!"));



    }

    @Test
    public void enable_button_test(){
        //3- Click to “Enable” button
        dynamicControlsPage.enableButton.click();

        System.out.println("dynamicControlsPage.inputBox.isEnabled() = " + dynamicControlsPage.inputBox.isEnabled());



        //4- Wait until “loading bar disappears”
        BrowserUtils.waitForInvisibilityOf(dynamicControlsPage.loadingBar);

        //5- Verify:
        //a. Input box is enabled.
        System.out.println("dynamicControlsPage.inputBox.isEnabled() = " + dynamicControlsPage.inputBox.isEnabled());

        //b. “It’s enabled!” message is displayed.
        System.out.println("dynamicControlsPage.message.isDisplayed() = " + dynamicControlsPage.message.isDisplayed());

        String expectedMessage = "It's enabled!";
        String actualMessage = dynamicControlsPage.message.getText();

        Assert.assertTrue(actualMessage.contains(expectedMessage));



    }

}
