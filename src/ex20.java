import java.util.Scanner;


public class ex20 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your username: ");

        String username = reader.nextLine();

        System.out.print("Type your password: ");

        String password = reader.nextLine();

        if(username.equals("alex")  && password.equals("mightyducks")  || username.equals("emily") && password.equals("cat")){
            System.out.print("You are now logged into the system");
        } else {
            System.out.print("Your username or password was invalid!");
        }


    }
}
