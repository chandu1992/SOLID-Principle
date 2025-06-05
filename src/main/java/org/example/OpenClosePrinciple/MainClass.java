package org.example.OpenClosePrinciple;

import org.example.OpenClosePrinciple.OCP.AreaCalculator;
import org.example.OpenClosePrinciple.OCP.Circle;
import org.example.OpenClosePrinciple.OCP.Rectangle;
import org.example.OpenClosePrinciple.OCP.Triangle;

public class MainClass {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        Shape circle = new Circle(10.5);
        Rectangle rec = new Rectangle(5,4);
        Triangle tr = new Triangle(2,4);
        System.out.println("area of circle : "+ calculator.calculateArea(circle));
        System.out.println("Recrangle area : "+  calculator.calculateArea(rec));
        System.out.println("Triangle area : "+ calculator.calculateArea(tr));

    }
}
