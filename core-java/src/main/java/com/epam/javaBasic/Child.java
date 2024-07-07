package com.epam.javaBasic;

public class Child extends Parent{
     int salary;

    public Child(String firstName, String lastName, int savings, int realEstate, int salary) {
        super(firstName, lastName, savings, realEstate);
        this.salary = salary;
    }

    public void earn(){
        System.out.println("This is method inside child");
    }

//    public static void main(String[] args) {
//        Parent c=new Child("ayush","pandey",6,10,5);
//        Parent c1=new Parent("ayush","pandey",6,10);
//
//        System.out.println(c1.lastName);
//        System.out.println(c1.savings);
//        System.out.println(c1.realEstate);
//        System.out.println();
//        c.myMethod01();
//    }
//public static void main(String[] args) {
//    Parent p1=new Parent("ya","ui",7,9);
//    System.out.println(p1.firstName);
//    System.out.println(p1.lastName);
//    System.out.println(p1.savings);
//    System.out.println(p1.realEstate);
//
//
//    Child c1=new Child("ya","ui",7,9,0);
//    System.out.println(c1.firstName);
//    System.out.println(c1.lastName);
//    System.out.println(c1.savings);
//    System.out.println(c1.realEstate);
//    System.out.println(c1.salary);
//
//    Parent p2=new Child("ya","ui",7,9,0);
//    System.out.println(p2.firstName);
//    System.out.println(p2.lastName);
//    System.out.println(p2.savings);
//    System.out.println(p2.realEstate);
//    System.out.println(p2.salary);
//
//    Child c2=(Child)new Parent("ya","ui",7,9);
//    System.out.println(c2.firstName);
//    System.out.println(c2.lastName);
//    System.out.println(c2.savings);
//    System.out.println(c2.realEstate);
//    System.out.println(c2.salary);
//}
}
