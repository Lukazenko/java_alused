import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ShoppingBasket {

    private List<Purchase> basket;
    private int price;


    ShoppingBasket(){
        this.basket = new ArrayList<Purchase>();
        this.price = 0;
    }

    public void add(String product, int price){

        Purchase purchase = new Purchase(product, 1, price);

        if(this.basket.contains(purchase)){
            purchase.increaseAmount();
        } else {
            this.basket.add(purchase);
        }

        this.price += price;


    }

    int price(){
        return this.price;
    }

    public void print(){
        Map<String, Integer> toPrint = new HashMap<String, Integer>();

        for(Purchase item : this.basket){
            String itemName = item.name();

            if(toPrint.containsKey(itemName)){
                toPrint.put(itemName, toPrint.get(itemName) + 1);
            } else {
                toPrint.put(itemName, 1);
            }
        }

        for(String key : toPrint.keySet()){
            System.out.println(key + ": " + toPrint.get(key));
        }
    }
}
