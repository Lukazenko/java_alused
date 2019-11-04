public class ex97 {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    private static void printElegantly(int[] array) {
        int num = array.length;
        int i = 1;
        for( int number : array) {
            if(i == num){
                System.out.print(number);
            } else {
                System.out.print(number + ", ");
            }

            i++;
        }
    }
}
