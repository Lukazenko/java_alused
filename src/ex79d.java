import java.util.Scanner;

public class ex79d {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        System.out.println("Type numbers: ");

        while (true){

            int vastus = Integer.parseInt(reader.nextLine());
            if(vastus == -1){
                System.out.println("sum: " + stats.sum());
                System.out.println("sum of even: " + even.sum());
                System.out.println("sum of odd: " + odd.sum());
                break;
            }
            stats.addNumber(vastus);
            if(vastus % 2 == 0){
                even.addNumber(vastus);
            } else {
                odd.addNumber(vastus);
            }

        }
    }
}
