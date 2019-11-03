
public class ex93b {
    public static void main(String[] args) {
        Person2 pekka = new Person2("Pekka", 15, 2, 1983);
        Person2 martin = new Person2("Martin", 1, 3, 1983);

        System.out.println( martin.getName() + " is older than " +  pekka.getName() + ": "+ martin.olderThan(pekka) );
        System.out.println( pekka.getName() + " is older than " +  martin.getName() + ": "+ pekka.olderThan(martin) );
    }
}
