package com.cydeo.tests.day5_tesNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass
    public void setupMethod(){
        System.out.println("-----> BeforeClass is running!");
    }

    @AfterClass
    public void tearDowndClass(){
        System.out.println("AfterClass is running!");
    }


    @BeforeMethod
    public void setUpMethod(){
        System.out.println("---> BeforeMethod is running!");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("---> AfterMethod is running!");
    }

    @Test (priority = 1)
    public void test1() {

        System.out.println("Test1 is running...");
        int[] integer = {1,2,4};
        System.out.println(integer[0]);

        // ASSERT EQUALS: compare 2 of the same things
        String actual  = "apple";
        String expected = "apple2";

        Assert.assertEquals(actual, expected);

    }

    @Test (priority = 2)
    public void test2(){
        System.out.println("Test2 is running...");

        //Asserttrue
        String actual  = "apple";
        String expected = "apple";

        Assert.assertTrue(actual.equals(expected));


    }



}
