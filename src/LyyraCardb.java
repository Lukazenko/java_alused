public class LyyraCardb {
    private double balance;

    LyyraCardb(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        return "The card has " + this.balance + " euros";
    }
    void payEconomical() {
        this.balance = this.balance - 2.50;
    }

    void payGourmet() {
        this.balance = this.balance - 4.00;
    }
}
