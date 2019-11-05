
public class ex93a {
    public static void main(String[] args) {
        Person2 pekka = new Person2("Pekka", 15, 2, 1993);
        Person2 steve = new Person2("Thomas", 1, 3, 1955);

        System.out.println( steve.getName() + " age " + steve.age() + " years");
        System.out.println( pekka.getName() + " age " + pekka.age() + " years");
    }
}
