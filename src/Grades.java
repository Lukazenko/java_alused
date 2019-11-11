import java.util.Scanner;

class Grades {

    private String[] grades;
    private int kokku;
    private int accepted;

    Grades(){
        this.grades = new String[]{"Grade distribution:", "5: ", "4: ", "3: ", "2: ", "1: ", "0: ", "Acceptance percentage: "};
        this.kokku = 0;
        this.accepted = 0;
    }

    void Score(){
        Scanner scanner = new Scanner(System.in);

        int points;
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
    }

    void accepted(){
        double acc = (double) (100 * accepted) / kokku;
        grades[7] += acc;
    }



    void print(){
        for(String asd : grades){
            System.out.println(asd);
        }

    }
}
