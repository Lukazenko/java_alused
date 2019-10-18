import java.util.ArrayList;

public class ex61 {
    private static int countItems(ArrayList<String> list){
        int size = list.size();
        return size;

    }
    public static void print(ArrayList<String> printed) {
        for (String word : printed) {
            System.out.println( word );
        }
    }
    private static void removeFirst(ArrayList<String> list) {
        list.remove(0);  // removes the first item (indexed 0)
    }
    public static void main(String[] args) {
        ArrayList<String> programmingLanguages = new ArrayList<String>();
        programmingLanguages.add("Pascal");
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("Ruby");
        programmingLanguages.add("C++");

        print(programmingLanguages);

        removeFirst(programmingLanguages);

        System.out.println();  // prints an empty line

        print(programmingLanguages);

    }
}
