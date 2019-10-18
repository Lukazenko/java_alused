import java.util.Scanner;

public class ex49 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int last = name.length() - 1;
        System.out.print("Last character: " + name.charAt(last));

    }
}
