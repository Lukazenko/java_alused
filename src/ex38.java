import java.util.Scanner;

public class ex38 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("How many?");
        int number = Integer.parseInt(reader.nextLine());
        int i = 0;
        while(i < number){

            printText();
            i++;
        }

    }

    private static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
