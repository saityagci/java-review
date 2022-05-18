package functionalinterfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Examples {
    public static void main(String[] args) {
        //**************Predicate**************
     //      Predicate<Integer>lesserThan= new Predicate<Integer>() {
    //         @Override
    //         public boolean test(Integer integer) {
     //            return integer<18;
    //        }
    //     };
    //    lesserThan.test(50);
        Predicate<Integer> lesserThan=a->a<18;
        boolean result=lesserThan.test(50);
        System.out.println(result);
        //**************CONSUMER**************
        Consumer<Integer> display=i-> System.out.println(i);
        display.accept(50);
        //**************BICONSUMER**************
        BiConsumer<Integer,Integer>addTwo=(x,y)-> System.out.println(x+y);
        addTwo.accept(100,30);

    }
}