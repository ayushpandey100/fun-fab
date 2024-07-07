package com.epam.javaBasic;

public class Parent {
    private String firstName;
    protected String lastName;
    public int savings;
    int realEstate;

    public Parent(String firstName, String lastName, int savings, int realEstate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.savings = savings;
        this.realEstate = realEstate;
    }

    public void myMethod01(){
        System.out.println("This is 1st method");
    }
    private void myMethod02(){
        System.out.println("This is 2nd method");
    }
    protected void myMethod03(){
        System.out.println("This is 3rd method");
    }
     void myMethod04(){
        System.out.println("This is 4th method");
    }

//    public static void main(String[] args) {
//        Parent p1=new Parent("ya","ui",7,9);
//        System.out.println(p1.firstName);
//        System.out.println(p1.lastName);
//        System.out.println(p1.savings);
//        System.out.println(p1.realEstate);
//
//
//        Child c1=new Child("ya","ui",7,9,0);
//        System.out.println(c1.firstName);
//        System.out.println(c1.lastName);
//        System.out.println(c1.savings);
//        System.out.println(c1.realEstate);
//        System.out.println(c1.salary);
//
//        Parent p2=new Child("ya","ui",7,9,0);
//        System.out.println(p2.firstName);
//        System.out.println(p2.lastName);
//        System.out.println(p2.savings);
//        System.out.println(p2.realEstate);
//        System.out.println(p2.salary);
//
//        Child c2=(Child)new Parent("ya","ui",7,9);
//        System.out.println(c2.firstName);
//        System.out.println(c2.lastName);
//        System.out.println(c2.savings);
//        System.out.println(c2.realEstate);
//        System.out.println(c2.salary);
//    }
}
