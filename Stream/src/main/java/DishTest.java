import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class DishTest {
    public static void main(String[] args) {
        List<Dish> menu= Arrays.asList(
                new Dish("Pork",false,800,Type.MEAT),
                new Dish("Beef",false,700,Type.MEAT),
                new Dish("Chicken",false,400,Type.MEAT),
                new Dish("Fries",true,530,Type.OTHER),
                new Dish("Rice",true,350,Type.OTHER),
                new Dish("Fruit",true,120,Type.OTHER),
                new Dish("Pizza",true,550,Type.OTHER),
                new Dish("Prawn",false,300,Type.FISH),
                new Dish("Salmon",false,450,Type.FISH)
                );
        // print name of dish has less than 400 calories
        menu.stream()
                .filter(i-> i.getCalories()<400)
                .map(Dish::getName)
                .forEach(i-> System.out.println("Name of dish less than 400 cal: "+i));
        System.out.println("=============================================");
        // print the length of the name of each dish
        menu.stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);
        System.out.println("=============================================");
        // print 3 high calories dish name(more than 300 cal)
        menu.stream()
                .filter(dish -> dish.getCalories()>300)
                .limit(3)
                .map(Dish::getName)
                .forEach(System.out::println);
        System.out.println("=============================================");
        //print all dish name that are below 400 calories in sorted
        menu.stream()
                .filter(dish -> dish.getCalories()<400)
                .sorted(comparing(Dish::getCalories).reversed())
                .map(Dish::getName)
                .forEach(System.out::println);

    }
}
