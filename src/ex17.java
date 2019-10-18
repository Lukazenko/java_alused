import java.util.Scanner;

public class ex17 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the first number: ");
        int numberOne = Integer.parseInt(reader.nextLine());

        System.out.print("Type the second number: ");
        int numberTwo = Integer.parseInt(reader.nextLine());

        if(numberOne > numberTwo){
            System.out.print("Greater numbe: " + numberOne);
        } else if(numberOne == numberTwo){
            System.out.print("The numbers are equal!");

        } else {
            System.out.print("Greater number: " + numberTwo);
        }
    }
}
