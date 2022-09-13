package Review;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CarTest2 {
    public static void main(String[] args) {
        List<Car> carList=new ArrayList<>();
//        carList.add(new Car("Toyota",130,2000));
//        carList.add(new Car("Ferrari",200,2010));
//        carList.add(new Car("Mercedes",140,2020));
//        carList.add(new Car("Tesla",135,2022));
//        carList.add(new Car("Porsche",170,2021));

        carList.add(Car.builder().model("Toyota").year(2000).topSpeed(130).build());
        carList.add(Car.builder().model("Ferrari").year(2010).topSpeed(200).build());
        carList.add(Car.builder().model("Mercedes").year(2020).topSpeed(140).build());
        carList.add(Car.builder().model("Tesla").year(2022).topSpeed(135).build());
        carList.add(Car.builder().model("Porsche").year(2021).topSpeed(170).build());
       List<Car> newCars= filterCar(carList,car -> car.getYear()>2015);
        System.out.println(newCars);

    }
    private static List<Car> filterCar(List<Car>carList, Predicate<Car> predicate){
        List<Car>result=new ArrayList<>();
        for (Car car : carList) {
            if (predicate.test(car)){
                result.add(car);
            }


        }
        return result;
    }
}
