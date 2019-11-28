import java.util.HashMap;

class PromissoryNote {
    HashMap<String, Double> notes;

    PromissoryNote(){
        this.notes = new HashMap<String, Double>();
    }

    void setLoan(String toWhom, double value){
        notes.put(toWhom, value);
    }

    double howMuchIsTheDebt(String whose){
        if(notes.get(whose) == null){
            return 0;
        }
        return notes.get(whose);

    }
}
