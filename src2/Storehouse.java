import java.util.HashMap;
import java.util.Map;

public class Storehouse {

    private Map<String, Integer> storagePrice;
    private Map<String, Integer> storageStock;

    Storehouse(){
        this.storagePrice = new HashMap<String, Integer>();
        this.storageStock = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock){
        storagePrice.put(product, price);
        storageStock.put(product, stock);
    }

    public int price(String product){

        for(String key: storagePrice.keySet()) {
            if(key.equals(product)){
                return storagePrice.get(key);
            }
        }
        return -99;
    }
}
