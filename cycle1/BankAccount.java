import java.util.Scanner;

class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;

    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }


    void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited: " + amount);
    }


    void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

   
    void displayAccountInfo() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Holder: " + this.accountHolder);
        System.out.println("Balance: " + this.balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc= new BankAccount("123456", "Alice", 2000.0);
        acc.displayAccountInfo();
        
        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        acc.deposit(depositAmount);
        
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        acc.withdraw(withdrawAmount);
        
        acc.displayAccountInfo();
        sc.close();
    }
}
