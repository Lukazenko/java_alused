public class ex77d {
    public static void main(String[] args) {
        LyyraCardd card = new LyyraCardd(10);
        System.out.println(card);

        card.loadMoney(15);
        System.out.println(card);

        card.loadMoney(10);
        System.out.println(card);

        card.loadMoney(200);
        System.out.println(card);
    }
}
