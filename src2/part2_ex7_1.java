public class part2_ex7_1 {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("porkkana"));

    }
}
