package com.epam.uiTests;

import com.epam.constants.URLConstant;
import com.epam.utility.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenshotTests extends BaseTest {

    @Test
    public void takeScreenshotTest() throws IOException {
        driver.get(URLConstant.FACEBOOK);
        WebElement email= driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("ayush_pandey@epam.com");
        TakesScreenshot ts=(TakesScreenshot) driver;
        File srcFile=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile,new File("./Screenshot/facebook.png"));

    }
    @Test
    public void takeScreenshotFailedTest() throws IOException {
        driver.get(URLConstant.FACEBOOK);
        try{
        WebElement email= driver.findElement(By.xpath("//input[@id='emailp']"));
        email.sendKeys("ayush_pandey@epam.com");
        }
        catch(Exception e){
            TakesScreenshot ts=(TakesScreenshot) driver;
            File srcFile=ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(srcFile,new File("./Screenshot/facebookfailed.png"));
        }

    }
}
