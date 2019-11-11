import java.util.Arrays;

public class ex104d {
    public static void main(String[] args) {
        int[] values = {3, 2, 5, 4, 8};

        System.out.println( Arrays.toString(values) );

        swap(values, 1, 0);
        System.out.println( Arrays.toString(values) );

        swap(values, 0, 3);
        System.out.println( Arrays.toString(values) );

    }

    private static void swap(int[] array, int index1, int index2) {
        int one = array[index1];
        int two = array[index2];
        array[index1] = two;
        array[index2] = one;





    }
}
