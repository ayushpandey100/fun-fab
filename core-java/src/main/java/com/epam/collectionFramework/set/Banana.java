package com.epam.collectionFramework.set;

import java.util.*;

public class Banana {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        Collections.addAll(l,23,94,16,41);
        HashSet<Integer>hs=new HashSet<>(l);
        for(int temp:hs){
            System.out.println(temp);
        }

    }

}
