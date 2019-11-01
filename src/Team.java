import java.util.ArrayList;

class Team {
    private String name;
    private ArrayList<Player> list;

    Team(String name){
        this.name = name;
        this.list = new ArrayList<Player>();
    }

    String getName(){
        return this.name;
    }

    void addPlayer(Player player){
        list.add(player);

    }

    void printPlayers(){
        for(Player asd : list){
            System.out.println(asd);
        }

    }
}
