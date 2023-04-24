package com.targetindia.projects;

public class StringDemo {
    public static void main ( String args []){
        String myName = new String("Varsha");
        String myCity = "Hyderabad";

        System.out.println("I'm "+myName + " I'm from "+myCity);

        String name1 = "Levi";
        String name2 = new String("Levi");
        System.out.println(name1==name2);//reference check
        System.out.println(name1.equals(name2));//value check

        //string functions

        System.out.println(name1.charAt(2));//index value
        System.out.println(name2.toUpperCase());//converting to upper case
        System.out.println(name1.toCharArray());//to character array
        System.out.println(name1.indexOf('i'));//index of a particular character


    }
}
