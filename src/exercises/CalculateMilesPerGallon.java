package exercises;
import java.util.Scanner;

public class CalculateMilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the miles you have driven:");
        int miles = input.nextInt();
        System.out.println("Enter the gallons of gas consumed:");
        int gas = input.nextInt();
        input.close();

        System.out.println("Your gas mileage is " + miles/gas + " miles per gallon.");
    }
}
