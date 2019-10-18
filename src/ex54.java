import java.util.Scanner;

public class ex54 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");

        String word = reader.nextLine();
        System.out.print("Length of the end part: ");
        int number = Integer.parseInt(reader.nextLine());
        int start = word.length() - number;

        System.out.print("Result: " + word.substring(start));
    }

}
