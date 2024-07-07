package com.epam.runner;

import com.epam.jUnitTests.Tiger;
import com.epam.testNGTests.Pluto;
import com.epam.unitTests.Apple;
import org.testng.annotations.Factory;

public class FactoryMethodDemo {
    @Factory
    public Object [] runTest(){
        Object [] myTestClass=new Object[3];
        myTestClass[0]=new Apple();
        myTestClass[1]=new Pluto();
        myTestClass[2]=new Tiger();
        return myTestClass;
    }
}
