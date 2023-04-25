package com.targetindia.programs;

import com.targetindia.model.Person;

public class ClassObjectDemo {
    public static void main (String []args){

        Person p1;
        p1 = new Person();

        System.out.println(p1);

        p1 = new Person("sam" ,23);
        System.out.println(p1);

    }
}
