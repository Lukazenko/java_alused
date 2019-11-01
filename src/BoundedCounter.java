public class BoundedCounter {
    private int value;
    private int upperLimit;

    BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;


    }

    void next() {

        if(value < upperLimit){
            this.value++;
        } else {
            this.value = 0;
        }
    }

    public String toString() {
        return "" + this.value;

    }
}
