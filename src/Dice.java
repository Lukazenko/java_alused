import java.util.Random;

class Dice {
    private Random random;
    private int numberOfSides;

    Dice(int numberOfSides){
        this.numberOfSides = numberOfSides;
        random = new Random();

    }

    int roll() {
        // we'll get a random number in the range 1-numberOfSides<
        int low = 1;
        int high = numberOfSides;

        return random.nextInt(high) + low;

    }
}
