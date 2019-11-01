class HangmanLogic {
    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    int numberOfFaults() {
        return this.numberOfFaults;
    }

    String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    void guessLetter(String letter) {
        // program here the functionality for making a guess


        if(!this.word.contains(letter) && !guessedLetters.contains(letter)){
            numberOfFaults += 1;
            guessedLetters += letter;
        } else if(this.word.contains(letter) && !guessedLetters.contains(letter)){
            guessedLetters += letter;
        }

        // if the letter has already been guessed, nothing happens

        // it the word does not contains the guessed letter, the number of faults increases
        // the letter is added among the already guessed letters
    }

    String hiddenWord() {
        // program here the functionality for building the hidden word

        // create the hidden word by iterating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in the hidden word
        // if the letter is not among the guessed ones, replace it with _ in the hidden word

        // return the hidden word at the end

        String hidden = "";
        int i = 0;
        while(i < word.length()){
            String letter = "" + word.charAt(i);

            if(guessedLetters.contains(letter)){
                hidden += word.charAt(i);
            } else {
                hidden += "_";
            }

            i++;
        }

        return hidden;
    }
}
