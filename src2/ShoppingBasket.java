import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ShoppingBasket {


    List<Purchase> basket;
    private int price;
    ShoppingBasket(){
        this.basket = new ArrayList<Purchase>();
        this.price = 0;
    }

    public void add(String product, int price){
        this.basket.add(new Purchase(product, 1, price));
        this.price += price;
    }

    int price(){
        return this.price;
    }
}
