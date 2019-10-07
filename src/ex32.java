import java.util.Scanner;

public class ex32 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("Until what? ");
        int number = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int i = 0;

        while (i <= number){

            sum = sum + i;
            i++;

        }
        System.out.print("Sum is " + sum);
    }
}
