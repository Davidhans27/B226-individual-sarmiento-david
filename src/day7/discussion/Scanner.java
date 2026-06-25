
package day7.discussion;

import java.util.Scanner;
        
public class Scanner {
    public static void main(String[] args) {
        
        //create object scanner
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter name: ");
        String name = input.nextLine(); // stirng input\
        
        System.out.println("Enter age: ");
        int age = input.nextInt();
        
        System.out.println("Enter salary: ");
        double salary = input.nextDouble();
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
