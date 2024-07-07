package com.epam.testNGTests;

import org.testng.annotations.*;

public class Jupiter {
//    @BeforeSuite
//    public void setUp01(){
//        System.out.println("this is before suite");
//    }
    @BeforeTest
    public void setUp02(){
        System.out.println("this is before test inside 2nd Package Jupiter class");
    }
//    @BeforeClass
//    public void setUp03(){
//        System.out.println("this is before class inside 2nd Package");
//    }
//    @BeforeMethod
//    public void setUp04(){
//        System.out.println("this is before method inside 2nd Package");
//    }
    @Test
    public void myMethod01(){
        System.out.println("1st method inside jupiter class");
    }
    @Test
    public void myMethod02(){
        System.out.println("2nd method inside jupiter class");
    }
    @Test
    public void myMethod03(){
        System.out.println("3rd method inside jupiter class");
    }
}
