package com.epam.sunday;

import java.util.StringJoiner;

public class MayFifth {
    public static void main(String[] args) {
        StringJoiner s=new StringJoiner(" ","( "," )");
        s.add("Non-purpose Loan");
        s.add("(2)");
        System.out.println(s);

    }
}
