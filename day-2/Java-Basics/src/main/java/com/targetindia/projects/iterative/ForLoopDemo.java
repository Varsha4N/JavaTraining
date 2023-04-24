package com.targetindia.projects.iterative;

import java.util.Scanner;

public class ForLoopDemo {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter number : ");
        n= sc.nextInt();

        for(int i =1 ; i<=10 ; i++ ){
            System.out.printf("%d X %d = %d\n" , n , i , n*i);
        }
    }
}
