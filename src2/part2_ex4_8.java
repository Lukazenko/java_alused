public class part2_ex4_8 {
    public static void main(String[] Container) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    private static void addSuitcasesFullOfBricks(Container container) {
        // adding 100 suitcases with one brick in each

        for(int i = 0; i < 100; i++){

            Thing brick = new Thing("Brick", 1 + i);
            Suitcase suitcase = new Suitcase(101);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
        }
    }
}
