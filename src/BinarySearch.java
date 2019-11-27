class BinarySearch {

    static boolean search(int[] array, int searchedValue){
        boolean vastus = false;
        for(int value : array){
            if (value == searchedValue) {
                vastus = true;
                break;
            }
        }

        return vastus;


    }
}
