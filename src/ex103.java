import java.util.Scanner;

public class ex103 {
    public static void main(String[] args) {
        BirdCollection one = new BirdCollection();

        Scanner scanner = new Scanner(System.in);
        String question;

        label:
        while (true){
            System.out.print("? ");
            question = scanner.nextLine();

            switch (question) {
                case "add": {
                    System.out.print("Name: ");
                    String name;
                    name = scanner.nextLine();
                    System.out.print("Latin Name: ");
                    String Lname;
                    Lname = scanner.nextLine();
                    Birds bird = new Birds(name, Lname);
                    one.Add(bird);


                    break;
                }
                case "observation": {
                    System.out.print("What was observed? ");
                    String name;
                    name = scanner.nextLine();
                    one.Observation(name);

                    break;
                }
                case "statistics":
                    one.printAll();

                    break;
                case "show":
                    System.out.print("What? ");
                    String name;
                    name = scanner.nextLine();
                    one.OneBird(name);

                    break;
                case "quit":
                    break label;

                default:
                    System.out.println("Unknown command");
                    System.out.println("Commands: add, observation, statistics, show, quit");


                    break;
            }

        }
    }



}
