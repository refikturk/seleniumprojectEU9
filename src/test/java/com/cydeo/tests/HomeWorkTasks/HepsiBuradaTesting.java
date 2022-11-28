package com.cydeo.tests.HomeWorkTasks;

import com.cydeo.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class HepsiBuradaTesting {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDownMethod() {
        System.out.println("Let go of the past, look to the beautiful future..." +
                "Let go of the past, look to the beautiful future...");
        driver.close();
    }

    @BeforeClass
    public void setupMethod (){
        System.out.println("---->BeforeClass is running!");
    }


    @AfterClass
    public void teardownClass() {
        System.out.println("---->AfterClass is running");
    }


    @Test(priority = 1)
    public void test1() {

        driver.get("https://www.hepsiburada.com");
        //Enter Username
        WebElement search = Driver.getDriver().findElement(By.xpath("//input[@class='desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b']"));
        search.sendKeys("iphone13");

    }
}

