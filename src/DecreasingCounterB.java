class DecreasingCounterB {
    private int value;   // object variable that remembers the value of the counter

    DecreasingCounterB(int valueAtStart) {
        this.value = valueAtStart;
    }

    void printValue() {
        System.out.println("value: " + this.value);
    }

    void decrease() {
        if(this.value > 0){
            this.value--;
        }


    }

    // and here the rest of the methods
}
