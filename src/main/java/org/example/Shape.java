package org.example;

import java.util.*;

import static org.example.Shape.circle;
import static org.example.Shape.rectangle;

public class Shape {
    static final String circle = "Circle";
    static final String rectangle = "Rectangle";
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
        if (type.equals(circle)) {
            return (radius * 2 * pi);
        } else if (type.equals(rectangle)) {
            return (2 * (rectLength + rectWidth));
        } else {
            return triangleL1 + triangleL2 + triangleL3;
        }
    }

    public double area() {
        if (type.equals(circle)) {
            return (pi * radius * radius);
        } else if (type.equals(rectangle)) {
            return (rectLength * rectWidth);
        } else {
            return (triangleBase * triangleHeight) / 2;
        }
    }
}

class Main{

    public static void main(String[] args) {
        String type;
        double triangleL1, triangleL2, triangleL3, triangleHeight, triangleBase;
        double rectLength, rectWidth;
        double radius;
        Shape s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Shape type : ");
        type = sc.next();
        if (type.equals(circle)) {
            System.out.println("Enter radius of the circle : ");
            radius = sc.nextDouble();

            s = new Shape(type, radius);
        } else if (type.equals(rectangle)) {
            System.out.println("Enter length of the rectangle : ");
            rectLength = sc.nextDouble();
            System.out.println("Enter width of the rectangle : ");
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
        // while (flag) {
        // System.out.println("1. Perimeter" + "\n2. Area" + "\n3. Exit" + "\nEnter your
        // choice : ");
        // choice = sc.nextInt();
        // switch (choice) {
        // case 1:
        // System.out.println("Perimeter for the Shape : " + s.perimeter());
        // break;
        // case 2:
        // System.out.println("Area of the shape : " + s.area());
        // break;
        // default:
        // flag = false;
        // break;
        // }
        System.out.println("Perimeter for the Shape : " + s.perimeter());
        System.out.println("Area of the shape : " + s.area());
        sc.close();

    }
}