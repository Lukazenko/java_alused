class Change {
    private char first_char;
    private char second_char;

    Change(char fromCharacter, char toCharacter){
        this.first_char = fromCharacter;
        this.second_char = toCharacter;

    }

    String change(String characterString){

        String replaced = "";

        for (int i = 0; i < characterString.length(); i++){
            char character = characterString.charAt(i);
            if(character == first_char){
                replaced += second_char;
            } else {
                replaced += character;
            }
        }

         return replaced;
    }
}
