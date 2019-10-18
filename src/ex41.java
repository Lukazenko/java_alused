import java.util.Random;
import java.util.Scanner;

public class ex41 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random r = new Random();
        int low = 0;
        int high = 100;
        int result = r.nextInt(high-low) + low;
        int number;
        int guesses = 1;

        while(true) {
            System.out.print(result +"Guess a number: " );
            number = Integer.parseInt(reader.nextLine());

            if ( number == result ) {
                System.out.print("Congratulations, your guess is correct!");
                break;
            } else if(number < result){
                System.out.println("The number is lesser, guesses made: " + guesses);
            } else {
                System.out.println("The number is greater, guesses made: " + guesses);
            }
            guesses++;
        }
    }
}
