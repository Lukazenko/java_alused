public class ex40 {
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
    private static void printTriangle(int size) {

        int i = 0;
        int space = size;
        int stars = 1;
        while(i < size){
            printWhitespaces(space);
            printStars(stars);
            System.out.println();
            space--;
            stars++;
            i++;
        }



    }
    public static void main(String[] args){
        printTriangle(4);


    }
}
