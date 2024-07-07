package com.epam.uiTests;

import com.epam.constants.DriverConstant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class SeleGrid {
    WebDriver driver;
    @Test
    public void gridTest() throws MalformedURLException {
        ChromeOptions chromeOptions=new ChromeOptions();
        driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://in.bookmyshow.com/explore/home/pune");
        String actualTital=driver.getTitle();
        String expectedTitle="Movie Tickets, Plays, Sports, Events & Cinemas near Pune - BookMyShow Pune.";
        Assert.assertEquals(actualTital,expectedTitle);
        driver.close();
    }
}
