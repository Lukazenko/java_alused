import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Dictionary {
    HashMap<String, String> dict;

    Dictionary(){
        this.dict = new HashMap<String, String>();
    }

    String translate(String word){
        return dict.get(word);
    }

    public void add(String word, String translation){
        dict.put(word, translation);
    }

    int amountOfWords(){
        return dict.size();
    }

    ArrayList<String> translationList(){
        ArrayList<String> list = new ArrayList<String>();

        for (Map.Entry<String, String> entry : dict.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        return list;

    }
}
