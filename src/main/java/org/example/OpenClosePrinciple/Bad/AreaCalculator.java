package org.example.OpenClosePrinciple.Bad;

import org.example.OpenClosePrinciple.good.Circle;
import org.example.OpenClosePrinciple.good.Rectangle;

public class AreaCalculator {

    public double calculateArea(Object shape) {
        if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            return Math.PI * c.radius * c.radius;
        } else if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            return r.length * r.width;
        }
        return 0;
    }
}
