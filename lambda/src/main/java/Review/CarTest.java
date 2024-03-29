package Review;

import java.util.ArrayList;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {
        List<Car> garage=new ArrayList<>();
        garage.add(new Car("Toyota",130,2000));
        garage.add(new Car("Ferrari",200,2010));
        garage.add(new Car("Mercedes",140,2020));
        garage.add(new Car("Tesla",135,2022));
        garage.add(new Car("Porsche",170,2021));
        garage.add(new Car("Fiat",90,2011));
        System.out.println(garage);

        List<Car> newCar=filterCar(garage,new NewCar());
        System.out.println("New car "+newCar);
        List<Car> fastCar=filterCar(garage,new FastCar());
        System.out.println("Fast car  "+fastCar);

        //durable car, --make Toyota
        List<Car> durableCar=filterCar(garage,new DurableCar());
        System.out.println(durableCar);
        CarPredicate newCarLambda=  car -> car.getYear()>2015;
        List<Car> newCarListLambda=filterCar(garage,newCarLambda);
        System.out.println(newCarListLambda);

        }



   private static List<Car> filterCar(List<Car>garage,CarPredicate carPredicate){
        List<Car>result=new ArrayList<>();
        for (Car car : garage) {
            if (carPredicate.test(car)){
                result.add(car);
            }


        }
        return result;
    }
}
