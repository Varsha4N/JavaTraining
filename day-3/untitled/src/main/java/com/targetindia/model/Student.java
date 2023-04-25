package com.targetindia.model;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class Student extends Person{
    private int rollNo;
    private double gpa;

    public Student (int rollNo , String firstName , String lastName , String email , String phoneNo , double gpa){

        super(firstName,lastName,email,phoneNo);
        this.rollNo=rollNo;
        this.gpa=gpa;
    }

    public void print () {

        System.out.println("Student Details : ");
        System.out.println("Roll Number : " + rollNo );
        super.print();
        System.out.println("GPA : "+ gpa );
    }

}
