package com.epam.uiTests;

import com.epam.constants.DriverConstant;
import com.epam.constants.URLConstant;
import com.epam.utility.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class JavascriptExecutorTests extends BaseTest {
    @Test
    public void javaScriptExecutorTest(){
        driver.get(URLConstant.GOOGLE_HOMEPAGE);
        WebElement gmailEle=driver.findElement(By.xpath("//a[text()='Gmail']"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        System.out.println(js.executeScript("return document.title;"));
        js.executeScript("arguments[0].click();",gmailEle);

    }
    @Test
    public void searchTest(){
        driver.get(URLConstant.GOOGLE_HOMEPAGE);
        WebElement search=driver.findElement(By.xpath("//textarea[@name='q']"));
        WebElement submit=driver.findElement(By.xpath("//input[@name='btnK']"));
        JavascriptExecutor js=(JavascriptExecutor) driver;

        js.executeScript("arguments[0].value='selenium',arguments[1].click();",search,submit);

    }

    @Test
    public void sleepTest(){
        driver.get(URLConstant.SELENIUM_JSEXECUTOR);
        long startTime=System.currentTimeMillis();
        System.out.println("Start Time "+startTime);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeAsyncScript("window.setTimeout(arguments[arguments.length-1],5000);");
        long endTime=System.currentTimeMillis();
        System.out.println("End Time "+endTime);
        long resut=endTime-startTime;
        System.out.println("Total Time "+resut);



    }

    @Test
    public void scrollTest(){
        driver.get(URLConstant.SELENIUM_SCROLL);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");




    }
    @Test
    public void verticalScrollTest(){
        driver.get(URLConstant.SELENIUM_VERTICAL_SCROLL);
        WebElement healthEle= driver.findElement(By.xpath("//a[text()='Health']"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",healthEle);
    }
    @Test
    public void scrollTillBottomTest(){
        driver.get(URLConstant.SELENIUM_VERTICAL_SCROLL);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }
    @Test
    public void horizontalScrollTest(){
        driver.get(URLConstant.SELENIUM_HORIZONTAL_SCROLL);
        WebElement ele=driver.findElement(By.xpath("//a[text()='Relationship']"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",ele);
    }

}
