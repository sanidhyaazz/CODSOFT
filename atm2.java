import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double intBalance) {
        this.balance = intBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. \nCurrent balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. \nCurrent balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}

class ATM {
    private BankAccount account;
    private Scanner sc;

    public ATM(BankAccount account) {
        this.account = account;
        this.sc = new Scanner(System.in);
    }

    public void displayMenu() {
        while (true) {
            System.out.println("ATM Menu: \n1. Withdraw\n2. Deposit\n3. Check Balance\n4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    withdraw();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting. Thank you for using the ATM.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        account.withdraw(amount);
    }

    private void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        account.deposit(amount);
    }

    private void checkBalance() {
        System.out.println("Current balance: " + account.getBalance());
    }
}

public class atm2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.00); // Initial balance
        ATM atm = new ATM(account);
        atm.displayMenu();
    }
}