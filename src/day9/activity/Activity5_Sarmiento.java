package day9.activity;

import java.util.Scanner;

public class Activity5_Sarmiento {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // Activity 5.1 - Summation of 1 to N
        System.out.println("=== Activity 5.1 Summation ===");

        System.out.print("Enter N: ");
        int n = input.nextInt();

        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum += i;
            System.out.println("i = " + i + ", sum = " + sum);
        }

        System.out.println("Final Sum: " + sum);



        // Activity 5.2 - Product of 1 to N
        System.out.println("\n=== Activity 5.2 Product ===");

        int product = 1;

        for(int i = 1; i <= n; i++) {
            product *= i;
            System.out.println("i = " + i + ", product = " + product);
        }

        System.out.println("Final Product: " + product);



        // Activity 5.3 - Arithmetic Sequence Sum Only
        System.out.println("\n=== Activity 5.3 Arithmetic Sequence ===");

        System.out.print("Enter Start Number: ");
        int startNumber = input.nextInt();

        System.out.print("Enter Common Difference: ");
        int difference = input.nextInt();

        System.out.print("Enter Number of Terms: ");
        int terms = input.nextInt();


        int current = startNumber;
        int sequenceSum = 0;

        for(int i = 1; i <= terms; i++) {

            sequenceSum += current;

            System.out.print(current);

            if(i < terms) {
                System.out.print(" + ");
            }

            current += difference;
        }

        System.out.println(" = " + sequenceSum);



        // Activity 5.4 - Arithmetic Sequence Sum and Product
        System.out.println("\n=== Activity 5.4 Sum and Product ===");

        current = startNumber;
        sequenceSum = 0;
        long sequenceProduct = 1;


        System.out.print("Sum: ");

        for(int i = 1; i <= terms; i++) {

            sequenceSum += current;
            sequenceProduct *= current;

            System.out.print(current);

            if(i < terms) {
                System.out.print(" + ");
            }

            current += difference;
        }

        System.out.println(" = " + sequenceSum);



        current = startNumber;

        System.out.print("Product: ");

        for(int i = 1; i <= terms; i++) {

            System.out.print(current);

            if(i < terms) {
                System.out.print(" * ");
            }

            current += difference;
        }

        System.out.println(" = " + sequenceProduct);


        input.close();
    }
}