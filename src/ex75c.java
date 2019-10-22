public class ex75c {
    public static void main(String[] args) {
        DecreasingCounterC counter = new DecreasingCounterC(100);

        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.decrease();
        counter.printValue();
    }
}
