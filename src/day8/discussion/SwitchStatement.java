
package day8.discussion;

import java.util.Scanner;

public class SwitchStatement {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== Game Main Menu ===");
        System.out.println("1. Start Game");
        System.out.println("2. Load Game");
        System.out.println("3. Settings");
        System.out.println("4. Exit");

        System.out.print("Enter your choice (1-4): ");
        int num = input.nextInt();
        
        
        switch (num) {
            case 1:
                System.out.println("You selected Option 1: Start Game");
                break;
            case 2:
                System.out.println("You selected Option 2: Load Game");
                break;
            case 3:
                System.out.println("You selected Option 3: Settings");
                break;
            case 4:
                System.out.println("You selected Option 4: Exit");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid choice");
        }
     }
}
