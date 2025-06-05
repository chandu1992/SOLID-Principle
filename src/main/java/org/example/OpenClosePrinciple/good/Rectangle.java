package org.example.OpenClosePrinciple.good;

import org.example.OpenClosePrinciple.Shape;

public class Rectangle implements Shape {

    long length,height;
    public Rectangle(long length, long height) {
        this.height=height;
        this.length=length;
    }

    @Override
    public double calculateArea() {
        return length*height;
    }
}
