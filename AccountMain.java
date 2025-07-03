package Task_2;

class Account {
    double balance;

    
    Account() {
        balance = 0.0;
    }

    Account(double b) {
        balance = b;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

  
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

   
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class AccountMain {
    public static void main(String[] args) {
        
        Account acc1 = new Account();
        acc1.deposit(1000);
        acc1.withdraw(500);
        acc1.displayBalance();

        
        Account acc2 = new Account(2000);
        acc2.withdraw(300);
        acc2.displayBalance();
    }
}
