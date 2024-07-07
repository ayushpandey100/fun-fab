package com.epam.pojo;

public class Address {
    String street;
    String suite;
    String city;
    String zipcode;
    Geo geo;

    public Address(String city,String zipcode) {
        this.city = city;
        this.zipcode=zipcode;
    }

    public String getCity() {
        return city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getStreet() {
        return street;
    }

    public Address setStreet(String street) {
        this.street = street;
        return this;
    }

    public String getSuite() {
        return suite;
    }

    public Address setSuite(String suite) {
        this.suite = suite;
        return this;
    }

    public Geo getGeo() {
        return geo;
    }

    public Address setGeo(Geo geo) {
        this.geo = geo;
        return this;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", suite='" + suite + '\'' +
                ", city='" + city + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", geo=" + geo +
                '}';
    }
}
