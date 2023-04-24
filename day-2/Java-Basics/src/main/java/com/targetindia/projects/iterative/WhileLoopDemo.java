package com.targetindia.projects.iterative;

import java.util.Scanner;

public class WhileLoopDemo {
    public static void main (String []args){

        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.print("Enter number : ");
        n = sc.nextInt();
        int i =1;

        while(i<=10){
            System.out.printf("%d X %d = %d\n", n , i , n*i);
            i++;
        }

    }
}
