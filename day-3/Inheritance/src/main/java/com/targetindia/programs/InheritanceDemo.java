package com.targetindia.programs;

import com.targetindia.model.Employee;
import com.targetindia.model.Person;
import com.targetindia.model.Student;

public class InheritanceDemo {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setId(21);
        e1.setFirstName("Levi");
        e1.setLastName("Ackerman");
        e1.setDept("Admin");
        e1.setSalary(350000);
        e1.setPhone("3846293740");
        e1.setEmail("l.ackerman@sscouts.com");

        Student s1 = new Student(1932 ,"Eren" ,"Yeager" ,"erenyeager42@xyz.com" ,"4829475272", 3.9);

        System.out.println(e1);
        System.out.println(s1);

        Person p1 ;

        p1=e1 ;
        p1.print();

        System.out.println();

        p1=s1;
        p1.print();
    }
}