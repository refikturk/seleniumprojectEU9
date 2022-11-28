package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        //1 - Set up the browser driver
        WebDriverManager.chromedriver().setup();

        //2 - Create instance of the Selenium driver
        WebDriver driver = new ChromeDriver();

        //This will maximaze the current window
        driver.manage().window().maximize();

        //for OS operators
        //driver.manage().window().fullscreen();

        //3 - Go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        //get the title of the page
        String currentTitle = driver.getTitle();
        System.out.println("current title = " +  currentTitle);

        // get the current URL using Selenium
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);

        //Stop code execution for 3 seconds
        Thread.sleep(3000);


        //4 - use selenium to navigate back
        driver.navigate().back();


        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //5 - use selenium to navigate forward
        driver.navigate().forward();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate refresh
        driver.navigate().refresh();

        //use navigate().to():
        driver.navigate().to("https://www.google.com");
        currentTitle = driver.getTitle();


        //get the title of the page
        //System.out.println("driver.getTitle() = "+ driver.getTitle());
        System.out.println("current title = " +  currentTitle);

        // get the current URL using Selenium
        currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);

        //this will close the currently opened window
        driver.close();






    }


}
