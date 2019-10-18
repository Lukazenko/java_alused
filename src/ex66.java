import java.util.ArrayList;

public class ex66 {
    private static int greatest(ArrayList<Integer> list) {
        int biggest = 0;
        for (Integer i : list){
            if(i > biggest){
                biggest = i;
            }



        }
        return biggest;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The greatest number is: " + greatest(list));
    }

}
