public class CD implements ToBeStored {

    private String artist;
    private String title;
    private int published;
    private double weight;

    CD(String artist, String title, int published){
        this.artist = artist;
        this.title = title;
        this.published = published;
        this.weight = 0.1;
    }


    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString(){
        return this.artist + ": " + this.title + " (" + this.published + ")";
    }
}
