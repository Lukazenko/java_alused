public class CashRegister {
    private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;      // the amount of economical lunches sold
    private int gourmetSold;         // the amount of gourmet lunches sold

    CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000.0;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    double payEconomical(double cashGiven) {
        // the price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        if(cashGiven >= 2.5){
            //    the price of lunch is added to register
            cashInRegister += 2.5;
            //    the amount of the sold lunches is incremented by one
            economicalSold += 1;
            //    the method returns cashGiven - lunch price
            return cashGiven - 2.5;
        } else {
            // if not enough money is given, all is returned and nothing else happens
            return cashGiven;
        }





    }

    public double payGourmet(double cashGiven) {
        // the price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        if(cashGiven >= 4){
            //    the price of lunch is added to the register
            cashInRegister += 4;
            //    the amount of the sold lunches is incremented by one
            gourmetSold += 1;
            //    the method returns cashGiven - lunch price
            return cashGiven - 4;

        } else {
            // if not enough money is given, all is returned and nothing else happens
            return cashGiven;

        }


    }

    public boolean payEconomical(LyyraCardex86 card) {
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        if(card.balance() >= 2.5){
            card.pay(2.5);
            //    the amount of sold lunches is incremented by one
            economicalSold += 1;
            //    the method returns true
            return true;
        } else {
            // if not, the method returns false
            return false;
        }



    }

    public boolean payGourmet(LyyraCardex86 card) {
        // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        if(card.balance() >= 4.00){
            card.pay(4);
            //    the amount of sold lunches is incremented by one
            gourmetSold += 1;
            //    the method returns true
            return true;

        } else {
            // if not, the method returns false
            return false;
        }


    }

    public String toString() {
        return "money in register "+cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
    }
}
