package day8.discussion;

import java.util.Scanner;

public class AgeClassification {
    public static void main(String[] args) {

        /*
        Age: 0 - 12  -> Child
        Age: 13 - 19 -> Teenager
        Age: 20 - 59 -> Adult
        Age: 60 - 120 -> Senior Citizen
        */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter age: ");
        int age = input.nextInt();

        if (age >= 0 && age <= 12) {
            System.out.println("You are a child");

        } else if (age >= 13 && age <= 19) {
            System.out.println("You are a teenager");

        } else if (age >= 20 && age <= 59) {
            System.out.println("You are an adult");

        } else if (age >= 60 && age <= 120) {
            System.out.println("You are a senior citizen");

        } else {
            System.out.println("Invalid age entered");
        }

        input.close();
    }
}