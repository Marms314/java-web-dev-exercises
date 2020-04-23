package org.launchcode.java.exercises.class02;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] someInts = {1, 1, 2, 3, 5, 8};
        System.out.println("I will only print odd numbers.");

        for (int number : someInts) {
            if (number % 2 == 1) {
                System.out.println(number);
            } else {
                System.out.println("This number is not odd.");
            }
        }

        String suess = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a" +
                " house. I will not eat them with a mouse.";

        String[] splitByWord = suess.split(" ");
        System.out.println(Arrays.toString(splitByWord));

        String[] splitBySentence = suess.split("\\.");
        System.out.println(Arrays.toString(splitBySentence));
    }
}
