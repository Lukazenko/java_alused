public class ex104 {
    public static void main(String[] args) {
        int[] values = {6, 5, 8, 7, 11};
        System.out.println("smallest: " + smallest(values));
    }

    private static int smallest(int[] array){
        int small = array[0];
        for(int asd : array){

            if(small > asd){
                small = asd;
            }
        }

        return small;
    }


}
