package com.epam.jUnitTests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Elephant {
//    @BeforeTest
//    public void setUp02(){
//        System.out.println("this is before test inside 1st Package");
//    }
    @BeforeClass
    public void setUp03(){
        System.out.println("this is before class inside 1st Package Elephant class");
    }
//    @BeforeMethod
//    public void setUp01(){
//        System.out.println("this is before method inside 1st Package");
//    }
    @Test
    public void myMethod01(){
        System.out.println("1st method inside elephant class");
    }
    @Test
    public void myMethod02(){
        System.out.println("2nd method inside elephant class");
    }
    @Test
    public void myMethod03(){
        System.out.println("3rd method inside elephant class");
    }
}
