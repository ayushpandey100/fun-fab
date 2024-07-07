package com.epam.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount {
    WebDriver driver;

    public CreateAccount(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "customerName")
    private WebElement custName;
    @FindBy(xpath = "//input[@placeholder='Mobile number']")
    private WebElement mobNumber;
    @FindBy(css = "#ap_password")
    private WebElement passwordInp;
    @FindBy(className = "a-button-input")
    private WebElement continueBtn;

    @FindBy(tagName = "h1")
    private  WebElement createAccountLabel;


    public CreateAccount enterYourName(String name){
            custName.sendKeys(name);
            return this;
    }
    public CreateAccount enterMobile(String mobileNo){
        mobNumber.sendKeys(mobileNo);
        return this;
    }
    public CreateAccount enterPassword(String password){
        passwordInp.sendKeys(password);
        return this;
    }
    public ConfirmUser enterAccountDetails(String name,String mobileNo,String password){
        this.enterYourName(name);
        this.enterMobile(mobileNo);
        this.enterPassword(password);
        continueBtn.click();
        return new ConfirmUser(driver);
    }
    public String getCreateAccountText(){
        return createAccountLabel.getText().trim();
    }
    public ConfirmUser performClickOnContiniue(){
         continueBtn.click();
         return new ConfirmUser(driver);
    }
}
