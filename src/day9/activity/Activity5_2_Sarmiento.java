
import java.util.Scanner;

public class Activity5_2_Sarmiento {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = input.nextInt();

        int product = 1;

        for(int i = 1; i <= n; i++) {
            product *= i;
            System.out.println("i = " + i + ", product = " + product);
        }

        System.out.println("Final Product: " + product);
    }
}