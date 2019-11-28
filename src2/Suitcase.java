import java.util.ArrayList;

class Suitcase {

    private int maxWeight;
    private ArrayList<Thing> things;
    private int weight_now;

    Suitcase(int max){
        this.maxWeight = max;
        this.things = new ArrayList<Thing>();
        this.weight_now = 0;
    }

    void addThing(Thing thing){

        if((this.weight_now + thing.getWeight()) < this.maxWeight){
            things.add(thing);
            this.weight_now += thing.getWeight();
        }

    }

    public String toString(){
        return this.things.size() + " things " + "(" + this.weight_now + " kg)";
    }
}
