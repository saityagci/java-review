package task;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {
        List<Apple> inventory= new ArrayList<>();
        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(Apple.builder().weight(100).build());
        inventory.add(Apple.builder().weight(200).color(Color.GREEN).build());
        inventory.add(Apple.builder().weight(210).color(Color.GREEN).build());
        inventory.add(Apple.builder().weight(130).color(Color.GREEN).build());
        inventory.add(Apple.builder().weight(870).color(Color.RED).build());
        inventory.add(Apple.builder().weight(420).color(Color.GREEN).build());
        inventory.add(Apple.builder().weight(120).color(Color.RED).build());
       AppleFormatter simpleFormatter= apple -> "An apple of "+ apple.getWeight()+" g";
       prettyPrintApple(inventory,simpleFormatter);
       prettyPrintApple(inventory,apple ->"An apple of "+ apple.getWeight()+" g"+" and "+apple.getColor()+ " color." );
    }
    private static void prettyPrintApple(List<Apple>inventory,AppleFormatter appleFormatter){
        for (Apple apple : inventory) {
            String output=appleFormatter.accept(apple);
            System.out.println(output);

        }
    }
}
