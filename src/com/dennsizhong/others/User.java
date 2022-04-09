package com.dennsizhong.others;

public class User {
    // Fields
    public String name;

    public User(String name){
        this.name = name;
    }

    // Methods
    public void sayHello() {
        System.out.println("Hi, my name is "+ this.name);
    }
}
