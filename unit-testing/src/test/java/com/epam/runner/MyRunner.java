package com.epam.runner;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.List;

public class MyRunner {
    public static void main(String[] args) {
        TestNG testNG=new TestNG();

        XmlSuite xmlSuite= new XmlSuite();
        xmlSuite.setName("TestNG Runner for unit Test");

        List<String> files=new ArrayList<>();
        files.add("./testng.xml");
        files.add("./custom.xml");

        xmlSuite.setSuiteFiles(files);

        List<XmlSuite>suites=new ArrayList<>();
        suites.add(xmlSuite);


        testNG.setXmlSuites(suites);
        testNG.run();
    }
}
