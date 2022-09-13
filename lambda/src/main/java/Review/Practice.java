package Review;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.*;

public class Practice {
    public static void main(String[] args) {
        // one parameter, return boolean value
        Predicate<Integer> greaterThan10=num->num>10;
        System.out.println(greaterThan10.test(15));

        // two input, return boolean
        BiPredicate<Integer,Integer> greaterThan=(num1,num2)->num1>num2;
        System.out.println(greaterThan.test(11, 23));

        // one parameter, no return;
        Consumer<String> printStar= str-> System.out.println("********** "+str+" **********");
        printStar.accept("Harold");

        //tow parameter, no return;
        BiConsumer<String,String> combine=(str1,str2)-> System.out.println(str1+" "+str2);
        combine.accept("Harold", "Finch");

        // create a method that takes string and integer, print the string given numberof times
        BiConsumer<String,Integer> printMultipleTimes=(str,num)->{
            for (int i = 0; i <num ; i++) {
                System.out.println(str);

            }
        };
        printMultipleTimes.accept("Albus",3);

        //Another task
        Map<String,Integer> map=new LinkedHashMap<>();
        map.put("Steven",6000);
        map.put("Mike",7000);
        map.put("Joe",3000);
        map.put("Harold",4500);
        map.put("Albus",5500);
        System.out.println("=============================================");

        //print the name of the employee whose salary is grater than 5000 (foreach)
        map.forEach( (name,salary)-> {
            if (salary > 5000) {
                System.out.println(name);

            }
        });

        //one parameter and return one
        Function<Integer,Integer> squared=x->x*x;
        System.out.println(squared.apply(5));

        //no parameter and one return
        Supplier<String>value=()->"Some return";
        System.out.println(value.get());

    }
}
