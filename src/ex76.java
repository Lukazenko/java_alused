public class ex76 {
    public static void main(String[] args) {
        Menu asd = new Menu();
        asd.addMeal("Hamburger");
        asd.addMeal("Fish'n'Chips");
        asd.addMeal("Sauerkraut");

        asd.printMeals();

        asd.clearMenu();
        System.out.print("Menu cleared");

        asd.printMeals();
    }


}
