package com.epam.uiTests;

import com.epam.constants.DriverConstant;
import com.epam.constants.URLConstant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class CrossBrowserTests {
    WebDriver driver;


    @BeforeMethod()
    @Parameters({"browser"})
    public void setUp(String browser){
        if(browser.equalsIgnoreCase("chrome")){
        System.setProperty("webdriver.chrome.driver",DriverConstant.CHROME_DRIVER_PATH);
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver=new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }
        else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver",DriverConstant.GECKO_DRIVER_PATH);
            FirefoxOptions firefoxOptions=new FirefoxOptions();
            driver=new FirefoxDriver(firefoxOptions);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }
        else if(browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver", DriverConstant.EDGE_DRIVER_PATH);
            EdgeOptions edgeOptions=new EdgeOptions();
            driver=new EdgeDriver(edgeOptions);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));}
    }
    @Test(enabled = false)
    public void myUITest(){
        driver.get("https://in.bookmyshow.com/explore/home/pune");
        String actualTital=driver.getTitle();
        String expectedTitle="Movie Tickets, Plays, Sports, Events & Cinemas near Pune - BookMyShow Pune.";
        Assert.assertEquals(actualTital,expectedTitle);
    }
    @Test
    public void googleHomePageTest(){
        driver.get(URLConstant.GOOGLE_HOMEPAGE);
        String actualTitle=driver.getTitle();
        String expectedTitle="Google";
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
