public class ex77b {
    public static void main(String[] args) {
        LyyraCardb card = new LyyraCardb(50);
        System.out.println(card);

        card.payEconomical();
        System.out.println(card);

        card.payGourmet();
        card.payEconomical();
        System.out.println(card);
    }
}
