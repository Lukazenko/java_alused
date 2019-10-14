public class ex39 {
    private static void printStars(int amount) {
        System.out.println();
        int i = 0;

        while(i < amount){
            System.out.print("*");
            i++;
        }

    }
    public static void main(String[] args){
        printStars(5);
        printStars(3);
        printStars(9);

    }

}
