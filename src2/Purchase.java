class Purchase {
    private String product;
    private int amount;
    private int unitPrice;

    Purchase(String product, int amount, int unitPrice) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    int price() {
        return this.unitPrice * this.amount;
    }

    public String name(){
        return this.product;
    }

    void increaseAmount() {
        this.amount += 1;

    }

    public String toString() {
        return this.product + ": " + this.amount;
    }
}
