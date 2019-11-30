import java.util.ArrayList;

public class Box implements ToBeStored {

    private double maxWeight;
    private final ArrayList<ToBeStored> boxes;

    Box(double maxWeight){
        this.boxes = new ArrayList<ToBeStored>();
        this.maxWeight = maxWeight;
    }

    void add(ToBeStored stuff){
        double boxWeight = stuff.weight();

        if(boxWeight + this.weight() <= this.maxWeight){
            this.boxes.add(stuff);
        }

    }

    @Override
    public double weight() {
        double weight = 0;
        // it calculates the total weight of the things which had been stored
        for(ToBeStored store : this.boxes){
            weight += store.weight();
        }
        return weight;
    }

    @Override
    public String toString(){
        int count = this.boxes.size();
        double weight = this.weight();

        return "Box: " + count + " things, " + " total weight " + weight + " kg";
    }
}
