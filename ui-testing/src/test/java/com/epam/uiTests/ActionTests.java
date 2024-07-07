package com.epam.uiTests;

import com.epam.constants.DriverConstant;
import com.epam.constants.URLConstant;
import com.epam.utility.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ActionTests extends BaseTest {

    @Test
    public void leftClickTest() {
        driver.get(URLConstant.SELENIUM_ACTION_CLICK);
        WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
        int getX = gmail.getLocation().getX();
        int getY = gmail.getLocation().getY();
        Actions actions = new Actions(driver);
        actions.moveByOffset(getX + 1, getY + 1).click().build().perform();


    }

    @Test
    public void doubleClickTest() {
        driver.get(URLConstant.SELENIUM_ACTION_DOUBLE_CLICK);
        WebElement doubleClickEle = driver.findElement(By.xpath("//div[@dir='ltr']//child::button"));
        Actions actions = new Actions(driver);
        actions.moveToElement(doubleClickEle).doubleClick().perform();


    }

    @Test
    public void rightClickTest() {
        driver.get(URLConstant.SELENIUM_ACTION_RIGHT_CLICK);
        WebElement rightClickEle = driver.findElement(By.xpath("//div[@id='div-context']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(rightClickEle).contextClick().perform();
        WebElement pythonEle = driver.findElement(By.xpath("//a[@id='ui-id-2']"));
        pythonEle.click();
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println(alertText);
        alert.accept();


    }

    @Test
    public void clickAndHoldTest() {
        driver.get(URLConstant.SELENIUM_ACTION_CLICK_AND_HOLD);
        WebElement clickAndHoldEle = driver.findElement(By.xpath("//li[@name='C']"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(clickAndHoldEle).moveByOffset(45, -11).pause(3)
                .perform();


    }

    @Test
    public void moveToElementTest() {
        driver.get(URLConstant.SELENIUM_ACTION_CLICK_AND_HOLD);
        WebElement sourceEle = driver.findElement(By.xpath("//li[@name='A']"));
        WebElement targetEle = driver.findElement(By.xpath("//li[@name='A']"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(sourceEle).moveToElement(targetEle).release().pause(5)
                .perform();

    }

    @Test
    public void dragByTest() {
        driver.get(URLConstant.SELENIUM_ACTION_DRAG_BY);
        WebElement sourceEle = driver.findElement(By.id("draggable"));
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(sourceEle, 17, 05)
                .perform();

    }

    @Test
    public void dragAndDropTest() {
        driver.get(URLConstant.SELENIUM_ACTION_DRAG_AND_DROP);
        WebElement sourceEle = driver.findElement(By.id("draggable"));
        WebElement targetEle = driver.findElement(By.id("droppable"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(sourceEle, targetEle)
                .perform();
    }
}
