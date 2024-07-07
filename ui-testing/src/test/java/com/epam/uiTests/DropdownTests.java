package com.epam.uiTests;

import com.epam.constants.DriverConstant;
import com.epam.constants.URLConstant;
import com.epam.utility.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class DropdownTests extends BaseTest {

    @Test
    public void dropDownTest(){
        driver.get(URLConstant.SELENIUM_DROPDOWN);
        WebElement dropdown=driver.findElement(By.xpath("//select[@name='country']"));
        Select select=new Select(dropdown);
        System.out.println(dropdown.isEnabled());
        System.out.println(dropdown.isDisplayed());
        System.out.println(select.isMultiple());
        int listSize=select.getOptions().size();
        System.out.println(listSize);
        select.selectByVisibleText("India");


    }
    @Test
    public void dropDownDeselectTest(){
        driver.get(URLConstant.SELENIUM_DROPDOWN);
        WebElement dropdown=driver.findElement(By.xpath("//select[@name='Month']"));
        Select select=new Select(dropdown);
        System.out.println("dropdown support multi select "+select.isMultiple());
        select.selectByIndex(1);
        select.selectByValue("Feb");
        select.selectByVisibleText("March");
        select.deselectByVisibleText("January");
        List<WebElement>selectedOpt=select.getAllSelectedOptions();
        for(WebElement ele:selectedOpt){
            System.out.println(ele.getText());
        }


    }
}
