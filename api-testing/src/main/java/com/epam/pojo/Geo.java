package com.epam.pojo;

public class Geo {
    String lat;
    String lng;

    public String getLat() {
        return lat;
    }

    public Geo setLat(String lat) {
        this.lat = lat;
        return this;
    }

    public String getLng() {
        return lng;
    }

    public Geo setLng(String lng) {
        this.lng = lng;
        return this;
    }

    @Override
    public String toString() {
        return "Geo{" +
                "lat='" + lat + '\'' +
                ", lng='" + lng + '\'' +
                '}';
    }
}
