package org.example.OpenClosePrinciple.OCP;

import org.example.OpenClosePrinciple.Shape;

public class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}
