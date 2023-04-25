package com.targetindia.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Person {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    public void print () {
        System.out.println("Name : "+firstName+" "+lastName);
        System.out.println("Email : "+ email);
        System.out.println("Phone : "+phone);
    }


}
