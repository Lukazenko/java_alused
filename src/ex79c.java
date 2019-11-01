import java.util.Scanner;

public class ex79c {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        System.out.println("Type numbers: ");

        while (true){

            int vastus = Integer.parseInt(reader.nextLine());
            if(vastus == -1){
                System.out.println("sum: " + stats.sum());
                break;
            }
            stats.addNumber(vastus);

        }
    }


}
