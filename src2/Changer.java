import java.util.ArrayList;

class Changer {
    ArrayList<Change> changes;

    Changer(){
        this.changes = new ArrayList<Change>();
    }

    void addChange(Change change){
        changes.add(change);
    }

    String change(String characterString){
        for(Change muutus : changes){
            characterString = muutus.change(characterString);
        }

        return characterString;
    }
}
