package loadregistration;

import java.util.ArrayList;
import java.util.Scanner;

public class LoadRegistrationApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();

        String name = "";
        String mobileNumber = "";
        String network = "";

        double balance = 0;
        boolean registered = false;

        int choice;

        do {

            System.out.println("\n================================");
            System.out.println("     LOAD REGISTRATION APP");
            System.out.println("================================");
            System.out.println("1. Register SIM");
            System.out.println("2. Buy Load");
            System.out.println("3. Register Promo");
            System.out.println("4. Check Balance");
            System.out.println("5. Transaction History");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    if (registered == true) {
                        System.out.println("SIM is already registered.");
                        break;
                    }

                    System.out.print("Enter Name: ");
                    name = input.nextLine();

                    System.out.print("Enter Mobile Number: ");
                    mobileNumber = input.nextLine();

                    System.out.println("\nSelect Network:");
                    System.out.println("1. Smart");
                    System.out.println("2. TNT");
                    System.out.println("3. Globe");
                    System.out.println("4. TM");
                    System.out.println("5. DITO");
                    System.out.print("Enter Choice: ");

                    int networkChoice = input.nextInt();
                    input.nextLine();

                    switch (networkChoice) {

                        case 1:
                            network = "SMART";
                            break;

                        case 2:
                            network = "TNT";
                            break;

                        case 3:
                            network = "GLOBE";
                            break;

                        case 4:
                            network = "TM";
                            break;

                        case 5:
                            network = "DITO";
                            break;

                        default:
                            System.out.println("Invalid Network.");
                            break;
                    }

                    if (network.equals("")) {
                        break;
                    }

                    registered = true;
                    history.add("SIM Registered - " + mobileNumber);

                    System.out.println("\nSIM Registered Successfully!");
                    System.out.println("Name: " + name);
                    System.out.println("Mobile Number: " + mobileNumber);
                    System.out.println("Network: " + network);

                    break;

                case 2:

                    if (registered == false) {
                        System.out.println("Please register your SIM first.");
                        break;
                    }

                    System.out.println("\n========== BUY LOAD ==========");
                    System.out.println("1. PHP 20");
                    System.out.println("2. PHP 50");
                    System.out.println("3. PHP 100");
                    System.out.println("4. PHP 300");
                    System.out.println("5. Custom Amount");
                    System.out.print("Enter Choice: ");

                    int loadChoice = input.nextInt();
                    double amount = 0;

                    switch (loadChoice) {

                        case 1:
                            amount = 20;
                            break;

                        case 2:
                            amount = 50;
                            break;

                        case 3:
                            amount = 100;
                            break;

                        case 4:
                            amount = 300;
                            break;

                        case 5:
                            System.out.print("Enter Amount: PHP ");
                            amount = input.nextDouble();
                            break;

                        default:
                            System.out.println("Invalid Choice.");
                            break;
                    }

                    if (amount > 0) {

                        balance = balance + amount;

                        history.add("Buy Load - PHP " + amount);

                        System.out.println("Load Successful!");
                        System.out.println("Current Balance: PHP " + balance);
                    }

                    break;

                case 3:

                    if (registered == false) {
                        System.out.println("Please register your SIM first.");
                        break;
                    }

                    String promoName = "";
                    double promoPrice = 0;

                    System.out.println("\n========== REGISTER PROMO ==========");

                    if (network.equals("SMART") || network.equals("TNT")) {

                        System.out.println("1. ALL DATA 99 - PHP 99");
                        System.out.println("2. MAGIC DATA 199 - PHP 199");
                        System.out.println("3. POWER ALL 149 - PHP 149");
                        System.out.print("Choose Promo: ");

                        int promoChoice = input.nextInt();

                        switch (promoChoice) {

                            case 1:
                                promoName = "ALL DATA 99";
                                promoPrice = 99;
                                break;

                            case 2:
                                promoName = "MAGIC DATA 199";
                                promoPrice = 199;
                                break;

                            case 3:
                                promoName = "POWER ALL 149";
                                promoPrice = 149;
                                break;

                            default:
                                System.out.println("Invalid Promo.");
                                break;
                        }

                    } else if (network.equals("GLOBE") || network.equals("TM")) {

                        System.out.println("1. GO50 - PHP 50");
                        System.out.println("2. GO99 - PHP 99");
                        System.out.println("3. GO149 - PHP 149");
                        System.out.print("Choose Promo: ");

                        int promoChoice = input.nextInt();

                        switch (promoChoice) {

                            case 1:
                                promoName = "GO50";
                                promoPrice = 50;
                                break;

                            case 2:
                                promoName = "GO99";
                                promoPrice = 99;
                                break;

                            case 3:
                                promoName = "GO149";
                                promoPrice = 149;
                                break;

                            default:
                                System.out.println("Invalid Promo.");
                                break;
                        }

                    } else if (network.equals("DITO")) {

                        System.out.println("1. LEVEL-UP 99 - PHP 99");
                        System.out.println("2. LEVEL-UP 199 - PHP 199");
                        System.out.print("Choose Promo: ");

                        int promoChoice = input.nextInt();

                        switch (promoChoice) {

                            case 1:
                                promoName = "LEVEL-UP 99";
                                promoPrice = 99;
                                break;

                            case 2:
                                promoName = "LEVEL-UP 199";
                                promoPrice = 199;
                                break;

                            default:
                                System.out.println("Invalid Promo.");
                                break;
                        }
                    }

                    if (promoPrice > 0) {

                        if (balance >= promoPrice) {

                            balance = balance - promoPrice;

                            history.add("Registered Promo - " + promoName);

                            System.out.println("\nPromo Registered Successfully!");
                            System.out.println("Promo: " + promoName);
                            System.out.println("Remaining Balance: PHP " + balance);

                        } else {

                            System.out.println("Insufficient Balance!");
                            System.out.println("Current Balance: PHP " + balance);
                        }
                    }

                    break;

                case 4:

                    if (registered == false) {
                        System.out.println("Please register your SIM first.");
                        break;
                    }

                    System.out.println("\n========== BALANCE ==========");
                    System.out.println("Name: " + name);
                    System.out.println("Mobile Number: " + mobileNumber);
                    System.out.println("Network: " + network);
                    System.out.println("Balance: PHP " + balance);

                    break;

                case 5:

                    System.out.println("\n========== TRANSACTION HISTORY ==========");

                    if (history.isEmpty()) {

                        System.out.println("No transactions found.");

                    } else {

                        for (int i = 0; i < history.size(); i++) {

                            System.out.println((i + 1) + ". " + history.get(i));
                        }
                    }

                    break;

                case 6:

                    System.out.println("\nThank you for using the system.");
                    System.out.println("Program Ended.");

                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);

        input.close();
    }
}