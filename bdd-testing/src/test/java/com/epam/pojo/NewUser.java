package com.epam.pojo;

public class NewUser {
    private String Name;
    private String Mobile;
    private String Password;

    public NewUser(String name, String mobile, String password) {
        Name = name;
        Mobile = mobile;
        Password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
