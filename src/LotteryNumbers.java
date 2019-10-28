import java.util.ArrayList;
import java.util.Random;

class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random;

    LotteryNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    ArrayList<Integer> numbers() {
        return this.numbers;
    }

    private void drawNumbers() {
        // Write the number drawing here using the method containsNumber()
        random = new Random();
        int newnumber;
        int i = 0;
        while(i < 7){
            newnumber = random.nextInt(39) + 1;
            if(!containsNumber(newnumber)){
                numbers.add(newnumber);
            }

            i++;
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already among the drawn numbers

        return numbers.contains(number);


    }
}
