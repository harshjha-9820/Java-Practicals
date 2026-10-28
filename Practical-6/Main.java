package bank;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

package bank;

public class BankAccount {
    private static int totalAccounts = 0;

    private final int accountNumber;
    private String name;
    private double balance;

    public BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        totalAccounts++;
    }

    // Static method
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Deposit amount must be positive."
            );
        }

        balance += amount;
        System.out.println("Amount deposited successfully.");
    }

    // Withdraw method
    public void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Withdrawal amount must be positive."
            );
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance!"
            );
        }

        balance -= amount;
        System.out.println("Amount withdrawn successfully.");
    }

    // Final method
    public final void displayDetails() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: Rs. " + balance);
    }
}

import java.util.Scanner;
import java.util.InputMismatchException;
import bank.BankAccount;
import bank.InsufficientBalanceException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            BankAccount account =
                new BankAccount(101, "Harsh Jha", 5000.0);

            System.out.println("=== Bank Account Management ===");

            account.displayDetails();

            System.out.print("\nEnter deposit amount: ");
            double depositAmount = sc.nextDouble();
            account.deposit(depositAmount);

            System.out.print("Enter withdrawal amount: ");
            double withdrawalAmount = sc.nextDouble();
            account.withdraw(withdrawalAmount);

            account.displayDetails();

            System.out.println(
                "\nTotal Accounts: " +
                BankAccount.getTotalAccounts()
            );

        } catch (InsufficientBalanceException e) {
            System.out.println("Bank Error: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Amount: " + e.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number.");

        } finally {
            sc.close();
            System.out.println("Program execution completed.");
        }
    }
}
