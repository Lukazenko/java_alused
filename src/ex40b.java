public class ex40b {
    private static void printStars(int amount) {

        int i = 0;

        while(i < amount){
            System.out.print("*");
            i++;
        }

    }
    private static void printWhitespaces(int size) {

        int i = 0;

        while(i < size){
            System.out.print(" ");
            i++;
        }

    }
    private static void xmasTree(int size) {

        int i = 0;
        int space = size;
        int stars = 1;
        while(i < size){
            printWhitespaces(space);
            printStars(stars);
            System.out.println();
            space--;
            stars = stars + 2;

            i++;
        }

        int leg = size - 1;
        printWhitespaces(leg);
        printStars(3);
        System.out.println();
        printWhitespaces(leg);
        printStars(3);



    }
    public static void main(String[] args){
        xmasTree(10);


    }
}
