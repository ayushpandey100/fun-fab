package com.epam.unitTests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Apple {
    @BeforeTest
    public void setUp02(){
        System.out.println("this is before test inside 3rd Package");
    }
    @BeforeClass
    public void setUp03(){
        System.out.println("this is before class inside 3rd Package");
    }
    @Test(groups = "smoke")
    public void myMethod01(){
        System.out.println("1st method inside apple class");
        //Assert.assertTrue(false);
    }
    @Test(dependsOnMethods = "myMethod01",alwaysRun = true,groups = "smoke")
    public void myMethod02(){
        System.out.println("2nd method inside apple class");
    }
    @Test(groups = "smoke")
    public void myMethod03(){
        System.out.println("3rd method inside apple class");
    }
}
