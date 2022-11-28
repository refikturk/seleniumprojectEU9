package com.cydeo.tests.day14_letcodePractices;

import com.cydeo.pages.InputPage_letcode;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class inputPractices1 {

    public InputPage_letcode inputPage_letcode;

    @Test
    public void letcodeInputTest(){

        Driver.getDriver().get("https://letcode.in/edit");

        inputPage_letcode = new InputPage_letcode();

        inputPage_letcode.fullName.sendKeys("Junior SDET" + Keys.TAB);

        System.out.println("inputPage_letcode.getAttribute1.getAttribute(\"value\") = " + inputPage_letcode.getAttribute1.getAttribute("value"));

        inputPage_letcode.clearMe.clear();

        //System.out.println("inputPage_letcode.disabledBlock.isEnabled() = " + inputPage_letcode.disabledBlock.isEnabled());

        Assert.assertFalse(inputPage_letcode.disabledBlock.isEnabled());



    }



}
