package com.epam.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id ="nav-link-accountList" )
    private WebElement signInBtn;
    @FindBy(id ="twotabsearchtextbox" )
    private WebElement searchInp;

    public SignInPage navigateToSignIn(){
        signInBtn.click();
        return new SignInPage(driver);
    }
    public HomePage addSearchKey(String keysToBeSearched){
        searchInp.sendKeys(keysToBeSearched);
        return this;
    }
    public HomePage clearSearchData(){
        searchInp.clear();
        return this;
    }

}
