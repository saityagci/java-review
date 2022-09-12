package comparatorInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,0,15,5,20);
        System.out.println(list);
        //Ascending sort
        Collections.sort(list);
        System.out.println(list);
        //Descending order
        Collections.sort(list,new MyComparator());
        System.out.println(list);
        Collections.sort(list,(o1,o2)->(o1>o2)?-1:(o2<o1)?1:0);
        //Ascending sort
        list.sort((o1,o2)->o1.compareTo(o2));
        System.out.println(list);
        //Descending order
        // list.sort((o1,o2)->o2.compareTo(o1)); either one ok
        list.sort((o2,o1)->o1.compareTo(o2));
        System.out.println(list);

        List<Apple> myInventory=Arrays.asList(new Apple(80,Color.GREEN),
        new Apple(60,Color.GREEN),
        new Apple(70,Color.RED),
        new Apple(22,Color.RED));
//        myInventory.sort(Comparator.comparing(apple -> apple.getWeight()));
//        System.out.println(myInventory);
        Comparator<Apple>sortApple= comparing((Apple apple)->apple.getWeight());
        myInventory.sort(sortApple);
        System.out.println(myInventory);
        myInventory.sort(comparing(apple -> apple.getWeight()));
        myInventory.sort(comparing(Apple::getWeight));

        //REVERSED
        myInventory.sort(comparing(Apple::getWeight).reversed());

        //CHAINING
        myInventory
                .sort(comparing(Apple::getWeight)
                        .reversed()
                        .thenComparing(Apple::getColor));

        System.out.println(myInventory);



    }


}
