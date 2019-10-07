import java.util.Scanner;


public class ex22 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        while (true){
            System.out.print("Type the password: ");
            String pw = reader.nextLine();

            if (pw.equals("carrot")){
                System.out.println("Right!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
        System.out.print("The secret is: jryy qbar!");


    }
}
