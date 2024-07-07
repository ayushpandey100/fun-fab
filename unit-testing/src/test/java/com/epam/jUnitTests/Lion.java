package com.epam.jUnitTests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Lion {
    @BeforeClass
    public void setUp03(){
        System.out.println("this is before class inside 1st Package Lion class");
    }
    @Test
    public void myMethod01(){
        System.out.println("1st method inside lion class");
    }
    @Test
    public void myMethod02(){
        System.out.println("2nd method inside lion class");
    }
    @Test
    public void myMethod03(){
        System.out.println("3rd method inside lion class");
    }
}
