import java.util.Scanner;

public class ex15 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("How old are you? ");
        int age = Integer.parseInt(reader.nextLine());

        if (age >= 18){
            System.out.print("You have reached the age of majority!");
        } else {
            System.out.print("You have not reached the age of majority!");
        }
    }
}
