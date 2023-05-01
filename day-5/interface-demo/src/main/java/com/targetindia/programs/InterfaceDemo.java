package com.targetindia.programs;

import com.targetindia.model.Circle;
import com.targetindia.model.GeometricShape;
import com.targetindia.model.Rectangle;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InterfaceDemo {

    public static void printShapeInfo (GeometricShape shape) {

        log.trace("Got the object of type {}",shape.getClass().getName());
        log.trace("Area of this type is  {} square units",shape.getArea());
        log.trace("Perimeter of this type is  {} square units",shape.getParameter());

    }

    public static void main(String[] args) {

        Circle c1 = new Circle(12.34);
        Rectangle r1 = new Rectangle(12.34,56.78);
        printShapeInfo(c1);
        printShapeInfo(r1);



    }

}
