import java.util.Scanner;

public class ex14 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());

        if (number >= 0){
            System.out.print("The number is positive");
        } else {
            System.out.print("The number is not positive");
        }

    }
}
