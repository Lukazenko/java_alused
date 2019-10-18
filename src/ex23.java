
import java.util.Scanner;



public class ex23 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        while (true){
            System.out.print("Enter a floating point number between(-30 and 40): ");
            double number = Double.parseDouble(reader.nextLine());


            if(number > -30 && number < 40){
                Graph.addNumber(13.0);
            } else {
                System.out.print("Wrong number, goodbye");
                break;
            }

        }








    }
}