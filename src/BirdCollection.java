import java.util.ArrayList;

class BirdCollection {
    private ArrayList<Birds> col;


    BirdCollection(){
        this.col = new ArrayList<Birds>();

    }

    void Add(Birds bird){
        col.add(bird);
    }

    void Observation(String name){
        int found = 0;
        for(Birds asd : col){
            if(asd.getBird().equals(name)){
                found += 1;
                asd.AddObserve();
            }
        }

        if(found == 0){
            System.out.println("Is not a bird!");
        }



    }

    void OneBird(String name){
        for(Birds asd : col){
            if(asd.getBird().equals(name)){
                System.out.println(asd.getBird() + " (" + asd.getLatin() + "): " + asd.getObserve() + " observations");

            }
        }
    }

    void printAll(){
        for (Birds asd : col){
            System.out.println(asd.getBird() + " (" + asd.getLatin() + "): " + asd.getObserve() + " observations");
        }

    }


}
