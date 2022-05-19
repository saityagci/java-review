package doubleColonOperator;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {
    public static void main(String[] args) {
      // Zero-Argument
      Supplier<Car> c1=()-> new Car();
        System.out.println(c1.get().getModel());
        Supplier<Car> c2=Car::new;
        System.out.println(c2.get().getModel());
        //One Argument
        Function<Integer,Car> f1=make-> new Car(make);
        Car bmw=f1.apply(2009);
        System.out.println(bmw.getModel());
        Function<Integer,Car> f2=Car::new ;
        Car toyota=f2.apply(2011);
        System.out.println(toyota.getModel());
        // Two Argument

        BiFunction<String,Integer,Car> b1= (make,model)->new Car(make,model);
        Car honda= b1.apply("Honda",2000);
        System.out.println(honda.getModel()+ " "+honda.getMake());

        BiFunction<String,Integer,Car> b2= Car::new;
        Car nissan= b2.apply("Nissan",2022);
        System.out.println(nissan.getModel()+" "+ nissan.getMake());

    }
}
