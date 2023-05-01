package com.targetindia.model;

public interface GeometricShape {
    double pi=3.14157;
    double getArea();
    default double getParameter(){
        return 0;
    }

}
