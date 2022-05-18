import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleTest {
    public void main(String[] args) {
        List<Apple> inventory=new ArrayList<>();
        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(500,Color.RED));
        inventory.add(new Apple(201,Color.GREEN));
        inventory.add(new Apple(150,Color.RED));
        inventory.add(new Apple(89,Color.GREEN));

        List<Apple> heavyApple=filterApples(inventory,new AppleHeavyPredicate());
        System.out.println(heavyApple);
        List<Apple> greenApple=filterApples(inventory,new AppleGreenColorPredicate());
        System.out.println(greenApple);
        System.out.println("*****************************************");
        List<Apple>greenApples=filterApple(inventory,apple -> apple.getColor().equals(Color.GREEN)   );

        System.out.println(greenApples);

    }
    private static List<Apple> filterApple(List<Apple> inventory,
                                           Predicate<Apple> applePredicate) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory){
            if (applePredicate.test(apple)){
                result.add(apple);
            }

        }
        return result;
    }



    private static List<Apple> filterApples(List<Apple> inventory,
                                            ApplePredicate applePredicate) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory){
            if (applePredicate.test(apple)){
                result.add(apple);
            }

        }
        return result;
    }
}
