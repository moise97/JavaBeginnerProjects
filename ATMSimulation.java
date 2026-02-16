import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double balance = 1000.00;
        boolean isRunning = true;

        while (isRunning) {
            // PLACEMENT: Updated the Menu for "Breathing Room"
            System.out.println("\n--- ATM MAIN MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit Machine");
            System.out.print("Please enter your choice: ");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    // PLACEMENT: Replaced println with printf (The Label Maker)
                    System.out.printf("Your current balance is: $%.2f%n", balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = input.nextDouble();

                    // PLACEMENT: Added "The Vending Sensor" Check
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit Successful!");
                    } else {
                        System.out.println("Invalid amount. You can't deposit air!");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = input.nextDouble();

                    // PLACEMENT: Added "The Security Guard" Logic
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Transaction Successful. Please take your cash.");
                    } else {
                        System.out.println("Insufficient Funds! Transaction Denied.");
                    }
                    break;

                case 4:
                    isRunning = false;

                    System.out.println("Thank you for your business. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid Selection. Try again.");
            }
        }

        input.close();
    }
}
