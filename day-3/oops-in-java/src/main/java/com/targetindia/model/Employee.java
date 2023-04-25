package com.targetindia.model;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private int id ;
    private String name;
    private double salary ;
    private String dept;

    public Employee (String name , double salary ){
        this.name = name;
        this.salary = salary;
    }
}
