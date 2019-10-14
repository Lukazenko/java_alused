import java.util.Scanner;

public class ex36 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int number;
        int sum = 0;
        int counter = 0;
        double average = 0;
        int even = 0;
        int odd = 0;


        while (true) {

            System.out.println("Type numbers: ");

            number = Integer.parseInt(reader.nextLine());


            if (number == -1) {
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is: " + sum);
                System.out.println("How many numbers: " + counter);
                System.out.println("Average: " +  average );
                System.out.println("Even numbers: " +  even );
                System.out.println("Odd numbers: " +  odd );
                break;

            }

            sum += number;
            counter = counter + 1;
            average = (double) sum / (double) counter;
            if (number % 2 == 0) {
                even = even + 1;
            } else {
                odd = odd + 1;
            }




        }
    }
}
