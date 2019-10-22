class DecreasingCounterD {
    private int value;
    private int valueInitial;

    DecreasingCounterD(int valueAtStart) {
        this.valueInitial = valueAtStart;
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

    void setInitial(){
        this.value = this.valueInitial;
    }
}
