import java.util.Scanner;


public class ex19 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("How old are you?: ");

        int age = Integer.parseInt(reader.nextLine());

        if (age >= 0 && age <= 120){
            System.out.print("ok");
        } else {
            System.out.print("Impossible");
        }


    }
}
