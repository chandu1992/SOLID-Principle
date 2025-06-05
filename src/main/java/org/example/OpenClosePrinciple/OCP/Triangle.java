package org.example.OpenClosePrinciple.OCP;

import org.example.OpenClosePrinciple.Shape;

public class Triangle implements Shape {

    long height,base;
    public Triangle(long height, long base) {
        this.base=base;
        this.height=height;
    }

    @Override
    public double calculateArea() {
        return 0.5*(base*height);
    }
}
