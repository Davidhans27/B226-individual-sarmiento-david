public class Activity3_Sarmiento {

    public static void main(String[] args) {

        // #2 Logical AND Operator (&&)
        int age = 20;
        boolean hasValidID = true;

        if (age >= 18 && hasValidID) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Access Denied");
        }


        // #3 Logical OR Operator (||)
        boolean isWeekend = true;
        boolean isHoliday = false;

        if (isWeekend || isHoliday) {
            System.out.println("No Classes Today");
        } else {
            System.out.println("Classes Today");
        }


        // #4 Ternary Operator (? :)
        int score = 85;

        String result = (score >= 75) ? "Passed" : "Failed";

        System.out.println(result);


        // #5 Ternary Operator (? :) Larger Number
        int num1 = 10;
        int num2 = 25;

        int largerNumber = (num1 > num2) ? num1 : num2;

        System.out.println("The larger number is: " + largerNumber);
    }
}