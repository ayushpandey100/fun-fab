package com.epam.certificate;

import com.epam.constants.URLConstant;
import com.epam.utility.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MicrosoftTest extends BaseTest {
    @Test
    public void openURLTest() {
        for(int i=0;i<=50;i++){
            driver.switchTo().newWindow(WindowType.TAB);
            driver.get(String.format("https://www.examtopics.com/exams/microsoft/ai-900/view/%s/",i));
        }
        //driver.get(URLConstant.SELENIUM_ACTION_CLICK);



    }
}
