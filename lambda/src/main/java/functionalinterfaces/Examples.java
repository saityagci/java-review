package functionalinterfaces;

import java.util.function.*;

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
        //**************FUNCTION**************
        Function<String,String> fun=s->"Hello "+s;
        String str=fun.apply("Ozzy");
        System.out.println(str);
        //**************SUPPLIER**************
        Supplier<Double> randomValue= ()-> Math.random();
        System.out.println( randomValue.get());
        Predicate <Integer>pred=(p)->p%2==0?true:false;
        System.out.println(pred.test(30));

        BiConsumer<Integer,Integer> bn= (x,y)-> System.out.println(x+y);
        bn.accept(5,12);
        BiConsumer<Integer,String> bm= (x,y)-> System.out.println(x+y);
        bm.accept(2," Apple");



    }
}
