package com.epam.utility;

import com.epam.constants.DriverConstant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;



    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", DriverConstant.GECKO_DRIVER_PATH);
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        driver = new FirefoxDriver(firefoxOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

//    @AfterMethod
//    public void tearDown() {
//        driver.close();
//    }

}
