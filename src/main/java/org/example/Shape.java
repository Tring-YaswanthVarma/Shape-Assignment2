package org.example;

import java.util.*;

import static org.example.Shape.CIRCLE;
import static org.example.Shape.RECTANGLE;

public class Shape {
    static final String CIRCLE = "CIRCLE";
    static final String RECTANGLE = "RECTANGLE";
    private static final double pi = 3.14;
    private final String type;
    private double triangleL1;
    private double triangleL2;
    private double triangleL3;
    private double triangleHeight;
    private double triangleBase;
    private double rectLength;
    private double rectWidth;
    private double radius;

    Shape(String type, double radius) {
        this.type = type;
        this.radius = radius;
    }

    Shape(String type, double rectLength, double rectWidth) {
        this.type = type;
        this.rectLength = rectLength;
        this.rectWidth = rectWidth;
    }

    Shape(String type, double triangleL1, double triangleL2, double triangleL3, double triangleHeight,
          double triangleBase) {
        this.type = type;
        this.triangleL1 = triangleL1;
        this.triangleL2 = triangleL2;
        this.triangleL3 = triangleL3;
        this.triangleHeight = triangleHeight;
        this.triangleBase = triangleBase;
    }

    public double perimeter() {
        if (type.equals(CIRCLE)) {
            return (radius * 2 * pi);
        } else if (type.equals(RECTANGLE)) {
            return (2 * (rectLength + rectWidth));
        } else {
            return triangleL1 + triangleL2 + triangleL3;
        }
    }

    public double area() {
        if (type.equals(CIRCLE)) {
            return (pi * radius * radius);
        } else if (type.equals(RECTANGLE)) {
            return (rectLength * rectWidth);
        } else {
            return (triangleBase * triangleHeight) / 2;
        }
    }
}

class Main{

    public static void main(String[] args) {
        String type;
        double triangleL1;
        double triangleL2;
        double triangleL3;
        double triangleHeight;
        double triangleBase;
        double rectLength;
        double rectWidth;
        double radius;
        Shape s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Shape type : ");
        type = sc.next();
        if (type.equals(CIRCLE)) {
            System.out.println("Enter radius of the CIRCLE : ");
            radius = sc.nextDouble();

            s = new Shape(type, radius);
        } else if (type.equals(RECTANGLE)) {
            System.out.println("Enter length of the RECTANGLE : ");
            rectLength = sc.nextDouble();
            System.out.println("Enter width of the RECTANGLE : ");
            rectWidth = sc.nextDouble();

            s = new Shape(type, rectLength, rectWidth);
        } else {
            System.out.println("Enter 1st side of the triangle : ");
            triangleL1 = sc.nextDouble();
            System.out.println("Enter 2nd side of the triangle : ");
            triangleL2 = sc.nextDouble();
            System.out.println("Enter 3rd side of the triangle : ");
            triangleL3 = sc.nextDouble();
            System.out.println("Enter height of the triangle : ");
            triangleHeight = sc.nextDouble();
            System.out.println("Enter base of the triangle : ");
            triangleBase = sc.nextDouble();

            s = new Shape(type, triangleL1, triangleL2, triangleL3, triangleHeight,
                    triangleBase);
        }
        System.out.println("Perimeter for the Shape : " + s.perimeter());
        System.out.println("Area of the shape : " + s.area());
        sc.close();

    }
}