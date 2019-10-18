import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex59 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String word;

        while(true){
            System.out.print("Type a word: ");
            word = reader.nextLine();
            words.add(word);

            if(word.isEmpty()){

                Collections.reverse(words);
                for (String one : words){
                    System.out.println(one);
                }
            }

        }
    }
}
