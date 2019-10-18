import java.util.Scanner;

public class ex11 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int numberOne = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        int numberTwo = Integer.parseInt(reader.nextLine());

        int bigger = java.lang.Math.max(numberOne, numberTwo);

        System.out.print("The bigger number of the two numbers given was: " + bigger);


    }
}
