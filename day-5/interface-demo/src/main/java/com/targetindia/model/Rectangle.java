package com.targetindia.model;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rectangle implements GeometricShape{

    private double length , breadth;

    @Override
    public double getArea (){
        double area = length*breadth;

        log.trace("Calculating the area of a rectangle as {}",area);

        return area;
    }
}
