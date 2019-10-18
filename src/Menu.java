import java.util.ArrayList;

class Menu {
    private ArrayList<String> meals;

    Menu() {
        this.meals = new ArrayList<>();
    }

    void addMeal(String meal){
        if(!meals.contains(meal)){
            meals.add(meal);
        }
    }
    void printMeals(){
        for(String meal : meals){
            System.out.println(meal);
        }

    }
    void clearMenu(){
        meals.clear();
    }


}
