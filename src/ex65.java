import java.util.ArrayList;

public class ex65 {
    private static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList<Integer> newlist = new ArrayList<Integer>();

        for (String one : list){
            int len;
            len = one.length();
            newlist.add(len);
        }

        return newlist;

    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> lengths = lengths(list);

        System.out.println("The lengths of the Strings: " + lengths);
    }
}
