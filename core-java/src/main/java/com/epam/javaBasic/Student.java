package com.epam.javaBasic;

import java.util.HashMap;
import java.util.Map;

public class Student {
    String name;
    double rollNo;
    boolean present;

    public static void main(String[] args) {
//        Student student=new Student();
//        System.out.println(student.name);
//        System.out.println(student.rollNo);
//        System.out.println(student.present);
//        String s=null;
//        System.out.println(s.length());

//        try{
//            int data=10/0;
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
//        finally{
//            System.out.println("Inside finally block");
//        }
        Map<Integer,String>mp=new HashMap<>();
        mp.put(1,"ty");
        mp.put(2,"we");
        mp.put(3,"nm");
        mp.put(4,"sd");
        System.out.println(mp.get(5));


    }
}
