import java.util.Scanner;

public class ex34 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int i = 1;
        int factorial = 1;

        if(number == 0){
            System.out.print("Factorial is 1");
        } else {
            while(i <= number){
                factorial = factorial * i;
                i++;


            }
            System.out.print("Factorial is " + factorial);
        }


    }
}
