import java.util.ArrayList;
import java.util.Scanner;

public class ex58 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String word;


        while(true){
            System.out.print("Type a word: ");
            word = reader.nextLine();


            if(words.contains(word)){
                System.out.print("You gave the word " + word + " twice");
                break;
            }
            words.add(word);
        }
    }
}
