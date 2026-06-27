import java.util.Scanner;

public class Activity5_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = input.nextInt();

        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum += i;
            System.out.println("i = " + i + ", sum = " + sum);
        }

        System.out.println("Final Sum: " + sum);
    }
}