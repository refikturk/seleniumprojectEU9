package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputPage_letcode {

    public InputPage_letcode() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id="fullName")
    public WebElement fullName;

    @FindBy (id="getMe")
    public  WebElement getAttribute1;

    @FindBy (id = "clearMe")
    public WebElement clearMe;

    @FindBy (css = "input#noEdit")
    public WebElement disabledBlock;

    @FindBy (css = "input#dontwrite")
    public WebElement readOnlyBlock;


}
