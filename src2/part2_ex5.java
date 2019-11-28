import java.util.HashMap;

public class part2_ex5 {
    public static void main(String[] args) {
        HashMap<String, String> names = new HashMap<String, String>();

        names.put("matti", "mage");
        names.put("mikael", "mixu");
        names.put("arto", "arppa");

        System.out.print(names.get("mikael"));


    }
}
