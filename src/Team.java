import java.util.ArrayList;

class Team {
    private String name;
    private ArrayList<Player> list;
    private int max = 16;

    Team(String name){
        this.name = name;
        this.list = new ArrayList<Player>();
    }

    String getName(){
        return this.name;
    }

    void addPlayer(Player player){
        if(list.size() < max){
            list.add(player);
        }


    }

    void printPlayers(){
        for(Player asd : list){
            System.out.println(asd);
        }

    }

    void setMaxSize(int maxSize){
        max = maxSize;

    }

    int size(){
        return list.size();
    }

    int goals(){
        int i = 0;
        for(Player asd : list){
            i += asd.goals();

        }

        return i;

    }


}
