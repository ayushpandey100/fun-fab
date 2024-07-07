package com.epam.uiTests;

import com.epam.constants.DriverConstant;
import com.epam.constants.URLConstant;
import com.epam.utility.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertTests extends BaseTest {

    @Test
    public void simpleAlertTest(){
        driver.get(URLConstant.SELENIUM_ALERT);
        driver.findElement(By.xpath("//input[@id='simple']")).click();
        Alert alert=driver.switchTo().alert();
        alert.accept();

    }
}
