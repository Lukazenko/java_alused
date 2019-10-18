import java.util.Scanner;

public class ex69 {
    private static boolean palindrome(String text) {
        String word = reverse(text);
        return word.equals(text);

    }
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

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
