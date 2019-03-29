package com.example.kelvin.myapplication.Model;

public class User {

    private String Name;
    private  String password;

    public User(String name, String password) {
        Name = name;
        this.password = password;
    }

    public User(){
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
