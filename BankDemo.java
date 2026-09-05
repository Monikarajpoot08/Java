import java.util.Scanner;

interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
    void displayBalance();
}

class SavingAccount implements Bank {
    int accountNumber;
    double balance;

    // Constructor to initialize account number and balance
    SavingAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount!");
            return;
        }
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    // Withdraw method with insufficient balance check
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        }
    }

    // Display balance method
    public void displayBalance() {
        System.out.println("\n----- Account Details -----");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        double initialBalance = sc.nextDouble();

        // Creating SavingAccount object
        SavingAccount acc = new SavingAccount(accNo, initialBalance);

        acc.displayBalance();

        System.out.print("\nEnter amount to Deposit: ");
        double depositAmt = sc.nextDouble();
        acc.deposit(depositAmt);

        acc.displayBalance();

        System.out.print("\nEnter amount to Withdraw: ");
        double withdrawAmt = sc.nextDouble();
        acc.withdraw(withdrawAmt);

        acc.displayBalance();

        sc.close();
    }
}