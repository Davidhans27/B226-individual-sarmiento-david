package loadregistration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class LoadRegistrationApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();

        String name = "";
        String mobileNumber = "";
        String network = "";
        String activePromo = "None";

        double balance = 0;
        boolean registered = false;
        LocalDate expirationDate = null;

        int choice = 0;

        do {

            System.out.println("\n================================");
            System.out.println("     LOAD REGISTRATION APP");
            System.out.println("================================");
            System.out.println("1. Register SIM");
            System.out.println("2. Buy Load");
            System.out.println("3. Register Promo");
            System.out.println("4. Check Account");
            System.out.println("5. Transaction History");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            if (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                input.nextLine();
                continue;
            }

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    if (registered) {
                        System.out.println("SIM is already registered.");
                        break;
                    }

                    System.out.print("Enter Name: ");
                    name = input.nextLine().trim();

                    while (name.isEmpty()) {
                        System.out.println("Name cannot be empty.");
                        System.out.print("Enter Name: ");
                        name = input.nextLine().trim();
                    }

                    while (true) {

                        System.out.print("Enter Mobile Number (11 digits): ");
                        mobileNumber = input.nextLine().trim();

                        if (mobileNumber.matches("\\d{11}")) {
                            break;
                        }

                        System.out.println(
                                "Invalid mobile number. Enter exactly 11 digits."
                        );
                    }

                    System.out.println("\nSelect Network:");
                    System.out.println("1. Smart");
                    System.out.println("2. TNT");
                    System.out.println("3. Globe");
                    System.out.println("4. TM");
                    System.out.println("5. DITO");
                    System.out.print("Enter Choice: ");

                    if (!input.hasNextInt()) {
                        System.out.println("Invalid network choice.");
                        input.nextLine();
                        break;
                    }

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

                    if (network.isEmpty()) {
                        break;
                    }

                    registered = true;
                    balance = 0;

                    history.add(
                            "SIM Registered - "
                            + mobileNumber
                            + " ("
                            + network
                            + ")"
                    );

                    System.out.println("\nSIM Registered Successfully!");
                    System.out.println("Name: " + name);
                    System.out.println("Mobile Number: " + mobileNumber);
                    System.out.println("Network: " + network);

                    break;

                case 2:

                    if (!registered) {
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

                    if (!input.hasNextInt()) {
                        System.out.println("Invalid choice.");
                        input.nextLine();
                        break;
                    }

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

                            if (!input.hasNextDouble()) {
                                System.out.println("Invalid amount.");
                                input.nextLine();
                                break;
                            }

                            amount = input.nextDouble();
                            break;

                        default:
                            System.out.println("Invalid Choice.");
                            break;
                    }

                    input.nextLine();

                    if (amount <= 0) {

                        if (loadChoice == 5) {
                            System.out.println(
                                    "Amount must be greater than zero."
                            );
                        }

                        break;
                    }

                    balance = balance + amount;

                    history.add(
                            "Buy Load - PHP "
                            + String.format("%.2f", amount)
                    );

                    System.out.println("Load Successful!");
                    System.out.printf(
                            "Current Balance: PHP %.2f%n",
                            balance
                    );

                    break;

                case 3:

                    if (!registered) {
                        System.out.println("Please register your SIM first.");
                        break;
                    }

                    String promoName = "";
                    double promoPrice = 0;
                    int validityDays = 0;

                    System.out.println(
                            "\n========== REGISTER PROMO =========="
                    );

                    if (network.equals("SMART")
                            || network.equals("TNT")) {

                        System.out.println(
                                "1. ALL DATA 99 - PHP 99 (7 Days)"
                        );
                        System.out.println(
                                "2. MAGIC DATA 199 - PHP 199 (30 Days)"
                        );
                        System.out.println(
                                "3. POWER ALL 149 - PHP 149 (15 Days)"
                        );
                        System.out.print("Choose Promo: ");

                        if (!input.hasNextInt()) {
                            System.out.println("Invalid promo choice.");
                            input.nextLine();
                            break;
                        }

                        int promoChoice = input.nextInt();
                        input.nextLine();

                        switch (promoChoice) {

                            case 1:
                                promoName = "ALL DATA 99";
                                promoPrice = 99;
                                validityDays = 7;
                                break;

                            case 2:
                                promoName = "MAGIC DATA 199";
                                promoPrice = 199;
                                validityDays = 30;
                                break;

                            case 3:
                                promoName = "POWER ALL 149";
                                promoPrice = 149;
                                validityDays = 15;
                                break;

                            default:
                                System.out.println("Invalid Promo.");
                                break;
                        }

                    } else if (network.equals("GLOBE")
                            || network.equals("TM")) {

                        System.out.println(
                                "1. GO50 - PHP 50 (3 Days)"
                        );
                        System.out.println(
                                "2. GO99 - PHP 99 (7 Days)"
                        );
                        System.out.println(
                                "3. GO149 - PHP 149 (15 Days)"
                        );
                        System.out.print("Choose Promo: ");

                        if (!input.hasNextInt()) {
                            System.out.println("Invalid promo choice.");
                            input.nextLine();
                            break;
                        }

                        int promoChoice = input.nextInt();
                        input.nextLine();

                        switch (promoChoice) {

                            case 1:
                                promoName = "GO50";
                                promoPrice = 50;
                                validityDays = 3;
                                break;

                            case 2:
                                promoName = "GO99";
                                promoPrice = 99;
                                validityDays = 7;
                                break;

                            case 3:
                                promoName = "GO149";
                                promoPrice = 149;
                                validityDays = 15;
                                break;

                            default:
                                System.out.println("Invalid Promo.");
                                break;
                        }

                    } else if (network.equals("DITO")) {

                        System.out.println(
                                "1. LEVEL-UP 99 - PHP 99 (30 Days)"
                        );
                        System.out.println(
                                "2. LEVEL-UP 199 - PHP 199 (60 Days)"
                        );
                        System.out.print("Choose Promo: ");

                        if (!input.hasNextInt()) {
                            System.out.println("Invalid promo choice.");
                            input.nextLine();
                            break;
                        }

                        int promoChoice = input.nextInt();
                        input.nextLine();

                        switch (promoChoice) {

                            case 1:
                                promoName = "LEVEL-UP 99";
                                promoPrice = 99;
                                validityDays = 30;
                                break;

                            case 2:
                                promoName = "LEVEL-UP 199";
                                promoPrice = 199;
                                validityDays = 60;
                                break;

                            default:
                                System.out.println("Invalid Promo.");
                                break;
                        }
                    }

                    if (promoPrice <= 0) {
                        break;
                    }

                    if (balance >= promoPrice) {

                        balance = balance - promoPrice;

                        activePromo = promoName;

                        expirationDate
                                = LocalDate.now().plusDays(validityDays);

                        history.add(
                                "Registered Promo - "
                                + promoName
                                + " | Expires: "
                                + expirationDate
                        );

                        System.out.println(
                                "\nPromo Registered Successfully!"
                        );
                        System.out.println("Promo: " + promoName);
                        System.out.println(
                                "Validity: "
                                + validityDays
                                + " Days"
                        );
                        System.out.println(
                                "Expiration Date: "
                                + expirationDate
                        );
                        System.out.printf(
                                "Remaining Balance: PHP %.2f%n",
                                balance
                        );

                    } else {

                        System.out.println("Insufficient Balance!");

                        System.out.printf(
                                "Current Balance: PHP %.2f%n",
                                balance
                        );
                    }

                    break;

                case 4:

                    if (!registered) {
                        System.out.println("Please register your SIM first.");
                        break;
                    }

                    if (expirationDate != null
                            && LocalDate.now().isAfter(expirationDate)) {

                        activePromo = "None";
                        expirationDate = null;
                    }

                    System.out.println(
                            "\n========== ACCOUNT DETAILS =========="
                    );
                    System.out.println("Name: " + name);
                    System.out.println(
                            "Mobile Number: " + mobileNumber
                    );
                    System.out.println("Network: " + network);

                    System.out.printf(
                            "Balance: PHP %.2f%n",
                            balance
                    );

                    System.out.println(
                            "Active Promo: " + activePromo
                    );

                    if (expirationDate != null) {

                        System.out.println(
                                "Expiration Date: "
                                + expirationDate
                        );
                        System.out.println("Promo Status: ACTIVE");

                    } else {

                        System.out.println(
                                "Promo Status: NO ACTIVE PROMO"
                        );
                    }

                    break;

                case 5:

                    System.out.println(
                            "\n========== TRANSACTION HISTORY =========="
                    );

                    if (history.isEmpty()) {

                        System.out.println("No transactions found.");

                    } else {

                        for (int i = 0; i < history.size(); i++) {

                            System.out.println(
                                    (i + 1)
                                    + ". "
                                    + history.get(i)
                            );
                        }
                    }

                    break;

                case 6:

                    System.out.println(
                            "\nThank you for using the system."
                    );
                    System.out.println("Program Ended.");

                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);

        input.close();
    }
}