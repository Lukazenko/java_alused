import java.util.Scanner;

public class ex35 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());

        int i = 0;
        int result = 0;


        while (i <= number){
            result = result + (int)Math.pow(2, number);

            number--;


        }
        System.out.print("The result is " + result);

        //System.out.print("The result is " + result);






    }
}
