public class Book2 implements ToBeStored {
    private String writer;
    private String name;
    private double weight;

    Book2(String writer, String name, double weight){
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString(){
        return this.writer + ": " + this.name;
    }
}
