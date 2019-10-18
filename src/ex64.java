import java.util.ArrayList;

public class ex64 {
    private static double average(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer i : list){
            sum = sum + i;
        }
        return (double) sum / list.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}
