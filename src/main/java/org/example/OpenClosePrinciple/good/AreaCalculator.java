package org.example.OpenClosePrinciple.good;

import org.example.OpenClosePrinciple.Shape;

public class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}
