package com.epam.designPattern.builderDP;

public class BuilderPatterndemo {
    public static void main(String[] args) {
        Address address=new Address.AddressBuilder("ayush","arya nagar","uttar pradesh","kanpur")
                .build();
        System.out.println(address);
    }
}
