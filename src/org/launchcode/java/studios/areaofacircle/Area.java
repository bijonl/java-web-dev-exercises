package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;


public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        double area;
        System.out.println("Enter a Radius: ");
        radius = input.nextDouble();
        Circle.getArea(radius);
        System.out.println("The area of a circle of " + radius + " is: " + Circle.getArea(radius));
    }
}
