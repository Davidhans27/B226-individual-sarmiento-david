/*
 * Activity 9 - Stretch Goal
 * Name: Sarmiento
 */

public class Activity9_Sarmiento {

    public static void main(String[] args) {

        // Declare the string
        String country = "Philippines";

        // Display the country
        System.out.println("Country: " + country);

        // ============================================
        // Display the first and last character
        // ============================================
        char firstCharacter = country.charAt(0);
        char lastCharacter = country.charAt(country.length() - 1);

        System.out.println("First Character: " + firstCharacter);
        System.out.println("Last Character: " + lastCharacter);

        // ============================================
        // Count how many times the character P/p appears
        // ============================================
        int pCount = 0;

        for (int i = 0; i < country.length(); i++) {

            char ch = country.charAt(i);

            if (ch == 'P' || ch == 'p') {
                pCount++;
            }
        }

        System.out.println("Number of P/p: " + pCount);

        // ============================================
        // Count the total number of vowels
        // (a, e, i, o, u)
        // ============================================
        int vowelCount = 0;

        for (int i = 0; i < country.length(); i++) {

            char ch = Character.toLowerCase(country.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Total Number of Vowels: " + vowelCount);
    }
}