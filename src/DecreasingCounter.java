class DecreasingCounter {
    private int value;   // object variable that remembers the value of the counter

    DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
    }

    void printValue() {
        System.out.println("value: " + this.value);
    }

    void decrease() {
        this.value--;

    }

    // and here the rest of the methods
}
