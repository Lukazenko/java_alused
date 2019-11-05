import java.util.Scanner;

public class ex102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type exam scores, -1 completes:");
        int points;
        int kokku = 0;
        int accepted = 0;
        String[] grades = {"Grade distribution:", "5: ", "4: ", "3: ", "2: ", "1: ", "0: ", "Acceptance percentage: "};


        while(true){
            points = Integer.parseInt(scanner.nextLine());
            if(points >= 0 && points <= 29){
                grades[6] += "*";
            } else if (points >= 30 && points <= 34){
                grades[5] += "*";
                accepted += 1;
            } else if (points >= 35 && points <= 39) {
                grades[4] += "*";
                accepted += 1;
            } else if (points >= 40 && points <= 44) {
                grades[3] += "*";
                accepted += 1;
            } else if (points >= 45 && points <= 49) {
                grades[2] += "*";
                accepted += 1;
            } else if (points >= 50 && points <= 60) {
                grades[1] += "*";
                accepted += 1;

            } else if(points == -1){
                break;
            }
            kokku++;
        }

        System.out.println("kokku: " + kokku);
        System.out.println("accepted: " + accepted);

        double acc = (double) (100 * accepted) / kokku;
        grades[7] += acc;







        for(String asd : grades){
            System.out.println(asd);
        }





    }

    private static void doSomething(Scanner scanner) {
        String riw = scanner.nextLine();





    }
}
