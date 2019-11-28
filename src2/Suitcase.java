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

    void printThings(){
        for(Thing item : things){
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }

    int totalWeight(){
        return this.weight_now;
    }

    public String toString(){
        String things = "";

        if(this.things.size() == 0){
            things += "empty ";
        } else if(this.things.size() == 1){
            things += this.things.size() + " thing ";
        } else {
            things += this.things.size() + " things ";
        }

        return things + "(" + this.weight_now + " kg)";
    }
}
