public class ex104b {
    public static void main(String[] args) {
        int[] values = {6, 5, 8, 7, 11};
        System.out.println("Index of the smallest: " + indexOfTheSmallest(values));

    }

    private static int indexOfTheSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;
        for(int i = 0; i < array.length; i++){
            if(smallest > array[i]){
                smallest = array[i];
                index = i;
            }
        }

        return index;


    }
}
