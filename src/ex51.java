import java.util.Scanner;

public class ex51 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int name_l = name.length();
        int i = 0;
        int num = 1;
        int numa = 0;
        int last = name_l - 1;
        while(i < name_l){
            System.out.println(num + ". character: "  + name.charAt(numa));

            i++;
            num++;
            if(numa < last){
                numa++;
            }



        }





    }
}
