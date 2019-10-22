public class ex75d {
    public static void main(String[] args) {
        DecreasingCounterD counter = new DecreasingCounterD(100);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.setInitial();
        counter.printValue();
    }
}
