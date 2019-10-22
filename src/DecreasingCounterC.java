class DecreasingCounterC {
    private int value;   // object variable that remembers the value of the counter

    DecreasingCounterC(int valueAtStart) {
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

    void reset(){
        this.value = 0;

    }
}
