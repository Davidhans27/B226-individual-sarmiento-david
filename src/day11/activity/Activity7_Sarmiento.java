import java.util.Scanner;

public class Activity7_Sarmiento {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare a single-dimensional array of 5 integers
        int[] numbers = new int[5];

        int sum = 0;

        // Input 5 numbers from user
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();

            // Add each number to sum
            sum += numbers[i];
        }


        // Display entered numbers
        System.out.println("\nYou entered:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }


        // Compute average
        double average = (double) sum / numbers.length;


        // Display sum and average
        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + average);



        // Stretch Goal: Find highest and lowest number

        int highest = numbers[0];
        int lowest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > highest) {
                highest = numbers[i];
            }

            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }


        // Display highest and lowest number
        System.out.println("Highest number: " + highest);
        System.out.println("Lowest number: " + lowest);


        input.close();
    }
}