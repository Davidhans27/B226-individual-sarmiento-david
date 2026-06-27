import java.util.Scanner;

public class Activity5_3_Sarmiento{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start Number: ");
        int startNumber = input.nextInt();

        System.out.print("Enter Common Difference: ");
        int commonDifference = input.nextInt();

        System.out.print("Enter Number of Terms: ");
        int n = input.nextInt();

        int current = startNumber;
        int sum = 0;

        for(int i = 1; i <= n; i++) {

            sum += current;

            System.out.print(current);

            if(i < n) {
                System.out.print(" + ");
            }

            current += commonDifference;
        }

        System.out.println(" = " + sum);
    }
}