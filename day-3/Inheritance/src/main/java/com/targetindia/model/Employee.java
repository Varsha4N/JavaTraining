package com.targetindia.model;


import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class Employee extends Person{

    private int Id ;
    private double salary;
    private String dept;

    public void print () {
        System.out.println("Employee Details :");
        System.out.println("ID : "+Id);
        super.print();
        System.out.println("Salary : "+salary);
        System.out.println("Department : "+dept);
    }

}
