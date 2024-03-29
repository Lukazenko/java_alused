import java.util.Scanner;
import hangman.Hangman;

public class ex42 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Hangman hangman = new Hangman();

        System.out.println("************");
        System.out.println("* Hangman *");
        System.out.println("************");
        System.out.println("");
        printMenu();
        System.out.println("");

        // ADD YOUR IMPLEMENTATION HERE

        while (hangman.gameOn()) {
            System.out.println("Type a command: ");
            String command = reader.nextLine();
            // ...
            if(command.equals("quit")){
                break;

            } else if(command.equals("status")){

                hangman.printStatus();
            } else if(command.length() == 1){
                hangman.guess(command);
            } else if (command.isEmpty()){
                System.out.println("String was empty");
            } else {
                System.out.println("I found something");
            }
            hangman.printMan();
            hangman.printWord();


        }


        System.out.println("Thank you for playing!");

    }
    private static void printMenu() {
        System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
    }

}
