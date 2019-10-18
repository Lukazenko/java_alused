import java.util.Scanner;

public class ex52 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int last = name.length();
        int letter = name.length() - 1;
        int i = 0;
        while(i < last){
            System.out.println("In reverse order: " + name.charAt(letter));
            i++;


            letter--;
        }
    }
}
