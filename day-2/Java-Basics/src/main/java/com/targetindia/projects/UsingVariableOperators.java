package com.targetindia.projects;

public class UsingVariableOperators {
    public static void main (String args[]){

        //Variables
        byte b1=12;
        System.out.println("Value of b1 : " + b1);

        short s1=100;
        System.out.println("Value of s1 : "+s1);

        s1=200;
        System.out.println("Value of s1 : "+s1);

        //Operators
        int n1 , n2;
        n1=21;
        n2=-10;
        n2=n1+n2;

        System.out.println(n2>10 ? "n2 is greater than 10" : "n2 is less than 10");


    }
}
