package com.targetindia.model;

public class Person {
    private String name;
    private int age;
    private Address address;

    public Person (){
        name="unknown";
        age=21;
    }
    public Person( String name , int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "Name : "+ name +"\nAge : "+age;
    }
}
