package com.epam.uiTests;

import com.sun.source.tree.AssertTree;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Await {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ayush_Pandey\\Desktop\\SelfLearn\\utility\\driver\\chrome120\\chromedriver.exe");
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver=new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //driver.get("https://www.amazon.in/");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


    @Test
    public void waitTest(){

        String actual=driver.getTitle();
        String expected="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void checkBoxTest(){
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement checkBox1=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkBox2=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        System.out.println(checkBox1.isSelected());
        System.out.println(checkBox2.isSelected());
        checkBox1.click();
        checkBox2.click();
        System.out.println("Checkbox is selected or not");
        System.out.println(checkBox1.isSelected());
        System.out.println(checkBox2.isSelected());
        System.out.println("Checkbox is enabled or not");
        System.out.println(checkBox1.isEnabled());
        System.out.println(checkBox2.isEnabled());
        System.out.println("Checkbox is displayed or not");
        System.out.println(checkBox1.isDisplayed());
        System.out.println(checkBox2.isDisplayed());

    }
    @Test
    public void dynamicContentTest(){
        driver.get("https://the-internet.herokuapp.com/dynamic_content");
        WebElement paragraph1= driver.findElement(By.xpath("(//div[@class='large-10 columns'])[1]"));
        String initialPara1=paragraph1.getText();
        driver.navigate().refresh();
        WebElement afterParagraph1= driver.findElement(By.xpath("(//div[@class='large-10 columns'])[1]"));
        String afterRefreshPara1=afterParagraph1.getText();
        Assert.assertNotEquals(initialPara1,afterRefreshPara1);
        System.out.println(initialPara1);
        System.out.println(afterRefreshPara1);

    }


    @Test
    public void windowTest(){
        driver.get("https://the-internet.herokuapp.com/windows");
        WebElement clickHereBtn=driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
        clickHereBtn.click();
        clickHereBtn.click();
        clickHereBtn.click();
        String parentWindow=driver.getWindowHandle();
        System.out.println(parentWindow);
        System.out.println("All available winow");
        Set<String> availableWindows=driver.getWindowHandles();
        for(String identity: availableWindows){
            System.out.println(identity);

        }

    }
    @Test
    public void frameTest(){
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.switchTo().frame(0);

        driver.switchTo().frame("frame-left");
        WebElement leftElement= driver.findElement(By.tagName("body"));
        System.out.println(leftElement.getText());
        driver.switchTo().parentFrame();

        driver.switchTo().frame("frame-middle");
        WebElement middleElement= driver.findElement(By.tagName("body"));
        System.out.println(middleElement.getText());
        driver.switchTo().parentFrame();

        driver.switchTo().frame("frame-right");
        WebElement rightElement= driver.findElement(By.tagName("body"));
        System.out.println(rightElement.getText());
        driver.switchTo().defaultContent();



        driver.switchTo().frame("frame-bottom");
        WebElement bottomElement= driver.findElement(By.tagName("body"));
        System.out.println(bottomElement.getText());
        driver.switchTo().parentFrame();

    }

    @Test
    public void alertTest(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement alertBtn=driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
        alertBtn.click();
        driver.switchTo().alert().accept();
        //System.out.println(driver.switchTo().alert().getText());
        WebElement result= driver.findElement(By.id("result"));
        String resultText= result.getText();
        Assert.assertEquals(resultText,"You successfully clicked an alert");
        System.out.println(resultText);


    }
    @Test
    public void confirmTest(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement alertBtn=driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
        alertBtn.click();
//        driver.switchTo().alert().accept();
//        WebElement result= driver.findElement(By.id("result"));
//        String resultText= result.getText();
//        Assert.assertEquals(resultText,"You clicked: Ok");
//        System.out.println(resultText);

        driver.switchTo().alert().dismiss();
        WebElement result= driver.findElement(By.id("result"));
        String resultText= result.getText();
        Assert.assertEquals(resultText,"You clicked: Cancel");
        System.out.println(resultText);



    }

    @Test
    public void promptTest(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement alertBtn=driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
        alertBtn.click();
        driver.switchTo().alert().sendKeys("ayush");
        driver.switchTo().alert().accept();

        WebElement result= driver.findElement(By.id("result"));
        String resultText= result.getText();
        Assert.assertEquals(resultText,"You entered: ayush");
        System.out.println(resultText);

//        driver.switchTo().alert().dismiss();
//        WebElement result= driver.findElement(By.id("result"));
//        String resultText= result.getText();
//        Assert.assertEquals(resultText,"You entered: null");
//        System.out.println(resultText);



    }
    @Test
    public void dropDownTest(){
        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement selectElement=driver.findElement(By.id("dropdown"));
        Select select=new Select(selectElement);
        select.selectByIndex(1);
        System.out.println(select.isMultiple());//false
        List<WebElement>options=select.getAllSelectedOptions();
        for(WebElement opt:options){
            System.out.println(opt.getText());
        }

    }

    @Test
    public void codeEditorTest(){
        driver.get("http://the-internet.herokuapp.com/tinymce");
        driver.switchTo().frame("mce_0_ifr");
        WebElement textBox=driver.findElement(By.id("tinymce"));
        textBox.clear();
        textBox.sendKeys("My name is Ayush. i'm Indian national athelete preparing for..");
        System.out.println(textBox.getText());
        Assert.assertEquals(textBox.getText(),"My name is Ayush. i'm Indian national athelete preparing for..");


    }

}
