class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double balanceCheck() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        } else {
            System.out.println("Balance must be greater than 0");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw amount must be greater than 0");
        } else if (amount > balance) {
            System.out.println("Withdraw amount must be less than or equal to balance");
        }  else {
            balance = balance - amount;
        }
    }

}


class BankService {
    void withdraw(BankAccount account, double amount) {
        account.withdraw(amount);
    }

    void deposit(BankAccount account, double amount) {
        account.deposit(amount);
    }
}


public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);
        BankService service = new BankService();

        service.withdraw(account, 150);
        service.deposit(account, 150);
        service.withdraw(account, 250);
        System.out.println("Balance: " + account.balanceCheck());
    }
}