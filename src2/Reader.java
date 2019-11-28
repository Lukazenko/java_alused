import java.util.Scanner;

class Reader {

    private Scanner reader = new Scanner(System.in);

    String readString(){
        return reader.nextLine();
    }

    int readInteger(){
        return Integer.parseInt(reader.nextLine());
    }
}
