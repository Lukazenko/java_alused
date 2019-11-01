public class ex86d {
    public static void main(String[] args) {
        CashRegister unicafeExactum = new CashRegister();
        System.out.println( unicafeExactum );

        LyyraCardex86 cardOfJim = new LyyraCardex86(2);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        unicafeExactum.loadMoneyToCard(cardOfJim, 100);

        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        System.out.println( unicafeExactum );
    }
}
