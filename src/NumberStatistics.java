import java.util.ArrayList;

class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        this.amountOfNumbers = 0;
        this.sum = 0;
    }

    void addNumber(int number) {

        sum += number;

        amountOfNumbers += 1;



    }

    int amountOfNumbers() {


        return amountOfNumbers;

    }

    int sum(){
        return sum;

    }

    double average(){
        return (double) sum / amountOfNumbers;

    }

}
