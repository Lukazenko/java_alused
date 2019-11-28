import java.util.HashMap;

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
}
