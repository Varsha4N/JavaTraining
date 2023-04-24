package com.targetindia.projects;

import java.util.Scanner;

public class SelectiveStatements {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int month ;
        System.out.println("Enter month : ");
        month = sc.nextInt();
        //using if-else

        if( month <1 || month>12){
            System.out.println("Invalid month");
        }
        else if(month==2){
            System.out.println("Contains 28 or 29 days");
        }
        else if( month == 1 || month==3 || month==5 || month==7 || month==8 ||month==10 ||month==12  ){
            System.out.println("Contains 31 days");
        }
        else{
            System.out.println("Contains 30 days");
        }


        //using switch-case

        System.out.println("Enter month : ");
        month = sc.nextInt();

        if( month<1 || month >12){
            System.out.println("Invalid month");
        }


        else{
            switch (month){
                case 2 :
                    System.out.println("Contains 28 or 29 days");
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Contains 30 days");
                    break;
                default:
                    System.out.println("Contains 31 days");

        }


        }


    }
}
