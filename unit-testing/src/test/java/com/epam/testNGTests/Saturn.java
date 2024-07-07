package com.epam.testNGTests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Saturn {
    @BeforeTest
    public void setUp02(){
        System.out.println("this is before test inside 2nd Package Saturn class");
    }
    @Test
    public void myMethod01(){
        System.out.println("1st method inside saturn class");
    }
    @Test
    public void myMethod02(){
        System.out.println("2nd method inside saturn class");
    }
    @Test
    public void myMethod03(){
        System.out.println("3rd method inside saturn class");
    }
}
