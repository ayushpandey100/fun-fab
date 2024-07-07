package com.epam.string;

import java.util.*;

public class Orange  {
    public static void main(String[] args) {
        String s1="ayush";
        String s2="ayush";
        String s3=new String("ayush");
        String s4="ayushzA";
        String s5="ayushzAB";
        System.out.println(s4.compareTo(s5));
        System.out.println(s1+s2);
        System.out.println(5+2+s1+s4+100+200);
        System.out.println(s1.concat(s5));
        StringBuilder a=new StringBuilder("4");
        StringBuilder b=new StringBuilder("6");
        System.out.println(a.append('z'));
        String place="kanpur";
        String s6=String.format("My name is %s and I live in %s",s1,place);
        System.out.println(s6);
        String s7=String.join("$",s1,s2);
        System.out.println(s7);

        StringJoiner sj=new StringJoiner(",","$","/-");
        sj.add("100");
        sj.add("000");
        System.out.println(sj);
        String s8="India is beautiful country. We love cricket. Our national animal is tiger.";
        String[] s9=s8.split(" ");
        for(int i=0;i<s9.length;i++){
            System.out.println(s9[i]);
        }
        String s10="Riva Arora";
        System.out.println(s10.startsWith("Ri"));
        System.out.println(s10.endsWith("xa"));

        StringBuilder sb1=new StringBuilder("earth");
        StringBuilder sb2=new StringBuilder(s1);
        System.out.println("**********************");
        System.out.println(sb1.equals(sb2));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));





    }

}
