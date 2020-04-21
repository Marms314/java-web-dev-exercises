package org.launchcode.java.exercises.class01;
import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle:");
        int side1 = input.nextInt();

        System.out.println("Enter the width of the rectangle:");
        int side2 = input.nextInt();
        input.close();

        int rectangleArea = side1 * side2;
        System.out.println(rectangleArea);
    }
}
