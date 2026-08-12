import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int num = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();

        BankAccount b = new BankAccount(num, name, balance);

        System.out.print("Enter deposit amount: ");
        double amount = sc.nextDouble();

        b.deposit(amount);

        System.out.println("\nUpdated Details:");
        b.displayDetails();
    }
}
