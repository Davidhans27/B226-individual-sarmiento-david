package day8.discussion;

import java.util.Scanner;

public class AgeClassificationNested {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter age: ");
        int age = input.nextInt();

        if (age >= 0 && age <= 12) { // Child
            
            System.out.println("You are a child");

            if (age >= 0 && age <= 5) {
                System.out.println("Specifically: Toddler");
            } else if (age >= 6 && age <= 12) {
                System.out.println("Specifically: Pre-Teen");
            }

        } else if (age >= 13 && age <= 19) { // Teenager
            
            System.out.println("You are a teenager");

            if (age >= 13 && age <= 15) {
                System.out.println("Specifically: Early Teen");
            } else if (age >= 16 && age <= 19) {
                System.out.println("Specifically: Late Teen");
            }

        } else if (age >= 20 && age <= 59) { // Adult
            
            System.out.println("You are an adult");

            if (age >= 20 && age <= 35) {
                System.out.println("Specifically: Young Adult");
            } else if (age >= 36 && age <= 59) {
                System.out.println("Specifically: Middle-Aged");
            }

        } else if (age >= 60 && age <= 120) { // Senior Citizen
            
            System.out.println("You are a senior citizen");

            if (age >= 60 && age <= 75) {
                System.out.println("Specifically: Young Senior");
            } else if (age >= 76 && age <= 120) {
                System.out.println("Specifically: Elderly");
            }

        } else {
            System.out.println("Invalid age entered.");
        }

        input.close();
    }
}