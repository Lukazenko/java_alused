import java.util.Random;

class NightSky {
    private double density;
    private int width;
    private int height;



    public NightSky(double density){
        this.density = density;
        this.width = 20;
        this.height = 10;

    }

    NightSky(int width, int height){
        this.density = 0.1;
        this.width = width;
        this.height = height;

    }

    NightSky(double density, int width, int height){
        this.density = density;
        this.width = width;
        this.height = height;

    }

    void printLine(){
        Random rand = new Random();


        for(int i = 0; i < width; i++){
            double num = rand.nextDouble();


            if(num <= 0.1){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }

    }

    void print(){

        for(int i = 0; i < height; i++){
            printLine();
            System.out.println();

        }

    }
}
