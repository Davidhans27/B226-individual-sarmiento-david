package day10.activity;

import java.util.Scanner;

public class Activity8_Sarmiento {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Display program title
        System.out.println("==========================================");
        System.out.println("          Average Calculator");
        System.out.println("==========================================");

        // Ask for number of students
        System.out.print("Enter number of students: ");
        int students = input.nextInt();

        // Ask for number of subjects
        System.out.print("Enter number of subjects: ");
        int subjects = input.nextInt();
        input.nextLine(); // Consume newline

        // Arrays
        String[] subjectNames = new String[subjects];
        String[] studentNames = new String[students];
        double[][] grades = new double[students][subjects];
        double[] average = new double[students];

        // Input subject names
        System.out.println("\nEnter subject names:");
        for (int i = 0; i < subjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjectNames[i] = input.nextLine();
        }

        // Input student names and grades
        for (int i = 0; i < students; i++) {

            System.out.println("\nName of Student " + (i + 1) + ":");
            studentNames[i] = input.nextLine();

            double total = 0;

            System.out.println("Enter grades for each subject:");

            for (int j = 0; j < subjects; j++) {
                System.out.print(subjectNames[j] + ": ");
                grades[i][j] = input.nextDouble();
                total += grades[i][j];
            }

            // Compute average
            average[i] = total / subjects;

            input.nextLine(); // Consume newline
        }

        // Display report
        System.out.println("\n==========================================");
        System.out.println("              Grades Report");
        System.out.println("==========================================");

        // Table Header
        System.out.printf("%-15s", "Student");

        for (int i = 0; i < subjects; i++) {
            System.out.printf("%-12s", subjectNames[i]);
        }

        System.out.printf("%-10s%n", "Average");

        System.out.println("-------------------------------------------------------------");

        // Display student grades and averages
        for (int i = 0; i < students; i++) {

            System.out.printf("%-15s", studentNames[i]);

            for (int j = 0; j < subjects; j++) {
                System.out.printf("%-12.2f", grades[i][j]);
            }

            System.out.printf("%-10.2f%n", average[i]);
        }

        System.out.println("==========================================");

        // Close Scanner
        input.close();
    }
}