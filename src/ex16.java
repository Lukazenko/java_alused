import java.util.Scanner;
public class ex16 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());

        if (number % 2 == 0){
            System.out.print("The number " + number + " is even");

        } else {
            System.out.print("The number " + number + " is odd");
        }
    }
}
