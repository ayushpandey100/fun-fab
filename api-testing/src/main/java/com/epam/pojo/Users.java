package com.epam.pojo;

public class Users {
    int id;
    String name;
    String username;
    String email;
    Address address;
    String phone;
    String website;
    Company company;

    public Users(int id,String name,String username,String email) {
        this.id=id;
        this.name = name;
        this.username = username;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    public Users setAddress(Address address) {
        this.address = address;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Users setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getWebsite() {
        return website;
    }

    public Users setWebsite(String website) {
        this.website = website;
        return this;
    }

    public Company getCompany() {
        return company;
    }

    public Users setCompany(Company company) {
        this.company = company;
        return this;
    }

    public static Users getUser(){
        Users user=new Users(101,"Ayush Pandey","ayu_coder","Ayush_Pandey@epam.com");
        Address address1=new Address("unnao","209861");

        Geo geo=new Geo();
        geo.setLng("45.1793").setLat("-91.5614");
        address1.setStreet("arya nagar").setSuite("ward-18").setGeo(geo);
        Company company1=new Company();
        company1.setName("EPAM").setCatchPhrase("Be The Change").setBs("IT Markets");
        user.setAddress(address1).setPhone("9519176404").setWebsite("epam.org").setCompany(company1);
        return user;


    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                ", phone='" + phone + '\'' +
                ", website='" + website + '\'' +
                ", company=" + company +
                '}';
    }
}
