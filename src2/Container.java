import java.util.ArrayList;

class Container {
    private int maxWeight;
    ArrayList<Suitcase> container;

    private int currentWeight;

    Container(int max){
        this.maxWeight = max;
        this.container = new ArrayList<Suitcase>();
        this.currentWeight = 0;

    }

    void addSuitcase(Suitcase suitcase){
        if((this.currentWeight + suitcase.totalWeight()) < this.maxWeight){
            this.container.add(suitcase);
            this.currentWeight += suitcase.totalWeight();

        }
    }

    public String toString(){
        return this.container.size()+ " suitcases " + "(" + this.currentWeight + " kg)";
    }

    void printThings(){
        for(Suitcase item : container){
            item.printThings();
        }
    }
}
