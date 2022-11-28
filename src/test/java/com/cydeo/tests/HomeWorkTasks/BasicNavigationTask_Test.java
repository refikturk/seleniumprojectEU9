package com.cydeo.tests.HomeWorkTasks;

import com.cydeo.utilities.BasicNavigationTask_StringUtilities;
import com.cydeo.utilities.BasicNavigationTask_Utilities;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BasicNavigationTask_Test {

    public static void main(String[] args) {

        String[] eligibleBrowsers = {"chrome", "edge", "firefox"};

        for (String eligibleBrowser : eligibleBrowsers) {

            WebDriver driver = BasicNavigationTask_Utilities.getDriverBasicNavigationTest(eligibleBrowser);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


            //2. Go to website https://google.com
            driver.get("https://google.com");
            //3. Save the title in a string variable
            String googleTitle = driver.getTitle();
            System.out.println(googleTitle);
            //4. Go to https://etsy.com
            driver.get("https://etsy.com");
            //5. Save the title in a string variable
            String etsyTitle = driver.getTitle();
            System.out.println(etsyTitle);
            //6. Navigate back to previous page
            driver.navigate().back();
            //7. Verify that title is same is in step 3
            String googleTitle2 = driver.getTitle();
            BasicNavigationTask_StringUtilities.verifyEquals(googleTitle,googleTitle2);
            //8. Navigate forward to previous page
            driver.navigate().forward();
            //9. Verify that title is same is in step 5
            String etsyTitle2 = driver.getTitle();
            BasicNavigationTask_StringUtilities.verifyEquals(etsyTitle,etsyTitle2);

            driver.close();

        }









    }
}
