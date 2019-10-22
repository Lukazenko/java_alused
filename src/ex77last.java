public class ex77last {
    public static void main(String[] args) {
        LyyraCardlast cardPekka = new LyyraCardlast(20);
        LyyraCardlast cardBrian = new LyyraCardlast(30);

        cardPekka.payGourmet();
        cardBrian.payEconomical();

        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian:" + cardBrian);

        cardPekka.loadMoney(20);
        cardBrian.payGourmet();

        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian:" + cardBrian);

        cardPekka.payEconomical();
        cardPekka.payEconomical();
        cardBrian.loadMoney(50);

        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian:" + cardBrian);



    }
}
