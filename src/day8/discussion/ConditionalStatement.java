
package day8.discussion;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {   
        //create Scanner object to accept input
        Scanner input = new Scanner(System.in);
        
        //Predefined username and password
        String username = "admin";
        String password = "admin123";

        
        System.out.println("Enter username: ");  //ask user for username
        String loginUsername = input.nextLine(); //read user input
        System.out.println("Password: "); // ask user for user password
        String loginPassword = input.nextLine(); //user input password
        
        //check if both username and password the predefined values
        if (loginUsername.equals(username) && loginPassword.equals(password)){
        System.out.println("Login successfull! " + "Welcome " + username);
        }else {
        System.out.println("Login Failed! Invalid username or password!");
    }
        
        //close the scanner
        input.close();
    }
}
