import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(4,5,3,9);
        int result=numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println(result);

        //No Initial Value
        Optional<Integer> result2=numbers.stream().reduce((a,b)->a+b);
        System.out.println(result2);

        //Max and Min
        Optional <Integer> min=numbers.stream().reduce(Integer::min);
        Optional<Integer>max= numbers.stream().reduce(Integer::max);
        Optional<Integer>sum=numbers.stream().reduce(Integer::sum);
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
        System.out.println("Sum: "+sum);

        //Task
        int dishCount=DishData.getAll().stream()
                .map(d->1)
                .reduce(0,(a,b)->a+b);
        System.out.println(dishCount);
    }
}
