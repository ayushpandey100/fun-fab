package com.epam.collectionFramework.map;

import java.util.HashMap;

public class Plum {
    public static void main(String[] args) {
        HashMap<Character,Integer>mp=new HashMap<>();
        mp.put('a',2);
        mp.put('b',1);
        mp.put('c',0);
        String s="aabcccb";
        int temp=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(mp.containsKey(s.charAt(i))){
                temp=mp.get(c);
                mp.put(s.charAt(i),++temp);
            }
        }
        System.out.println(mp.values());

    }
}
