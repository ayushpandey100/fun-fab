package com.epam.sunday;

public class Parent {
    int wealth=1000;
    public void getAccInterest(){
        System.out.println("Total interest earned through investing is 100");
    }

    public static void main(String[] args) {
        Parent p=new Parent();
        System.out.println(p.wealth);
        p.getAccInterest();
    }
}
