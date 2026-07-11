/*
 * Activity 9 - Research Phase
 * Name: Sarmiento
 * Topic: Java String Methods
 */

import java.util.Scanner;

public class ResearchPhase {

    public static void main(String[] args) {

        // =====================================================
        // 1. contains()
        // Description:
        // Checks if a string contains a specified sequence of characters.
        // Syntax:
        // string.contains("text");
        // =====================================================
        String text1 = "Hello World";
        System.out.println("contains(): " + text1.contains("World"));

        // =====================================================
        // 2. endsWith()
        // Description:
        // Checks if a string ends with the specified suffix.
        // Syntax:
        // string.endsWith("suffix");
        // =====================================================
        String text2 = "Java Programming";
        System.out.println("endsWith(): " + text2.endsWith("ming"));

        // =====================================================
        // 3. startsWith()
        // Description:
        // Checks if a string starts with the specified prefix.
        // Syntax:
        // string.startsWith("prefix");
        // =====================================================
        String text3 = "Java Programming";
        System.out.println("startsWith(): " + text3.startsWith("Java"));

        // =====================================================
        // 4. indexOf()
        // Description:
        // Returns the index of the first occurrence of a character or string.
        // Returns -1 if not found.
        // Syntax:
        // string.indexOf("text");
        // =====================================================
        String text4 = "Philippines";
        System.out.println("indexOf(): " + text4.indexOf("i"));

        // =====================================================
        // 5. isEmpty()
        // Description:
        // Checks whether a string is empty.
        // Syntax:
        // string.isEmpty();
        // =====================================================
        String text5 = "";
        System.out.println("isEmpty(): " + text5.isEmpty());

        // =====================================================
        // 6. trim()
        // Description:
        // Removes leading and trailing spaces from a string.
        // Syntax:
        // string.trim();
        // =====================================================
        String text6 = "   Java Programming   ";
        System.out.println("trim(): '" + text6.trim() + "'");

        // =====================================================
        // 7. replace()
        // Description:
        // Replaces all occurrences of a specified character or string.
        // Syntax:
        // string.replace(oldValue, newValue);
        // =====================================================
        String text7 = "Java";
        System.out.println("replace(): " + text7.replace('a', 'o'));

        // =====================================================
        // 8. toCharArray()
        // Description:
        // Converts a string into a character array.
        // Syntax:
        // string.toCharArray();
        // =====================================================
        String text8 = "Java";
        char[] letters = text8.toCharArray();

        System.out.print("toCharArray(): ");
        for (char c : letters) {
            System.out.print(c + " ");
        }
        System.out.println();

        // =====================================================
        // 9. nextLine().charAt()
        // Description:
        // Reads a line from the user and gets a character at a
        // specified index.
        // Syntax:
        // scanner.nextLine().charAt(index);
        // =====================================================
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        char firstLetter = input.nextLine().charAt(0);

        System.out.println("First Letter: " + firstLetter);

        // =====================================================
        // 10. valueOf()
        // Description:
        // Converts different data types into a String.
        // Syntax:
        // String.valueOf(value);
        // =====================================================
        int number = 100;
        String text10 = String.valueOf(number);

        System.out.println("valueOf(): " + text10);

        input.close();
    }
}