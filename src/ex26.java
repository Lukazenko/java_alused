import java.util.Scanner;

public class ex26 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        int sum = 0;
        while (true) {
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0){
                break;
            }


            sum = sum + read;

            System.out.println("Sum now: " + sum);
        }
        System.out.print("Sum in the end: " + sum);
    }
}
