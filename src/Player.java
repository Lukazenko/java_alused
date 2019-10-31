public class Player {
    private String name;
    private int goals;

    Player(String name){
        this.name = name;
    }

    Player(String name, int goals){
        this.name = name;
        this.goals = goals;
    }

    String getName(){
        return this.name;
    }

    int goals(){
        return this.goals;
    }

    public String toString(){
        return "" + this.name + ", goals " + this.goals;
    }
}
