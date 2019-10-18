import java.util.ArrayList;
import java.util.Scanner;

public class ex57 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        String word;
        ArrayList<String> words = new ArrayList<String>();

        while (true){

            System.out.print("Type a word: ");
            word = reader.nextLine();

            words.add(word);

            if(word.isEmpty()){
                System.out.println("You typed the following words:");

              for (String one : words) {
                  System.out.println(one);
              }
                break;
            }

        }
    }
}
