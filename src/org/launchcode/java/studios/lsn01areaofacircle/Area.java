package org.launchcode.java.studios.lsn01areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of a circle:");
        double radius = input.nextDouble();
        input.close();

        if (radius < 0) {
            System.out.println("The radius must be a positive number.");
        } else {
            double area = Circle.getArea(radius);
            System.out.println("That circle has an area of " + area + ".");
        }
    }
}
