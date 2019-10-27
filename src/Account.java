/*
 * Do not touch this!
 */

public class Account {

    private double balance;
    private String owner;

    Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdrawal(double amount) {
        balance -= amount;
    }

    double balance() {
        return balance;
    }

    @Override
    public String toString() {
        return owner + " balance: " + balance;
    }
}
