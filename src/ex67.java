import java.util.ArrayList;

public class ex67 {
    private static double variance(ArrayList<Integer> list) {

        double avg = average(list);
        int sum = 0;
        for (Integer i : list){
            int arv;
            arv = i * i;
            sum = sum + arv;
        }

        double vahe = sum - avg;

        int items = list.size() - 1;
        double variance = vahe / items;
        return variance;



    }

    // veidi muutma averaget
    private static double average(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer i : list){
            sum = sum + i;
        }
        int square = sum * sum;
        return  (double) square / list.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }
}
