public class ex75b {
    public static void main(String[] args) {
        DecreasingCounterB counter = new DecreasingCounterB(2);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();
    }
}
