import java.util.Scanner;

public class ex55 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first word: ");
        String word = reader.nextLine();
        System.out.print("Type the second word: ");
        String second = reader.nextLine();
        int index = word.indexOf(second);
        if(index == -1){
            System.out.print("The word " + second + " is not found in the word " + word + ".");
        } else {
            System.out.print("The word " + second + " is found in the word " + word);
        }

    }
}
