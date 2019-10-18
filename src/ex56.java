import java.util.Scanner;

public class ex56 {
    private static String reverse(String text) {
        String help = "";
        int last = text.length();
        int i = 0;
        int ch = last - 1;
        while(i < last){
            help = help + text.charAt(ch);
            ch--;
            i++;
        }

        return help;

    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
