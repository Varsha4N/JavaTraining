package com.targetindia.programs;

import com.targetindia.model.Product;

public class ProductDemo {
    public static void main (String []args ) {

        Product p1 , p2 , p3 ;

        p1 = new Product() ;
        p2 = new Product( "Mango" , 35.5 );
        p3 = new Product(2321 , "Apple" , 50.2 );

        p1.setId(31);
        p1.setName("Kiwi");
        p1.setUnitPrice(40.0);

        p2.setId(91);

        System.out.println( p2.getName() + " costs Rs." + p2.getUnitPrice());
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);


    }
}
