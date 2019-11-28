import java.util.Scanner;

class TextUserInterface {

    private final Dictionary dict;
    private final Scanner read;

    TextUserInterface(Scanner reader, Dictionary dictionary){
        this.dict = dictionary;
        this.read = reader;

    }

    void start(){
        statements();

        while (true) {

            System.out.println("Statement:");

            String input = read.nextLine().trim();

            if (input.equalsIgnoreCase("add")) {
                add();
            } else if (input.equalsIgnoreCase("translate")) {
                translate();
            } else if (input.equalsIgnoreCase("quit")) {
                System.out.println("Cheers!");
                break;
            } else {
                System.out.println("Unknown statement");
            }
        }


    }

    void statements(){
        System.out.println("Statements:");
        System.out.println("add - adds a word pair to the dictionary");
        System.out.println("translate - asks a word and prints its translation");
        System.out.println("quit - quit the text user interface");
        System.out.println("");
    }

    public void add() {
        System.out.println("In Finnish: ");
        String finnishWord = read.nextLine();
        System.out.println("Translation: ");
        String englishWord = read.nextLine();
        this.dict.add(finnishWord, englishWord);
    }

    public void translate() {
        System.out.println("Give a word: ");
        String finnishWord = read.nextLine();
        String key = dict.translate(finnishWord);
        System.out.println("Translation: " + key);
    }
}
