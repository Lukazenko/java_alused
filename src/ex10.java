import java.util.Scanner;

public class ex10 {
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);

        System.out.print("Type the radius: ");
        int radius = Integer.parseInt(reader.nextLine());

        double circle = 2 * Math.PI * radius;

        System.out.print("Circumference of the circle: " + circle);
    }
}
