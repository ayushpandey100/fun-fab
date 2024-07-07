package com.epam.unitTests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Orange {
    @BeforeTest
    public void setUp02(){
        System.out.println("this is before test inside 3rd Package orange class");
    }
    @Test
    public void myMethod01(){
        System.out.println("1st method inside orange class");
    }
    @Test
    public void myMethod02(){
        System.out.println("2nd method inside orange class");
    }
    @Test(expectedExceptions = ArithmeticException.class)
    public void myMethod03(){
        System.out.println("3rd method inside orange class");
        throw new ArithmeticException();

    }
}
