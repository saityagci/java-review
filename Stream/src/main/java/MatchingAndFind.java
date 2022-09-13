import java.util.Optional;

public class MatchingAndFind {
    public static void main(String[] args) {
        //All Match
       boolean isHealthy= DishData.getAll().stream().allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHealthy);
        System.out.println("===============================");

        // Any Match

        if(DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly");
        }
        // if(DishData.getAll().stream().anyMatch(dish -> dish.isVegetarian())){
        //    System.out.println("The menu is vegetarian friendly");}
        System.out.println("===============================");

        //None Match
        boolean isHealthy1=DishData.getAll().stream().noneMatch(dish -> dish.getCalories()>=1000);
        System.out.println(isHealthy1);
        System.out.println("===============================");

        //Find Any
        Optional<Dish> dish=DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findAny();
        System.out.println(dish);
        System.out.println("===============================");

        // Find First
        Optional<Dish> dish1=DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findFirst();
        System.out.println(dish);

    }
}
