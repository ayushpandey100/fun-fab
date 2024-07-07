package com.epam.bddTests;

import com.epam.pages.ConfirmUser;
import com.epam.pages.CreateAccount;
import com.epam.pages.HomePage;
import com.epam.pages.SignInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import java.time.Duration;

public class BaseTest {
WebDriver driver;


    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ayush_Pandey\\Desktop\\SelfLearn\\utility\\driver\\chrome120\\chromedriver.exe");
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver=new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.amazon.in/");

    }
    @Test
    public void createNewAccountTest(){
        HomePage homePage=new HomePage(driver);
        SignInPage signInPage=homePage.navigateToSignIn();
        CreateAccount createAccount=signInPage.createAccount();
        ConfirmUser confirmUser=createAccount.enterAccountDetails("ayush","7652058930","ty@134");
        //Assert.assertEquals(confirmUser.getVerificationText(),"Verify Mobile Number");
    }



}
