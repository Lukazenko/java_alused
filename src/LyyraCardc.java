public class LyyraCardc {
    private double balance;

    LyyraCardc(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        return "The card has " + this.balance + " euros";
    }
    void payEconomical() {
        if(this.balance - 2.50 > 0){
            this.balance = this.balance - 2.50;
        }

    }

    void payGourmet() {
        if(this.balance - 4.00 > 0){
            this.balance = this.balance - 4.00;
        }

    }
}
