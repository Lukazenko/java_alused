import java.util.Scanner;

public class ex9 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int numberOne = Integer.parseInt(reader.nextLine());

        System.out.println("Type another number: ");
        int numberTwo = Integer.parseInt(reader.nextLine());

        double division = (double) numberOne / numberTwo;
        System.out.println("Divison: " + numberOne + " / " + numberTwo + " = " + division);
    }
}
