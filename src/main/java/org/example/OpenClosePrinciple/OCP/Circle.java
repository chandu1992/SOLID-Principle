package org.example.OpenClosePrinciple.OCP;

import org.example.OpenClosePrinciple.Shape;

public class Circle implements Shape {

    double radius;
    public Circle(double radius) {
        this.radius=radius;
    }

    @Override
    public double calculateArea() {
        return radius*radius;
    }
}
