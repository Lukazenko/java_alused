public class ex78b {
    public static void main(String[] args) {
        BoundedCounterb counter = new BoundedCounterb(14);
        System.out.println("Value at start: " + counter );

        int i = 0;
        while ( i < 16){
            counter.next();
            System.out.println("value: " + counter );
            i++;
        }
    }
}
