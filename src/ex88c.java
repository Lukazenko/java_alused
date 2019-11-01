import java.util.ArrayList;
import java.util.Scanner;

public class ex88c {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();

        while(true){

            System.out.print("name: ");
            String name = reader.nextLine();
            if(!(name.equals(""))){
                System.out.print("studentnumber: ");
                String studentnumber = reader.nextLine();

                list.add(new Student(name, studentnumber));

            } else {
                for (Student asd : list){
                    System.out.println(asd);
                }

                break;
            }

        }

        System.out.print("Give search term: ");
        String search = reader.nextLine();

        for (Student asd : list){
            String name = asd.getName();
            if(name.contains(search)){
                System.out.println(asd);
            }
        }


    }

}
