package com.targetindia.model;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
@ToString
public class Circle implements GeometricShape {

    private double radius ;

    @Override
    public double getArea(){
        double area = pi *radius *radius;
        log.trace("Calculating the area of a circle as {}",area);
        return area;
    }

    @Override
    public double getParameter(){
        double parameter = 2 * pi * radius;
        log.trace("Calculating the parameter of a circle as {}",parameter);
        return parameter;
    }

}
