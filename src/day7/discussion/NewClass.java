/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day7.discussion;

import java.util.Scanner;

public class NewClass {
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
