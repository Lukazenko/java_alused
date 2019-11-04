public class Money {
    private final int euros;
    private final int cents;

    Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    private int euros(){
        return euros;
    }

    private int cents(){
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    Money plus(Money added){
        int eur = euros() + added.euros;
        int cent = cents() + added.cents;
        return new Money(eur, cent);

    }

    boolean less(Money compared){


        return euros() < compared.euros;
    }
}
