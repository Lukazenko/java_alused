import java.util.Random;

class PasswordRandomizer {
    private int length;
    private Random random;


    PasswordRandomizer(int length) {
        // Format the variable here
        this.length = length;
        this.random = new Random();

    }

    String createPassword() {
        // Write the code here which returns the new password
        int low = 0;
        int high = 26;


        StringBuilder password = new StringBuilder();
        int i = 0;
        while(i < length){
            int number = random.nextInt(high) + low;
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
            password.append(symbol);
            i++;

        }

        return password.toString();


    }
}
