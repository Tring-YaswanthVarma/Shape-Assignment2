package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

import static org.example.Shape.CIRCLE;
import static org.example.Shape.RECTANGLE;

class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger("com.api.jar");
        String check;
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
        logger.info("Enter Shape type : ");
        type = sc.next().toLowerCase();
        if (type.equals(CIRCLE)) {
            logger.info("Enter radius of the CIRCLE : ");
            radius = sc.nextDouble();

            s = new Shape(type, radius);
        } else if (type.equals(RECTANGLE)) {
            logger.info("Enter length of the RECTANGLE : ");
            rectLength = sc.nextDouble();
            logger.info("Enter width of the RECTANGLE : ");
            rectWidth = sc.nextDouble();

            s = new Shape(type, rectLength, rectWidth);
        } else {
            logger.info("Enter 1st side of the triangle : ");
            triangleL1 = sc.nextDouble();
            logger.info("Enter 2nd side of the triangle : ");
            triangleL2 = sc.nextDouble();
            logger.info("Enter 3rd side of the triangle : ");
            triangleL3 = sc.nextDouble();
            logger.info("Enter height of the triangle : ");
            triangleHeight = sc.nextDouble();
            logger.info("Enter base of the triangle : ");
            triangleBase = sc.nextDouble();

            s = new Shape(type, triangleL1, triangleL2, triangleL3, triangleHeight,
                    triangleBase);
        }
        check = "Perimeter for the Shape : " + s.perimeter();
        logger.info(check);
        check = "Area of the shape : " + s.area();
        logger.info(check);
        sc.close();


    }
}
