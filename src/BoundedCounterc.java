public class BoundedCounterc {
    private int value;
    private int upperLimit;

    BoundedCounterc(int upperLimit) {
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
        if(value < 10){
            return "0" + this.value;
        } else {
            return "" + this.value;
        }


    }
    int getValue() {
        return value;
    }

}
