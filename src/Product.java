class Product {
    private String name;
    private double price;
    private int amount;

    Product(String nameAtStart, double priceAtStart, int amountAtStart){
        this.name = nameAtStart;
        this.price = priceAtStart;
        this.amount = amountAtStart;
    }
    void printProduct(){
        System.out.print(this.name + ", price " + this.price + ", amount " + this.amount);
    }

}
