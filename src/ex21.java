import java.util.Scanner;


public class ex21 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a year: ");

        int year = Integer.parseInt(reader.nextLine());
        int four = 4;
        int hundred = 100;
        int fourhundred = 400;

        if(year%four == 0 && year%hundred != 0 || year%400 == 0){
            System.out.print("The year is a leap year.");
        } else {
            System.out.print("The year is not a leap year.");
        }


    }
}
