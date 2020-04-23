package org.launchcode.java.exercises.class02;
import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListPractice {
    public static int sumEvenNumbers(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (int number : arrayList) {
            if (number % 2 == 0) {
               sum  += number;
            }
        }
        return sum;
    }

    public static void printWordsByLength(ArrayList<String> arrayList) {
        Scanner input = new Scanner(System.in);
        System.out.println("What word length should be printed?");
        int wordLength = input.nextInt();

        for (String word : arrayList) {
            if (word.length() == wordLength) {
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> someInts = new ArrayList<>();
        someInts.add(1);
        someInts.add(2);
        someInts.add(3);
        someInts.add(4);
        someInts.add(5);
        someInts.add(6);
        someInts.add(7);
        someInts.add(8);
        someInts.add(9);
        someInts.add(10);

        ArrayList<String> someWords = new ArrayList<>();
        someWords.add("1");
        someWords.add("12");
        someWords.add("123");
        someWords.add("1234");
        someWords.add("12345");
        someWords.add("22345");
        someWords.add("32345");
        someWords.add("2234");
        someWords.add("223");
        someWords.add("22");

        System.out.println(sumEvenNumbers(someInts));
        printWordsByLength(someWords);
    }
}
