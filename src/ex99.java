public class ex99 {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    private static void printArrayAsStars(int[] array) {
        for(int asd : array){
           String star = "";
           int i = 0;
           while(i < asd){
               star += "*";
               i++;
           }
           System.out.println(star);
        }
    }
}
