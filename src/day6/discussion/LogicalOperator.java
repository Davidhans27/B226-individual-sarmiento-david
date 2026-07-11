
package day6.discussion;
public class LogicalOperator {
    public static void main(String[] args) {

        int age = 20;
        boolean hasValidID = true;

        // Logical AND (&&)
        if (age >= 18 && hasValidID) {
            System.out.println("You are allowed to enter.");
        }

        // Logical OR (||)
        boolean isStudent = false;
        boolean isSeniorCitizen = true;

        if (isStudent || isSeniorCitizen) {
            System.out.println("You are eligible for a discount.");
        }

        // Logical NOT (!)
        boolean isRaining = false;

        if (!isRaining) {
            System.out.println("You can go outside.");
        }
    }
}

