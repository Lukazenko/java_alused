import java.util.Scanner;

class GuessingGame {

    private Scanner reader;

    GuessingGame() {
        this.reader = new Scanner(System.in);
    }

    void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);

        while (lowerLimit < upperLimit) {
            int avg = average(lowerLimit, upperLimit);
            if(isGreaterThan(avg)){
                lowerLimit = avg + 1;
            } else {
                upperLimit = avg;
            }
        }

        System.out.println("The number you're thinking of is " + lowerLimit);
    }

    int average(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber) / 2;
    }


    boolean isGreaterThan(int value) {
        System.out.println("Is your number greater than " + value + "? (y/n)");

        String vastus = reader.nextLine();

        return vastus.equals("y");


    }

    private void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking of with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you with a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    private static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value
        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }


}