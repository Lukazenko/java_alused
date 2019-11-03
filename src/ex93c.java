public class ex93c {
    public static void main(String[] args) {
        Person2 pekka = new Person2("Pekka", new MyDate(15, 2, 1983));
        Person2 steve = new Person2("Steve");

        System.out.println( pekka );
        System.out.println( steve );
    }
}
