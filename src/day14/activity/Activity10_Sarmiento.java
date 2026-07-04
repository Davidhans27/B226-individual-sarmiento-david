/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day14.activity;
/*
=========================================================
                ACTIVITY 10 - MATH CLASS
                Name: Sarmiento
=========================================================

Goal:
This program demonstrates the different methods of the
Java Math class. It shows how each method works by using
simple examples and displaying the results.

Methods Included:
1. Math.abs()
2. Math.max()
3. Math.min()
4. Math.pow()
5. Math.sqrt()
6. Math.round()
7. Math.ceil()
8. Math.floor()
9. Math.random()
10. Math.log()
11. Math.log10()
12. Math.exp()
13. Math.sin()
14. Math.cos()
15. Math.tan()
*/

public class Activity10_Sarmiento {

    public static void main(String[] args) {

        // Sample values
        int a = -15;
        int b = 25;
        double decimal = 8.6;

        // =====================================================
        // 1. Math.abs()
        // Returns the absolute (positive) value of a number.
        // =====================================================
        System.out.println("1. Math.abs()");
        System.out.println("Original Value: " + a);
        System.out.println("Absolute Value: " + Math.abs(a));
        System.out.println();

        // =====================================================
        // 2. Math.max()
        // Returns the larger of two values.
        // =====================================================
        System.out.println("2. Math.max()");
        System.out.println("Maximum Value: " + Math.max(a, b));
        System.out.println();

        // =====================================================
        // 3. Math.min()
        // Returns the smaller of two values.
        // =====================================================
        System.out.println("3. Math.min()");
        System.out.println("Minimum Value: " + Math.min(a, b));
        System.out.println();

        // =====================================================
        // 4. Math.pow()
        // Raises a number to a given power.
        // =====================================================
        System.out.println("4. Math.pow()");
        System.out.println("2 raised to the power of 3 = " + Math.pow(2, 3));
        System.out.println();

        // =====================================================
        // 5. Math.sqrt()
        // Returns the square root of a number.
        // =====================================================
        System.out.println("5. Math.sqrt()");
        System.out.println("Square Root of 81 = " + Math.sqrt(81));
        System.out.println();

        // =====================================================
        // 6. Math.round()
        // Rounds a decimal to the nearest whole number.
        // =====================================================
        System.out.println("6. Math.round()");
        System.out.println("Rounded Value = " + Math.round(decimal));
        System.out.println();

        // =====================================================
        // 7. Math.ceil()
        // Rounds a decimal up to the nearest whole number.
        // =====================================================
        System.out.println("7. Math.ceil()");
        System.out.println("Ceiling Value = " + Math.ceil(8.2));
        System.out.println();

        // =====================================================
        // 8. Math.floor()
        // Rounds a decimal down to the nearest whole number.
        // =====================================================
        System.out.println("8. Math.floor()");
        System.out.println("Floor Value = " + Math.floor(8.9));
        System.out.println();

        // =====================================================
        // 9. Math.random()
        // Returns a random number from 0.0 to less than 1.0.
        // =====================================================
        System.out.println("9. Math.random()");
        System.out.println("Random Number = " + Math.random());
        System.out.println();

        // =====================================================
        // 10. Math.log()
        // Returns the natural logarithm (base e).
        // =====================================================
        System.out.println("10. Math.log()");
        System.out.println("Natural Log of 10 = " + Math.log(10));
        System.out.println();

        // =====================================================
        // 11. Math.log10()
        // Returns the logarithm base 10.
        // =====================================================
        System.out.println("11. Math.log10()");
        System.out.println("Log Base 10 of 100 = " + Math.log10(100));
        System.out.println();

        // =====================================================
        // 12. Math.exp()
        // Returns e raised to the specified power.
        // =====================================================
        System.out.println("12. Math.exp()");
        System.out.println("e^2 = " + Math.exp(2));
        System.out.println();

        // =====================================================
        // 13. Math.sin()
        // Returns the sine of an angle in radians.
        // =====================================================
        System.out.println("13. Math.sin()");
        System.out.println("sin(30°) = " + Math.sin(Math.toRadians(30)));
        System.out.println();

        // =====================================================
        // 14. Math.cos()
        // Returns the cosine of an angle in radians.
        // =====================================================
        System.out.println("14. Math.cos()");
        System.out.println("cos(60°) = " + Math.cos(Math.toRadians(60)));
        System.out.println();

        // =====================================================
        // 15. Math.tan()
        // Returns the tangent of an angle in radians.
        // =====================================================
        System.out.println("15. Math.tan()");
        System.out.println("tan(45°) = " + Math.tan(Math.toRadians(45)));
        System.out.println();
    }

}
