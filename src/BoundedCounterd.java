public class BoundedCounterd {
    private int value;
    private int upperLimit;

    BoundedCounterd(int upperLimit) {
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

    int setValue(int param){
        if(value > 0 || value < upperLimit){
            this.value = param;
        }
        return value;
    }
}
