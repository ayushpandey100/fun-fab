package com.epam.uiTests;

import com.epam.constants.URLConstant;
import com.epam.utility.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IFrameTests extends BaseTest {

    @Test
    public void frameTest(){
        driver.get(URLConstant.SELENIUM_FRAME);
        driver.switchTo().frame(0);
        WebElement searchBox= driver.findElement(By.xpath("//input[@id='td-header-search' and @itemprop='query-input' ]"));

        searchBox.click();
        searchBox.sendKeys("Selenium Jobs");
        WebElement searchBtn= driver.findElement(By.xpath("//button[@type='submit' and @id='td-header-search-top']"));
        searchBtn.click();
        driver.switchTo().defaultContent();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.findElements(By.tagName("iframe")).size());


    }
}
