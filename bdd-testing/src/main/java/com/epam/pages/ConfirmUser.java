package com.epam.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmUser {
    WebDriver driver;

    public ConfirmUser(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    By confirmOTP= By.name("code");
    @FindBy(xpath ="//div[@class='a-box-inner']/h1" )
    private WebElement verifyMobileNo;

    public String getVerificationText(){
        return verifyMobileNo.getText();
    }
}
