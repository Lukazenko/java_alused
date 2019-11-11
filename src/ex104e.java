import java.util.Arrays;

public class ex104e {
    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);

    }

    private static void sort(int[] array) {
        int index = 0;
        int at = 0;


        while (index < array.length) {
            int smallest = array[index];
            int two = array[index];

            System.out.println(Arrays.toString(array));

            for (int i = index; i < array.length; i++) {
                if (smallest > array[i]) {
                    smallest = array[i];
                    at = i;
                }
            }

            array[index] = smallest;
            array[at] = two;

            index++;
        }


    }

}








