public class LyyraCarde {
    private double balance;
    private double originalbalance;

    LyyraCarde(double balanceAtStart) {
        this.balance = balanceAtStart;
        this.originalbalance = balanceAtStart;
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

    void loadMoney(double amount) {
        this.balance = this.balance + amount;
        if(this.balance > 150){
            this.balance = 150;
        } else if(this.balance < 0){
            this.balance = this.originalbalance;
        }

    }


}
