import java.util.Scanner;

public class ex48 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        System.out.print("Number of characters: " + name.charAt(0));

    }
}
