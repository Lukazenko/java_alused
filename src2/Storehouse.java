import java.util.HashMap;
import java.util.Map;

class Storehouse {

    private Map<String, Integer> storagePrice;
    private Map<String, Integer> storageStock;

    Storehouse(){
        this.storagePrice = new HashMap<String, Integer>();
        this.storageStock = new HashMap<String, Integer>();
    }

    void addProduct(String product, int price, int stock){
        storagePrice.put(product, price);
        storageStock.put(product, stock);
    }

    int price(String product){

        for(String key: storagePrice.keySet()) {
            if(key.equals(product)){
                return storagePrice.get(key);
            }
        }
        return -99;
    }

    int stock(String product){
        for(String key: storageStock.keySet()) {
            if(key.equals(product)){
                return storageStock.get(key);
            }
        }
        return 0;
    }

    boolean take(String product){
        if(storageStock.containsKey(product) && storageStock.get(product) > 0){
            storageStock.put(product, storageStock.get(product) - 1);
            return true;
        } else {
            return false;
        }
    }
}
