package com.epam.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.lang.reflect.Constructor;

public class SignInPage {
    WebDriver driver;


    public SignInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id ="createAccountSubmit" )
    private WebElement createAccBtn;

    public CreateAccount createAccount(){
        createAccBtn.click();
        return new CreateAccount(driver);
    }
}
