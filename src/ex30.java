import java.util.Scanner;

public class ex30 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Up to what number? ");
        int Upnumber = Integer.parseInt(reader.nextLine());
        int number = 1;
        while (number <= Upnumber){
            System.out.println(number);
            number = number + 1;
        }
    }
}
