public class ex46 {
    private static double average(int number1, int number2, int number3, int number4) {
        int sum = number1 + number2 + number3 + number4;
        return (double)sum / 4;
    }

    public static void main(String[] args) {
        double answer = average(4, 3, 6, 1);
        System.out.println("average: " + answer);
    }


}
