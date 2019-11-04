public class ex96 {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sum(array));
    }

    private static int sum(int[] array) {

        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }
}
