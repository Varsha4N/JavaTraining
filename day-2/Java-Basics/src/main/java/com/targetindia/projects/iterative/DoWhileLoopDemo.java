package com.targetindia.projects.iterative;

import java.util.Scanner;

public class DoWhileLoopDemo {
    public static void main (String []args){

        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter number : ");
        n = sc.nextInt();

        int a=-1 , b=1 , c;

        do {
            c=a+b;
            if(c<=n){
                System.out.printf("%d, ",c);
            }
            a=b;
            b=c;
        }while (c<=n);
    }
}
