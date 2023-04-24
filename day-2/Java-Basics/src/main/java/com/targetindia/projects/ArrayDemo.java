package com.targetindia.projects;

import java.util.Arrays;

public class ArrayDemo {
    public static void main ( String []args){
        //int[] nums;
        //nums = new int[4];
        //nums = new int {12,32,9,47};

        int[] num = {3, 7 ,4 , 9 , 5 };
        System.out.println("num contain : " + Arrays.toString(num));


        num[3]=1;
        num[1]=6;

        System.out.println("num contain : ");
        for(int i=0; i < num.length ; i++){
            System.out.printf("Value at %d index is %d\n", i , num[i]);
        }

        //for each loop
        System.out.println("num contain : ");
        for(int n : num){
            System.out.println(n);
        }

    }
}
