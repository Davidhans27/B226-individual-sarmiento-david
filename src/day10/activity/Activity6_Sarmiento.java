import java.util.Scanner;

// Main class of the program
public class Activity6_Sarmiento {

    public static void main(String[] args) {

        // Create Scanner object to accept user input
        Scanner input = new Scanner(System.in);


        // ============================
        // PART 1: User-selected table
        // ============================

        // Ask the user what multiplication table to display
        System.out.print("Enter multiplication table you want to display: ");

        // Store user input
        int num = input.nextInt();


        // Display the selected multiplication table
        System.out.println("\nMultiplication Table of " + num);


        // Loop from 1 to 10 to show multiples
        for (int i = 1; i <= 10; i++) {

            // Display multiplication equation
            System.out.println(
                num + " * " + i + " = " + (num * i)
            );
        }



        // ============================
        // PART 2: Nested For Loop
        // ============================

        System.out.println("\n\nNested For Loop Multiplication Tables:");


        // Call method from the second class
        NestedMultiplicationTable.displayTables();


        // Close Scanner
        input.close();
    }
}


// Second class for nested loops
class NestedMultiplicationTable {


    // Method that displays multiplication tables
    public static void displayTables() {


        // Outer loop controls the multiplication table number
        // Example: Table of 1, Table of 2, etc.
        for (int table = 1; table <= 2; table++) {


            // Display table title
            System.out.println("\nMultiplication Table of " + table);



            // Inner loop displays multiples from 1 to 10
            for (int i = 1; i <= 10; i++) {


                // Print multiplication equation
                System.out.println(
                    table + " * " + i + " = " + (table * i)
                );
            }
        }
    }
}