public class ex104c {
    public static void main(String[] args) {
        int[] values = {-1, 6, 9, 8, 12};
        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
        System.out.println(indexOfTheSmallestStartingFrom(values, 4));

    }

    private static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallest = array[index];
        int ind = index;
        for(int i = index; i < array.length; i++){
            if(smallest > array[i]){
                smallest = array[i];
                ind = i;
            }
        }

        return ind;
    }

}
